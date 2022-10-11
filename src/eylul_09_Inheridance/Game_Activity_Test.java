package eylul_09_Inheridance;

import java.util.Scanner;

public class Game_Activity_Test {
    public static void main(String[] args) {

        //soru: kullanicidan kac hedefle karsilastigi ve kac hedefi vurdugunu sorun.cevaba gore rankini etspit edin.

        Scanner sc=new Scanner(System.in);
        System.out.println("Kac hedefle karsilastiniz");
        int dusman=sc.nextInt();
        System.out.println("Kac hedefi vurdunuz");
        int isabet=sc.nextInt();

        Challenge challenge=new Challenge(dusman,isabet);
        System.out.println(challenge.getScore());
        System.out.println(challenge.getRank());

    }
}
