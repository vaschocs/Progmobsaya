package com.example.proteintracker.Adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proteintracker.Model.Tugas;

import com.example.proteintracker.R;

import java.util.ArrayList;
import java.util.List;

public class TugasAdapter extends RecyclerView.Adapter<TugasAdapter.ViewHolder>{
    Context context;
    ArrayList<Tugas> tugasArrayList;



    public TugasAdapter(ArrayList<Tugas>mahasiswaArrayList1){
        this.tugasArrayList = tugasArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View view = layoutInflater.inflate(R.layout.card_view_tugas,
                parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        holder.Imgx.setImageResource(tugasArrayList.get(position).getImage());
        holder.txtNama8.setText(tugasArrayList.get(position).getNama());
        holder.txtNim8.setText(tugasArrayList.get(position).getNim());
        holder.txtHobby8.setText(tugasArrayList.get(position).getHobby());
        holder.txtCita8.setText(tugasArrayList.get(position).getCita());
        holder.txtJK8.setText(tugasArrayList.get(position).getJK());
        holder.txtMotto8.setText(tugasArrayList.get(position).getMotto());

        holder.Imgx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Nama = tugasArrayList.get(position).getNama().toString();
                Toast.makeText(context, Nama + " is selected", Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return (tugasArrayList !=null)? tugasArrayList.size() :0;   //jika array mhs 0 maka akan kmbli ke ukuran array list awal
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNim8, txtNama8, txtHobby8, txtJK8, txtMotto8, txtCita8;
        ImageView Imgx;

        public ViewHolder(View view){
            super(view);
            Imgx=view.findViewById(R.id.image);
            txtNama8 = view.findViewById(R.id.txtNama);
            txtNim8 = view.findViewById(R.id.txtNim);
            txtHobby8 = view.findViewById(R.id.txtHobby);
            txtMotto8 = view.findViewById(R.id.txtMotto);
            txtCita8 = view.findViewById(R.id.txtCita);
            txtJK8=view.findViewById(R.id.txtJK);

            //Tambahan untuk id Picture
        }

    }
}
