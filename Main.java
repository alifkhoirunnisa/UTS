/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

import java.util.Scanner;

/**
 *
 * @author UsEr
 */
public class Main {

    private static Item[] Kasir;
      public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================");
        System.out.println("Bogor Shoes");
        System.out.println("Alif Khoirun Nisa");
        System.out.println("========================");

        // Meminta input barang dari pengguna
        System.out.print("Masukkan jumlah barang: ");
        int jumlahBarang = scanner.nextInt();

        // Memastikan array items tidak null sebelum diinisialisasi
        Item[] items = null;

        // Memasukkan detail barang dari pengguna
        if (jumlahBarang > 0) {
            items = new Item[jumlahBarang];
            for (int i = 0; i < jumlahBarang; i++) {
                System.out.println("=== Barang ke-" + (i + 1) + " ===");
                System.out.print("Nama Barang: ");
                String namaBarang = scanner.next();
                System.out.print("Harga per Barang: ");
                double hargaBarang = scanner.nextDouble();
                System.out.print("Jumlah Barang: ");
                int jumlah = scanner.nextInt();

                // Membuat objek Barang dan menyimpannya dalam array
                items[i] = new Barang(namaBarang, hargaBarang, jumlah);
            }
        }

        // Membuat objek Kasir dan menampilkan total pembelian
        Kasir kasir = new Kasir(items);
        kasir.displayTotal();

        // Menampilkan pesan terima kasih
        System.out.println("Terima Kasih Atas Kunjungan Anda");

        // Menutup objek Scanner
        scanner.close();
    }
}