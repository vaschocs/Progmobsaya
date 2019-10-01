package com.example.proteintracker.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proteintracker.R;
import com.example.proteintracker.Model.Mahasiswa;

import java.util.ArrayList;
import java.util.List;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.ViewHolder>{
    // Context context;
    ArrayList<Mahasiswa> mahasiswaArrayList;
    //Array tambahan untuk picture
    // public static List<String> ic = new ArrayList<String>();


    public MahasiswaAdapter(ArrayList<Mahasiswa>mahasiswaArrayList){
        this.mahasiswaArrayList = mahasiswaArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View view = layoutInflater.inflate(R.layout.card_view_mahasiswa,
                parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.txtNama.setText(mahasiswaArrayList.get(position).getNama());
        holder.txtNim.setText(mahasiswaArrayList.get(position).getNpm());
        holder.txtNoHp.setText(mahasiswaArrayList.get(position).getNohp());


    }

    @Override
    public int getItemCount() {
        return (mahasiswaArrayList !=null)? mahasiswaArrayList.size() :0;   //jika array mahasiswa 0 maka akan kmbli ke ukuran array list awal
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNim, txtNama, txtNoHp;


        public ViewHolder(View view){
            super(view);
            txtNama = view.findViewById(R.id.txt_nama_mahasiswa);
            txtNim = view.findViewById(R.id.txt_npm_mahasiswa);
            txtNoHp = view.findViewById(R.id.txt_nohp_mahasiswa);
            //Tambahan untuk id Picture
        }

    }
}