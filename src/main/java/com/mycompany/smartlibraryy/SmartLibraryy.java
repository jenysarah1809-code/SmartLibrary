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
    
    // 5. METHOD OVERLOADING (Pencarian 1): Parameter String
    public static void cariKoleksi(String judul, Koleksi[] daftarKoleksi, int jumlahBuku) {
        System.out.println("Mencari buku dengan Judul: " + judul);
        boolean ditemukan = false;
        for (int i = 0; i < jumlahBuku; i++) {
            if (daftarKoleksi[i].getJudul().equalsIgnoreCase(judul)) { 
                System.out.print("- Ditemukan: ");
                daftarKoleksi[i].tampilkanInfo();
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Buku tidak ditemukan.");
    }

    // 5. METHOD OVERLOADING (Pencarian 2): Nama sama (cariKoleksi), tapi Parameter int
    public static void cariKoleksi(int tahunTerbit, Koleksi[] daftarKoleksi, int jumlahBuku) {
        System.out.println("Mencari buku dengan Tahun Terbit: " + tahunTerbit);
        boolean ditemukan = false;
        for (int i = 0; i < jumlahBuku; i++) {
            if (daftarKoleksi[i].getTahunTerbit() == tahunTerbit) { 
                System.out.print("- Ditemukan: ");
                daftarKoleksi[i].tampilkanInfo();
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Buku tidak ditemukan.");
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Koleksi[] daftarKoleksi = new Koleksi[10];
            
            int jumlahBuku = 0;
            boolean isRunning = true;
            
            System.out.println("========================================");
            System.out.println("    SELAMAT DATANG DI SMART LIBRARY!    ");
            System.out.println("          (Tahap 3 - Enkapsulasi)       ");
            System.out.println("========================================");            
            
            while(isRunning) {
                System.out.println("\nMenu Utama:");
                System.out.println("1. Tambah Buku");
                System.out.println("2. Lihat Daftar Buku");
                System.out.println("3. Cari Buku (Fitur Overloading)");
                System.out.println("4. Keluar");
                System.out.print("Pilih Menu: 1-4: ");
                
                int pilihan = scanner.nextInt();
                scanner.nextLine();
                
                switch(pilihan) {
                    case 1 -> {
                        if (jumlahBuku < daftarKoleksi.length) {
                                                 
                            System.out.println("\n-- Pilih Jenis Koleksi --");
                            System.out.println("1. Buku Cetak Fisik");
                            System.out.println("2. E-Book Digital");
                            System.out.print("Pilihan (1/2): ");

                            int jenis = scanner.nextInt();
                            scanner.nextLine();
                            
                            System.out.print("Masukkan Judul buku baru: ");
                            String judulBaru = scanner.nextLine();
                            
                            System.out.print("Masukkan Pengarang buku: ");
                            String pengarangBaru = scanner.nextLine();
                            
                            System.out.print("Masukkan Tahun Terbit: ");
                            int tahunBaru = scanner.nextInt();
                            scanner.nextLine(); // Membersihkan buffer
                            
                            Koleksi bukuBaru = new Koleksi(judulBaru, pengarangBaru, tahunBaru);
                            daftarKoleksi[jumlahBuku] = bukuBaru;
                            
                            jumlahBuku++;
                            System.out.println("Sukses! Buku berhasil ditambahkan.");
                        } else {
                            System.out.println("Maaf, kapasitas rak buku sudah penuh!");
                        }
                    }
                    case 2 -> {
                        System.out.println("\n--- Daftar Buku di Perpustakaan ---");
                        if (jumlahBuku == 0) {
                            System.out.println("Belum ada buku yang tersimpan");
                        } else {
                            for (int i = 0; i < jumlahBuku; i++) {
                                System.out.print((i + 1) + ". ");
                                daftarKoleksi[i].tampilkanInfo();
                                 daftarKoleksi[i].caraPinjam();
                                 System.out.println();
                            }
                            
                            // Memanggil Variabel STATIC dari class Koleksi
                            System.out.println("\n* Total Buku Fisik yang Terdaftar: " + Koleksi.totalKoleksiBerhasilDibuat);
                        }
                        System.out.print("Tekan Enter untuk melanjutkan...");
                        scanner.nextLine(); 
                    }
                    case 3 -> {
                        System.out.println("\n-- Fitur Cari Buku --");
                        System.out.println("1. Cari berdasarkan Judul Teks (String)");
                        System.out.println("2. Cari berdasarkan Tahun (Integer)");
                        System.out.print("Pilih (1/2): ");
                        int modeCari = scanner.nextInt();
                        scanner.nextLine(); 
                        
                        if (modeCari == 1) {
                            System.out.print("Masukkan Judul: ");
                            String kataKunci = scanner.nextLine();
                            cariKoleksi(kataKunci, daftarKoleksi, jumlahBuku);
                        } else if (modeCari == 2) {
                            System.out.print("Masukkan Tahun: ");
                            int angkaKunci = scanner.nextInt();
                            scanner.nextLine();
                            cariKoleksi(angkaKunci, daftarKoleksi, jumlahBuku);
                        } else {
                            System.out.println("Pilihan tidak valid.");
                        }
                        
                        System.out.print("Tekan Enter untuk melanjutkan...");
                        scanner.nextLine();
                    }
                    case 4 -> {
                        System.out.println("Terima kasih telah menggunakan Smart Library!");
                        isRunning = false;
                    }
                    default -> {
                        System.out.println("Pilihan tidak valid. Silahkan masukkan angka 1-4.");
                        scanner.nextLine();
                    }
                }
            }
        }
    }
}
