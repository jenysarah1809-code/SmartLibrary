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
    
    public static void cariBuku(String judul, Buku[] daftarBuku, int jumlahBuku){
        System.out.println("Mencari buku dengan Judul: " + judul);
        boolean ditemukan = false;
        for (int i = 0; i < jumlahBuku; i++){
            if (daftarBuku[i].getJudul().equalsIgnoreCase(judul)){
                System.out.print("- ditemukan: ");
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Buku tidak ditemukan.");
    }
    
    public static void cariBuku(int tahunTerbit, Buku[] daftarBuku, int jumlahBuku){
        System.out.println("Mencari buku dengan Tahun Terbit: " + tahunTerbit);
        boolean ditemukan = false;
        for (int i = 0; i < jumlahBuku; i++){
            if (daftarBuku[i].getTahunTerbit() == tahunTerbit){
                System.out.print("- ditemukan: ");
                daftarBuku[i].tampilkanInfoBuku();
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Buku tidak ditemukan.");
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        Buku[] daftarBuku = new Buku[10];
        
        int jumlahBuku = 0;
        boolean isRunning = true;
        
        System.out.println("=========================================");
        System.out.println("     Selamat Datang di Smart Library     ");
        System.out.println("=========================================");
        
        while (isRunning){
            System.out.println("\nMenu Utama:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Daftar Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Keluar");
            System.out.println("Pilih Menu (1-4): ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine();
            
            switch(pilihan){
                case 1:
                    if (jumlahBuku < daftarBuku.length){
                        System.out.println("\n-- Form Tambah Buku --");
                        
                        System.out.print("Masukan judul buku baru: ");
                        String judulBaru = scanner.nextLine();
                        
                        System.out.print("Masukan Pengarang buku: ");
                        String pengarangBaru = scanner.nextLine();
                        
                        System.out.print("Masukan Tahun Terbit: ");
                        int tahunBaru = scanner.nextInt();
                        scanner.nextLine();
                        
                        Buku bukuBaru = new Buku(judulBaru, pengarangBaru, tahunBaru);
                        
                        daftarBuku[jumlahBuku] = bukuBaru;
                        
                        jumlahBuku++;
                        System.out.println("Sukses! Objek buku berhasil diciptakan dan ditambahkan ke rak.");
                    } else {
                        System.out.println("Maaf, kapasitas rak buku sudah penuh!");
                    }
                    scanner.nextLine();
                break;
                case 2:
                    System.out.println("\n--- Daftar Buku di Perpustakaan ---");
                    if (jumlahBuku == 0){
                        System.out.println("Belum ada buku yang tersimpan");
                    } else {
                        for (int i = 0; i < jumlahBuku; i++){
                            System.out.printf((i + 1) + ". ");
                            
                            daftarBuku[i].tampilkanInfoBuku();
                        }
                        System.out.println("\n* Total Buku Fisik yang Terdaftar:" + Buku.totalBukuBerhasilDibuat);
                    }
                    System.out.print("Tekan Enter untuk melanjutkan...");
                    scanner.nextLine();
                break;
                case 3:
                    System.out.println("\n-- Fitur Cari Buku --");
                    System.out.println("\1. Cari berdasarkan Judul");
                    System.out.println("2. Cari berdasarkan Tahun");
                    System.out.println("Pilih (1/2): ");
                    int modeCari = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (modeCari == 1){
                        System.out.print("Masukan Judul: ");
                        String kataKunci = scanner.nextLine();
                        cariBuku(kataKunci, daftarBuku, jumlahBuku);
                    } else if (modeCari == 2){
                        System.out.print("Masukan Tahun: ");
                        int angkaKunci = scanner.nextInt();
                        scanner.nextInt();
                        cariBuku(angkaKunci, daftarBuku, jumlahBuku);
                    } else {
                        System.out.println("Pilihan tidak Valid.");
                    }
                    System.out.print("Tekan Enter untuk melanjutkan...");
                    scanner.nextLine();
                break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan Smart Library!");
                    isRunning = false;
                
            }
        }
    }
}
