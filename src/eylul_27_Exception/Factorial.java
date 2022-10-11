package eylul_27_Exception;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

      // soru  kullanıcıdan bir sayı alın ve bu sayının faktoriyelini alarak
        // ekrana sonucu yazdırın

   //     System.out.println(factorial(5));
        Scanner scanner=new Scanner(System.in);
        System.out.println("sayi gir");
        int sayi=scanner.nextInt();


        System.out.println(factorial2(sayi));

    }

    public static int factorial2(int a){      // en iyi cozum
        int result=1;

        try {
            if (a<0) throw new Exception("0 dan kucuk olmaz");
            for (int i=1;i<=a;i++){
                result*=i;
            }


        } catch (Exception e) {
            System.out.println(e.getCause());
            return -1;
        }
        return result;

    }


    public static int factorial(int n){   //cozum
        int result=1;
        if (n<0){
            return -1;
        }else {
            for (int i=1;i<=n;i++){
                result*=i;

            }
        }
        return result;


    }
}
