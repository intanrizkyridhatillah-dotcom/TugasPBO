/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float panjang = 2;
        float lebar = 5;
        float luas = panjang * lebar;
        System.out.println("Program > 1");
        System.out.println("Luas : " + luas);
        
        double jari;
        System.out.println("Program > 2");
        System.out.println("Masukkan jari : ");
        jari = input.nextDouble();
        
        double PI = 3.14;
        double luas1 = PI * (jari*2);
        double keliling = 2 *PI * jari;
        System.out.println("Luas : "+ luas1 + " Keliling : "+ keliling);
        
        int jam = 0, menit, detik, totdet;
        System.out.println("Program > 3"); 
        System.out.println("Masukkan jam : ");
        jari = input.nextDouble();
        
        System.out.println("Masukkan menit : ");
        menit = input.nextInt();
        
        System.out.println("Masukkan detik : ");
        detik = input.nextInt();
        
        totdet = ( jam * 3600 ) + ( menit * 60 ) + detik;
        
        System.out.println("Totdet : " + totdet);
    }
}
