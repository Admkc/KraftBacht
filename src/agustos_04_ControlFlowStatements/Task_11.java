package agustos_04_ControlFlowStatements;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {

        /*
        Konsoldan sayı alarak bir sayı tahmin programı
        yazın. Nested if yapısı kullanın. Tahmin sayıdan
        küçük ama yakınsa(sayının yarı değerinden daha yakın) veya
        çok küçükse uygun bir mesaj versin. Tahmin sayıdan
        büyük, ancak yakın veya uzak ise buna uygun
        mesajlar versin. Elbette isabetli tahmin de bir tebrik
        mesajı yazdırın.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Pozitif bir sayı tahmin et");
        int sayı = 120;
        int tahmin = sc.nextInt();

        if (tahmin < sayı) {
            if (tahmin > sayı / 2) {
                System.out.println("yalaştın biraz daha buyk bir sayı sğyle");
            } else if (tahmin < sayı / 2) {
                System.out.println("yakın değilsin daha buyuk bir sayı syle");
            } else {
                System.out.println("pek yakın sayılmazsın");
            }


        } else if (tahmin > sayı) {
            if (tahmin < sayı + sayı / 2) {
                System.out.println("Tahmininiz yakın ancak daha kucuk bir sayı soylemelisiniz");
            } else if (tahmin > sayı + sayı / 2) {
                System.out.println("çok buyuk bir sayı soyledin daha kucuk bir tahminde bulun");

            } else {
                System.out.println("pek yakın değilsin biraz daha kucuk bir sayı soyle");
            }

        } else {
            System.out.println("Tahmininiz dogrudur TEBRİKLER");
        }


        System.out.println("-----------------------------------");
    }
}


