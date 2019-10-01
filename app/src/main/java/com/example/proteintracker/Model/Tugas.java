package com.example.proteintracker.Model;

import android.media.Image;
import android.widget.ImageView;

public class Tugas {
    private String nama;
    private String nim;
    private String motto;
    private String JK;
    private String Hobby;
    private String Cita;
    private int Image;

    public Tugas(String nama, String nim,  String JK, String Hobby, String Cita, String motto, int Image) {
        this.nama = nama;
        this.nim = nim;
        this.JK = JK;
        this.Hobby =Hobby;
        this.Cita = Cita;
        this.motto = motto;
        this.Image = Image;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getImage(){
        return Image;
    }
    public void setImage(int imageResource) {
        this.Image = Image;
    }

    public String getNim() {
        return nim;
    }
    public void setNim8(String nim8) {
        this.nim = nim8;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public String getMotto() {
        return motto;
    }

    public void setJK(String JK) {
        this.JK = JK;
    }

    public String getJK() {
        return JK;
    }

    public void setCita(String cita) {
        this.Cita = Cita;
    }

    public String getCita() {
        return Cita;
    }

    public void setHobby8(String hobby) {
        this.Hobby = hobby;
    }

    public String getHobby() {
        return Hobby;
    }


}