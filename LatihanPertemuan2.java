/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanpertemuan2;

/**
 *
 * @author ELSHA
 */
import java.util.Scanner;
public class LatihanPertemuan2 {

    public static void main(String[] args) {
       Scanner nilai = new Scanner(System.in);
       
       System.out.println("Masukkan 3 Angka Negatif : ");
       int angka1 = nilai.nextInt();
       int angka2 = nilai.nextInt();
       int angka3 = nilai.nextInt();
       
       int jumlah = angka1 + angka2 + angka3;
       int kurang = angka1 - angka2 - angka3;
       int kali = angka1 * angka2 * angka3;
       double bagi = (double)angka1 / angka2 / angka3;
       
       System.out.println("Hasil Penjumlahan : "+jumlah);
       System.out.println("Hasil Pengurangan : "+kurang);
       System.out.println("Hasil Perkalian : "+kali);
       System.out.println("Hasil Pembagian : "+bagi);
       
    }
}
