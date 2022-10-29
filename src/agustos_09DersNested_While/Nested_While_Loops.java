package agustos_09DersNested_While;

import java.util.Scanner;

public class Nested_While_Loops {
    public static void main(String[] args) {
      /*  Örnek: a dan z ye kadar olan harfleri ekrana yazdırın


        for(char harf='A';harf<='Z';harf++){
            System.out.print("  " +harf);
        }

        Örnek: 9 sayısının çarpım tablosunu yazdırınız.
        9 * 1 = 9
        9 * 2 = 18
        9 * 3 = 27
        for(int i=0;i<=9;i++){

        Örnek: Şifre tanımlayın ve kullanıcıya ekrandan 3 defa şifreyi
        girmesini isteyin şifreyi bulursa «tebrikler şifre doğru» bulamaz ise
        şifre yanlış ikazı versin.

        Scanner scan=new Scanner(System.in);
        String kelime="harun";
        for(int i=0;i<3;i++){
            System.out.println("lutfen sifreyi giriniz");
            String sifre=scan.nextLine();
            if(sifre.equals(kelime)){
                System.out.println("afferin");
            }else{
                System.out.println(" you lost ");
            }
        }

        Örnek: Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.
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

//        Örnek: Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.(tek yıldız
//        kulanarak)
//*
//**
//***
//****
//*****
//******


        for(int i=0;i<6;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        Örnek: Ekran çıktısı aşağıdaki gibi olacak kodu yazınız.(tek yıldız
        kulanarak)
******
*****
****
***
**
*

        for(int i=6;i>0;i--){
            for(int j=0;j<i;j++){
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

        for(int i=1;i<7;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
    }
        Örnek: ekrana 20 adet alt alta «merhaba dünya» yazdırın.

        int i=0;
        while(i<20){
            i++;
            System.out.println(i+ " merhaba dunya");

            Örnek: 0 dan 100 e kadar olan sayıları ekrana yazdırın.

        int i=0;
        while(i<100){
            i++;
            System.out.print(i+" ");

            Örnek: 0 dan 100 e kadar olan sayıları tersten ekrana yazdırın. (99
            98 97 vs)
    }

        int i=100;
        while(i>0){
            i--;
            System.out.print(i+" ");
    }
        Örnek: 0 dan 100 e kadar olan çift sayıları ekrana yazdırın.

        int i=0;
        while(i<=100){
            if(i%2==0){
                System.out.print(i+" ");
                i++;
        }
//    }Örnek: 10 ile 1000 arasında olan 10 a tam bölünebilen tüm sayıları
//    ekrana yazdırın.

  //      int i=0;
   //     while(i<=1000){
   //             System.out.print(i+" ");
    //            i+=10;
    }Örnek: 8 faktöriyel’in sonucu nedir? (6!=6*5*4*3*2*1)

        int i=1,sonuc=1;
        while(i<=8){
            sonuc*=i;
            i++;
                  }
        System.out.println("sonuc " +sonuc);

        Örnek: 0 ile 20 arasındaki 3 ün katı olan tüm sayılarının küpleri alarak
        ekrana yazdırın.
        0 0
        3 27
        9 81
        vs

        int i=3;
        while(i<20){
            int sonuc=i*i*i;
            System.out.println(i+ " nin kupu  = " +sonuc );
            i+=3;

       */
//            Örnek: Kullanıcıdan bir kelime alın ve kaç defa yazdırmak istediğini
//            sorun . Kullanıcıdan aldığınız kelimeyi kullanıcının istediği kadar
//            ekrana yazdırın. Bu ilemi kullanıcı ‘X’ e basana kadar devam ettirin.

        Scanner scan=new Scanner(System.in);
        while(true){
            System.out.print(" lutfen kelime giriniz");
            String kelime=scan.nextLine();
            if(kelime.equals("x")){
                break;
            }
            System.out.println(" kac defa yazdirmak istersiniz");
            int repeat=scan.nextInt();
            for(int i=0;i<repeat;i++){
                System.out.println(kelime);
            }
        }


        }

}