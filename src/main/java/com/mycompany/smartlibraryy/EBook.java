/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartlibraryy;

/**
 *
 * @author JENY SARAH C SILABAN
 */
public class EBook extends Koleksi{
    private int ukuranFileMB;

    public EBook(String judul, String pengarang, int tahunTerbit, int ukuranFileMB) {
        super(judul, pengarang, tahunTerbit);
        this.ukuranFileMB = ukuranFileMB;
    }
    
    @Override
    public void tampilkanInfo(){
        System.out.printf("[EBook] Judul: %-15s | Pengarang: %-10s | Tahun: %d | Ukuran: %d MB%n", this.judul, this.pengarang, this.tahunTerbit, this.ukuranFileMB);
    }
    @Override
    public void caraPinjam(){
        System.out.println("-> Info Pinjam: EBook dipinjam dengan cara di-download melalui aplikasi/situs web.");
    }
}
