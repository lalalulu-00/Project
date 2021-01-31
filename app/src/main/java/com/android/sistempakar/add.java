package com.android.sistempakar;

public class add {
    String namaId;
    String Nama;
    String Genre;

    public add(){

    }
    public add(String namaId, String Nama, String Genre){
        this.namaId = namaId;
        this.Nama = Nama;
        this.Genre = Genre;
    }

    public String getNamaId() {
        return namaId;
    }

    public String getNama() {
        return Nama;
    }

    public String getGenre() {
        return Genre;
    }
}
