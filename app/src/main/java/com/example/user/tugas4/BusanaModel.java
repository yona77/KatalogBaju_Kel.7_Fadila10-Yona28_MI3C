package com.example.user.tugas4;

public class BusanaModel {
    private int id;
    private String nama;
    private String jenis;
    private String ukuran;
    private String harga;

    public BusanaModel (int id, String nama, String jenis, String ukuran, String harga) {
        this.id = id;
        this.nama = nama;
        this.jenis = jenis;
        this.ukuran = ukuran;
        this.harga = harga;
    }
    public  int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public String getUkuran() {
        return ukuran;
    }

    public String getHarga() {
        return harga;
    }
}
