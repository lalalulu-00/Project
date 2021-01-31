package com.android.sistempakar.Data;

public class mahasiswa {
    private String key;

    private String nama;
    private String jeniskelamin;
    private String umur;
    private String alamat;
    private String jeniskulit;
    private double persentase;
    private  String solusi;


    public mahasiswa() {

    }

    public mahasiswa(String nama, String jeniskelamin, String umur, String alamat, String jeniskulit, double persentase, String solusi) {
        this.nama = nama;
        this.jeniskelamin = jeniskelamin;
        this.umur = umur;
        this.alamat = alamat;
        this.jeniskulit = jeniskulit;
        this.persentase = persentase;
        this.solusi = solusi;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJeniskulit() {
        return jeniskulit;
    }

    public void setJeniskulit(String jeniskulit) {
        this.jeniskulit = jeniskulit;
    }

    public double getPersentase() {
        return persentase;
    }

    public void setPersentase(double persentase) {
        this.persentase = persentase;
    }

    public String getSolusi() {
        return solusi;
    }

    public void setSolusi(String solusi) {
        this.solusi = solusi;
    }
}
