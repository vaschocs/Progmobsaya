package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3FragmentActivity extends AppCompatActivity implements ProteinFragment.SendMessage {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_fragment);

        Button btnPress = findViewById(R.id.buttonTesFragment);
        btnPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ProteinFragment proteinFragment = ProteinFragment.newInstance("Hallo", "Para Progmobers");
                ft.replace(R.id.frameMain, proteinFragment); //--mereplace frame main ke protein fragment
                ft.commit();
            }
        });

    }

    @Override
    public void SendData(String Message) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Protein2Fragment protein2Fragment = Protein2Fragment.newInstance(Message," NICE Para progmobers");
        ft.replace(R.id.frameMain, protein2Fragment);
        ft.commit();
    }
}

