package eylul_28_Collection;

import java.util.Scanner;

public class Ders {
    public static void main(String[] args) {


        veriAlVeYazdir();
    }
    public static void veriAlVeYazdir(){
        Scanner sc=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int x=sc.nextInt();
        int[] sarry=new int[x];
        for (int i=0;i<sarry.length;i++){
            System.out.print(" sayi");
            sarry[i]=sc.nextInt();

        }
        for (int i=0;i<sarry.length;i++){
            System.out.print(sarry[i]+ " ");

        }

    }
}
