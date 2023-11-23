/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;
/**
 *
 * @author UsEr
 */
// Interface untuk polimorfisme
interface Item {
    double getPrice();
}
public class Barang implements Item {
    private String nama;
    private double harga;
    private int jumlah;

    // Konstruktor untuk inisialisasi barang
    public Barang(String nama, double harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    Barang() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    // Metode yang diimplementasi dari interface
    @Override
    public double getPrice() {
        return harga * jumlah;
    }

    // Menampilkan informasi barang
    public void displayItem() {
        System.out.println("Nama Barang: " + nama);
        System.out.println("Harga per Barang: " + harga);
        System.out.println("Jumlah Barang: " + jumlah);
        System.out.println("Total Harga: " + getPrice());
        System.out.println("-----------------------------");
    }
     // Override metode toString untuk memberikan representasi String objek yang lebih baik
    @Override
    public String toString() {
        return "Barang{" +
                "nama='" + nama + '\'' +
                ", harga=" + harga +
                ", jumlah=" + jumlah +
                '}';
    }
}

