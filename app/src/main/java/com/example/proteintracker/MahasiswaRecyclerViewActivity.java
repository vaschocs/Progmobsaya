package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.proteintracker.Model.Tugas;
import com.example.proteintracker.Adapter.TugasAdapter;
import com.example.proteintracker.Model.Tugas;

import java.util.ArrayList;
import java.util.List;

public class MahasiswaRecyclerViewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private TugasAdapter tugasAdapter;
    private ArrayList<Tugas> tugasArrayList;
    //private List<String> ic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahasiswa_recycler_view);

        addData();

        recyclerView = findViewById(R.id.rvTugasMhs);
        tugasAdapter = new TugasAdapter (tugasArrayList);
        List<Tugas> tugasList;


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MahasiswaRecyclerViewActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(tugasAdapter);
    }
    private void addData(){
        tugasArrayList = new ArrayList<>();
        tugasArrayList.add(new Tugas("Monica","72170133","Perempuan","Main Game","menjadi lebih berguna bagi keluarga","Don't Judge",R.drawable.mon));
        tugasArrayList.add(new Tugas("Aryawan","72170115","Laki-Laki","Barongsay dan Liong ","teruslah berproses" , "meski itu berat",R.drawable.ary));
        //tugasArrayList.add(new Tugas("Evasu","72170091","Perempuan","Main Game","Animal Rescue","Kalo laper ya makan, kalo ngantuk ya tidur, kalo kangen yauda , dia uda sama yang lain",R.drawable.eva));
        tugasArrayList.add(new Tugas("Candra","72170139","Laki-Laki","Basket","Pebisnis","Selalu Bersyukur",R.drawable.chan));
        tugasArrayList.add(new Tugas("Beni","72170177","Laki-Laki","Basket, Music","Membanggakan orang tua","Just do it",R.drawable.ben));
//
    }
}