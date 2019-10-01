package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.proteintracker.Adapter.MhsInclassAdapter;
import com.example.proteintracker.Model.MhsInclass;

import java.util.ArrayList;

public class InClassRecyclerViewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MhsInclassAdapter inclassAdapter;
    private ArrayList<MhsInclass> mhsInclassArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_class_recycler_view);
        addData();
        recyclerView = findViewById(R.id.rvMahasiswaInClass);
        inclassAdapter = new MhsInclassAdapter(mhsInclassArrayList);

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(InClassRecyclerViewActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(inclassAdapter);
    }

    private void addData(){
        mhsInclassArrayList = new ArrayList<>();
        mhsInclassArrayList.add(new MhsInclass(R.mipmap.ic_launcher_in_class_round,"Scorpio Milo",
                "1414370309", "123456789"));
        mhsInclassArrayList.add(new MhsInclass(R.mipmap.ic_launcher_in_class,"Sagitarius Aiolos",
                "1214234560", "987654321"));
        mhsInclassArrayList.add(new MhsInclass(R.mipmap.ic_launcher_in_class_round,"Libra Dohko",
                "1214230345", "987648765"));

    }
}





