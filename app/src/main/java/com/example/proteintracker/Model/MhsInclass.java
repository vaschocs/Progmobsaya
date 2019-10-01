package com.example.proteintracker.Model;

public class MhsInclass {
    private int AndroidImage;
    private String namaInclass;
    private String npmInclass;
    private String noHpInclass;

    public MhsInclass(int androidImage, String namaInclass, String nimInclass, String noHpInclass) {
        AndroidImage = androidImage;
        this.namaInclass = namaInclass;
        this.npmInclass = npmInclass;
        this.noHpInclass = noHpInclass;
    }

    public int getAndroidImage() {
        return AndroidImage;
    }

    public void setAndroidImage(int androidImage) {
        AndroidImage = androidImage;
    }

    public String getNamaInclass() {
        return namaInclass;
    }

    public void setNamaInclass(String namaInclass) {
        this.namaInclass = namaInclass;
    }

    public String getNimInclass() {
        return npmInclass;
    }

    public void setNpmInclass(String nimInclass) {
        this.npmInclass = npmInclass;
    }

    public String getNoHpInclass() {
        return noHpInclass;
    }

    public void setNoHpInclass(String noHpInclass) {
        this.noHpInclass = noHpInclass;
    }
}