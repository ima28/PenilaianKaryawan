package com.example.sistempenilaiankaryawan.Model;

public class Nilai {
    public int TanggungJawab;
    public int Kedisiplinan;
    public int Kerapian;
    public int Komunikasi;

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    private int nama;
    private String gambar;
    private int rating;

    public Nilai(int nama, String gambar, int rating) {
        this.nama = nama;
        this.gambar = gambar;
        this.rating = rating;
    }

    public Nilai(String nama) {
    }

    public int getNama() {
        return nama;
    }

    public void setNama(int nama) {
        this.nama = nama;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}