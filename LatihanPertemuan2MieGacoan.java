/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanpertemuan2miegacoan;

/**
 *
 * @author ELSHA
 */
import java.util.Scanner;
public class LatihanPertemuan2MieGacoan {

    public static void main(String[] args) {
        Scanner uang = new Scanner(System.in);
        System.out.println("Masukkan Nominal Uang : ");
        int money = uang.nextInt();
        
        System.out.println("Pasangan kamu lagi ga kuliah kan ? True/False : ");
        boolean tidakAdaKelasKuliah = uang.nextBoolean();
        
        if(money > 10000 && tidakAdaKelasKuliah ){
        System.out.println("Yey Makan Gacoan");
        }else{
            System.out.println("Yah GA Makan Gacoan :(");
        }
    }
}
