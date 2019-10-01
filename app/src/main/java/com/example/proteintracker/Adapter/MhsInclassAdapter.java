package com.example.proteintracker.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proteintracker.Model.MhsInclass;
import com.example.proteintracker.R;

import java.util.ArrayList;

public class MhsInclassAdapter extends RecyclerView.Adapter<MhsInclassAdapter.ViewHolder>{
    public MhsInclassAdapter(ArrayList<MhsInclass> inclassArrayList) {
        this.inclassArrayList = inclassArrayList;
    }
    private ArrayList<MhsInclass> inclassArrayList;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view =layoutInflater.inflate(R.layout.card_view_mhs_inclass,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageViewInclass.setImageResource(inclassArrayList.get(position).getAndroidImage());
        holder.txtNamaInclass.setText(inclassArrayList.get(position).getNamaInclass());
        holder.txtNoHpInclass.setText(inclassArrayList.get(position).getNoHpInclass());
        holder.txtNimInclass.setText(inclassArrayList.get(position).getNimInclass());
    }

    @Override
    public int getItemCount() {
        return (inclassArrayList !=null)?inclassArrayList.size():0;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageViewInclass;
        private TextView txtNamaInclass, txtNimInclass, txtNoHpInclass;
        public ViewHolder(View view){
            super(view);
            imageViewInclass = view.findViewById(R.id.image_inclass);
            txtNamaInclass= view.findViewById(R.id.txt_nama_mahasiswa_inclass);
            txtNimInclass=view.findViewById(R.id.txt_npm_mahasiswa_inclass);
            txtNoHpInclass=view.findViewById(R.id.txt_noHp_mahasiswa_inclass);
        }

    }
}
