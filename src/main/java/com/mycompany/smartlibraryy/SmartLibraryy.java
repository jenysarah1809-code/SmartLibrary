/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.smartlibraryy;
import java.util.Scanner;

/**
 *
 * @author JENY SARAH C SILABAN
 */
public class SmartLibraryy {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        String[] daftarBuku = new String[10];
        
        int jumlahBuku = 0;
        boolean isRunning = true;
        
        System.out.println("=========================================");
        System.out.println("     Selamat Datang di Smart Library     ");
        System.out.println("=========================================");
        
        while (isRunning){
            System.out.println("\nMenu Utama:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Daftar Buku");
            System.out.println("3. Keluar");
            System.out.println("Pilih Menu (1-3): ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine();
            
            switch(pilihan){
                case 1:
                    if (jumlahBuku < daftarBuku.length){
                        System.out.print("Masukan judul buku baru: ");
                        String judulBaru = scanner.nextLine();
                        
                        daftarBuku[jumlahBuku] = judulBaru;
                        
                        jumlahBuku++;
                        System.out.println("Sukses! Buku berhasil ditambahkan.");
                    } else {
                        System.out.println("Maaf, kapasitas rak buku sudah penuh!");
                    }
                    break;
                case 2:
                    System.out.println("\n--- Daftar Buku di Perpustakaan ---");
                    if (jumlahBuku == 0){
                        System.out.println("Belum ada buku yang tersimpan");
                    } else {
                        for (int i = 0; i < jumlahBuku; i++){
                            System.out.printf("%d. Judul: %s%n", (i + 1), daftarBuku[i]);
                        }
                    }
                    break;
                case 3: 
                    System.out.println("Terima kasih telah menggunakan Smart Library!");
                    isRunning = false;
                    break;
                default: 
                    System.out.println("Pilihan tidak valid. silahkan masukan angka 1-3.");
                    break;
            }
        }
        scanner.close();
    }
}
