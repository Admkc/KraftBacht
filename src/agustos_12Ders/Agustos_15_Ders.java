package agustos_12Ders;

import java.util.Scanner;

public class Agustos_15_Ders {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
//        System.out.println(" lutfen bir sayi giriniz");
 //       int sayi=scan.nextInt();
 // Ornek1      System.out.println(" basamak sayisi : " +basamakSayisi(sayi));
 // ornek 2      System.out.println(mathPow(54,12));
 //   ornek3          armstrong(100,999);
 //       fibonacci(12);
        System.out.println("ebob ="  +ebob(12,20));

    }
    /*       Ornek1: Kullanicidan aldiginiz sayinin kac basamakli oldugunu bulan metodu yazınız

        public static int basamakSayisi(int sayi){
            int basamak=0;
            while(sayi>0){
                sayi/=10;
                basamak++;     *************sor***
            }
            return basamak;
        }
        ornek; kullanicidan 2 sayi alın, ilk sayi taban, 2. sayi ust olsun
            mathPow metodu olusturun

    public static int mathPow(int taban,int us){
        int sonuc=1;
        for(int i=0;i<us;i++){
            sonuc*=taban;
        }
        return sonuc;

        ornek 3
        1 ile 999 arasındaki tüm Armstrong sayılarını yazdıran bir program yazın.
Sayının her basamağının küplerinin toplamı sayının kendisine eşitse bu sayı Armstrong sayısı olarak adlandırılır.

    public static void armstrong(int start,int end){
        for(int i=start;i<=end;i++){
            int x,y,z,sonuc;
            x=i/100;  //1
            y=i%100/10;
            z=i%10;
            sonuc=x*x*x+y*y*y+z*z*z;
            if(i==sonuc){
                System.out.println(sonuc+ " sonuc " );

            }

        }
    }ornek 4 Kullanıcı tarafından girilen n terimli Fibonacci dizisini yazdıran bir program yazın:
            0 1 1 2 3 5 8 13 24 .....

    public static void fibonacci(int adet){   //tekrar bak******
        int x=0,y=1;
        System.out.print(x+" " +y);

        for(int i=2;i<adet;i++){
            int z=y+x;
            System.out.print(" " +z);
            x=y;
            y=z;

        }
    }
    ornek:
    Kullanıcıdan 2 sayı alın ve bu iki sayının en büyük ortak bölenini ekrana yazdırı.1 ile 7 sonuc 1 6-12(6)

     */
    public static int ebob(int x,int y){
        int sonuc=1;
        int minimum=minimumSayi(x,y);
        for(int i=1;i<=minimum;i++){
            if(x%i==0 && y%i==0){
                sonuc=i;
            }
        }

        return sonuc;
    }

    public static int minimumSayi(int x, int y) {
        if(x>=y){
            return y;
        }else{
            return x;
        }
    }


}





