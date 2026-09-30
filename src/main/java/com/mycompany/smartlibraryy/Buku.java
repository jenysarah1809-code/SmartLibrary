/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartlibraryy;

/**
 *
 * @author JENY SARAH C SILABAN
 */
public class Buku {
    String judul;
    String pengarang;
    int tahunTerbit;
    
    public Buku(String judulBuku, String pengarangBuku, int tahunBuku){
        judul = judulBuku;
        pengarang = pengarangBuku;
        tahunTerbit = tahunBuku;
    }
    
    public void tampilkanInfoBuku(){
        System.out.printf("Judul: %-20s | Pengarang: %-15s | Tahun: %d%n", judul, pengarang, tahunTerbit);
    }
}
