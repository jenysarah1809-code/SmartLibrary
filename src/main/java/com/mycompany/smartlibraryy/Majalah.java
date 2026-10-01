/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.smartlibraryy;

/**
 *
 * @author JENY SARAH C SILABAN
 */
public class Majalah extends Koleksi{
    private String edisi;

    public Majalah(String judul, String pengarang, int tahunTerbit, String edisi) {
        super(judul, pengarang, tahunTerbit);
        this.edisi = edisi;
        
    }
    
    @Override
    public void tampilkanInfo(){
        System.out.printf("[Majalah] Judul: %-15s |Penerbit: %-10s| Tahun:%d | Edisi : %s%n",
                this.judul, this.pengarang, this.tahunTerbit, this.edisi);
 }
 
    @Override
    public void caraPinjam(){
        System.out.println("info pinjam -> Maajalah terbitan terbareu hanya dapat dibaca di ruang baca untuk tidak dibawa pulang");
    }  
}
