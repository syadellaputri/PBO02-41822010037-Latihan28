/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package app.pbo02.latihan28;
import java.util.Scanner;

/**
 *
 @author DelDel
 * Nama : Syadella Putri
 * NIM  : 41822010037
 * Nama : Anastasya Azami
 * NIM  : 41822010081
 */
public class PBO0241822010037Latihan28 {

    public static void main(String[] args) {
        System.out.println("FOrmat Latihan PBO");
        
        System.out.println("====PROGRAM MENGGANTI KATA====");
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan kalimat: ");
            String kalimat = input.nextLine();
            
            System.out.print("Ganti kata: ");
            String kataLama = input.next();
            
            System.out.print("Menjadi kata: ");
            String kataBaru = input.next();
            
            // Ganti semua kemunculan kata lama dengan kata baru dalam kalimat
            String kalimatBaru = kalimat.replace(kataLama, kataBaru);
            
            System.out.println("Kalimat baru: " + kalimatBaru);
        }
    }
}
