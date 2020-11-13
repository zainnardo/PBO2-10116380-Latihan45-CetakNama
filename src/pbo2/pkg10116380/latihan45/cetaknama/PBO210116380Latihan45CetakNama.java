/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan45.cetaknama;

import java.util.Scanner;

/**
 * @author 
 * Nama  : Zain Achmad Rizqullah
 * Nim   : 10116380
 * Kelas : PBO2
 * Deskripsi Program : program ini tentang mencetak nama seseorang
 */
public class PBO210116380Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner sc1 = new Scanner (System.in);
        Scanner sc2 = new Scanner (System.in);
        Printer ptr = new Printer ();
        
        System.out.println("===== Aplikasi Pencetak Nama=====");    
        System.out.print("Masukkan nama anda : ");
        ptr.setNama(sc1.nextLine());
        
        System.out.print("Mau cetak nama berapa kali? : ");
        ptr.setJmlCetak(sc2.nextInt());
        
        System.out.println("Nama Anda : " + ptr.getNama());
        ptr.cetak(ptr.getJmlCetak(), ptr.getNama());
        
    }
    
}
