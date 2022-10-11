package eylul_27_Exception;

import java.util.Scanner;

public class Exception_Tutorial {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("program starts");

        for(int i=0;i<5;i++){

        System.out.println("sayi :");
        int x=scanner.nextInt();
        System.out.println("bolme :");
        int y=scanner.nextInt();
        if (y!=0){
        System.out.println("sonuc : " +(x/y));


    }else{
            System.out.println("bolme 0 olamaz");
        }
        System.out.println("finish");
}
    }
    }