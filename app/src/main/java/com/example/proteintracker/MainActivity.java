package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView)findViewById(R.id.mainActivityTextView);
        textView.setText(R.string.test_untuk_update_view);

        Button helpBtn = (Button)findViewById(R.id.helpButton);
        helpBtn.setOnClickListener(helpButtonListener);


        Button layoutButton = (Button)findViewById(R.id.layoutButton);
        Button buttonMahasiswa = (Button)findViewById(R.id.mahasiswaButton);;
        Button fragmentButton = (Button)findViewById(R.id.fragmentButton);
        Button appButton = (Button)findViewById(R.id.appButton);



        layoutButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }
        });

        fragmentButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this,Main3FragmentActivity.class);
                startActivity(i);
            }
        });

        appButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this,ProteinTrackerAppActivity.class);
                startActivity(i);
            }
        });

        Button myBtn = (Button)findViewById(R.id.button1);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText myEditText = (EditText)findViewById(R.id.editText1);
                Log.d("Proteintracker",myEditText.getText().toString());
            }
        });
    }


    private View.OnClickListener myBtnClickListener = new View.OnClickListener()
    {
        //   myBtn.setOnClickListener(myBtnClickListener);
        @Override
        public void onClick(View view) {
            EditText myEditText = (EditText)findViewById(R.id.editText1);
            Log.d("Proteintracker",myEditText.getText().toString());
        }
    };
    private View.OnClickListener helpButtonListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,HelpActivity.class); //utk pindah kelas
            Bundle b = new Bundle(); // bundle-- utk memasukkan daata di intent
            EditText myEditText = (EditText)findViewById(R.id.editText1);
            b.putString("helpString",myEditText.getText().toString());
            intent.putExtras(b);
            startActivity(intent);

        }

    };





    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("abc","test");
        super.onSaveInstanceState(outState);
    }


}
