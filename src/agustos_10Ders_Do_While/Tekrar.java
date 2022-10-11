package agustos_10Ders_Do_While;

import java.util.Random;
import java.util.Scanner;

public class Tekrar {
    public static void main(String[] args){

 /*     ORNEK


  Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.
111111
111111
111111
111111
111111
111111


  for(int i=0;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(1);
        }
            System.out.println();

    }
Örnek: Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.(tek yıldız kulanarak)
******
******
******
******



        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
    }
            System.out.println();
    }

        Örnek: Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.
        1
        12
        123
        1234
        12345
        123456

       int k=0;
       for(int i=0;i<5;i++){
           for(int j=0;j<=i;j++){
               k++;
               System.out.print(k);
           }
           System.out.println();
       }


        Örnek: Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.
        1
        22
        333
        4444
        55555
        666666
        for(int i=1 ;i<7;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
    }


        Örnek: Kullanıcıdan devamlı sayı isteyen ve bu sayıları toplayan
        programı yazınız. Kullanıcı 0 girdiğinde programdan çıkması
        sağlanmalıdır.

        Scanner scan=new Scanner(System.in);
        do{
            System.out.println("toplam 0 ise cikis olacak");
            System.out.println("1.sayi");
            int a=scan.nextInt();
            System.out.println("2.sayi");
            int b=scan.nextInt();
            System.out.println("toplam = "+(a+b));
            if(a+b==0){
                break;
            }
        }while(true);


        Random sınıfını kullanarak bilgisayarınızdan 0 ile 50 arasında
        random bir sayı almasını sağlayın ve bu sayıyı 5 defa deneme
        yaparak bulmaya çalışın. Bu esnada bilgisayar aşağı yukarı şeklinde
        size ipucu versin.
*/
        Scanner scan=new Scanner(System.in);
        Random random=new Random();
        int i=random.nextInt(50);
        System.out.println(i);
        System.out.println("tuttugum sayiyiy bul");
        int j=1;
        do{
            System.out.println(j+ "Tahmin");
            int tahmin=scan.nextInt();
            if(tahmin==i){
                System.out.println("tebrikler sayiyi buldun");
                break;
            }
            else if(tahmin>i){
                System.out.println("asagi");
            }
            else{
                System.out.println("yukari");
            }
            j++;
        }while(j<6);

        System.out.println("tuttugum sayi" +i);


        }


}
