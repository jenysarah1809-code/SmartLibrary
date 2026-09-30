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
    
    public static int totalBukuBerhasilDibuat = 0;
    
    public Buku(String judulBuku, String pengarangBuku, int tahunBuku){
        judul = judulBuku;
        pengarang = pengarangBuku;
        tahunTerbit = tahunBuku;
        
        totalBukuBerhasilDibuat++;
    }
    
    public String getJudul(){
        return this.judul;
    }
    public void setJudul(String judul){
        this.judul = judul;
    }
    public String getPengarang(){
        return this.pengarang;
    }
    public void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }
    public int getTahunTerbit(){
        return this.tahunTerbit;
    }
    public void setTahunTerbit(int tahunTerbit){
        if (tahunTerbit > 0){
            this.tahunTerbit = tahunTerbit;
        } else {
            System.out.println("Tahun terbit tidak valid!");
        }
    }
    public void tampilkanInfoBuku(){
        System.out.printf("Judul: %-20s | Pengarang: %-15s | Tahun: %d%n", judul, pengarang, tahunTerbit);
    }
}
