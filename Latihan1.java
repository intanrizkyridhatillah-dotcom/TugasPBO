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
public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int tahun;
        System.out.print("Masukkan Tahun (1909 - 2024) : ");
        tahun = input.nextInt();
        
        if(tahun % 4 == 0){
            System.out.print(tahun + " Adalah tahun kabisat");
        }else{
            System.out.print(tahun + " Adalah Bukan tahun kabisat");
        }
    } 
}