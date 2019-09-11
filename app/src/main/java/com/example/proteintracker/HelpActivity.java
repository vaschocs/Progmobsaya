package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

//        TextView myTextView = new TextView(this);
        TextView textView = findViewById(R.id.textView1);
        textView.setText("hehe");

        Bundle b = getIntent().getExtras();
        String tmpString = b.getString("helpString");

        textView.setText(tmpString);
    }
}