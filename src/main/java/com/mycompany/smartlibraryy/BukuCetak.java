/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartlibraryy;

/**
 *
 * @author JENY SARAH C SILABAN
 */
public class BukuCetak extends Koleksi {
    private int jumlahHalaman;

    public BukuCetak(String judul, String pengarang, int tahunTerbit, int halaman) {
        super(judul, pengarang, tahunTerbit);
        this.jumlahHalaman = jumlahHalaman;
    }
    
    @Override
    public void tampilkanInfo(){
        System.out.printf("[Buku Cetak] Judul: %-15s | Pengarang: %-10s | Tahun: %d | Halaman: %d Hal%n", this.judul, this.pengarang, this.tahunTerbit, this.jumlahHalaman);
    }
    @Override
    public void caraPinjam(){
        System.out.println("-> Info Pinjam: Buku Cetak wajib diambil fisik bukunya di meja administrasi perpustakaan.");
    }
}
