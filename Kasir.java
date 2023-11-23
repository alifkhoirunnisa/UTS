/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author UsEr
 */
public class Kasir {
    private Item[] items;

    // Konstruktor untuk inisialisasi transaksi
    public  Kasir(Item[] items) {
        this.items = items;
    }

    Kasir() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    // Metode untuk menampilkan total pembelian
    public void displayTotal() {
        double total = 0;
        System.out.println("===== Struk Pembelian =====");
        for (var item : items) {
            if (item != null) {
                total += item.getPrice();
            }
        }
        System.out.println("Total Pembelian: " + total);
        System.out.println("===========================");
    }
}
        
    


