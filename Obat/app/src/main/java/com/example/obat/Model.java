package com.example.obat;

public class Model {
    //variales
    String kode, nama, satuan, jumlah, hrg, exp, addedTime, updatedTime;
    byte[] gambar;

    //Buat konstruktor (Alt + Insert)
    public Model(String kode, String nama, String satuan, String jumlah, String exp, String hrg, byte[] gambar, String addedTime, String updatedTime) {
        this.kode = kode;
        this.nama = nama;
        this.satuan = satuan;
        this.jumlah = jumlah;
        this.exp = exp;
        this.hrg = hrg;
        this.gambar = gambar;
        this.addedTime = addedTime;
        this.updatedTime = updatedTime;
    }

    //Buat Get dan Set

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getHrg() {
        return hrg;
    }

    public void setHrg(String hrg) {
        this.hrg = hrg;
    }

    public byte[] getGambar() {
        return gambar;
    }

    public void setGambar(byte[] gambar) {
        this.gambar = gambar;
    }

    public String getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(String addedTime) {
        this.addedTime = addedTime;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }
}
