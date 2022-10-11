package agustos_10Ders_Do_While;

import java.util.Scanner;

public class Branching {
    public static void main(String[] args) {
        /*
        Örnek : Sonsuz bir While döngüsü içerisine kullanıcıdan 2 sayı isteyin ve toplamını ekrana +
yazdırın sayı toplamı 50 ye eşit ise proramdan çıkış işlemi gerçekleştirin.


        Scanner scan=new Scanner(System.in);
        boolean k=true;

        while(k){     //while=true olabilir
            System.out.println("toplam 50 ise sonlanacaktir");
            System.out.println("1.sayi");
            int a=scan.nextInt();
            System.out.println("2.sayi");
            int b=scan.nextInt();
            System.out.println("toplam : " +(a+b) );
            if((a+b)==50){
                k=false;     //break olabilir
            }
        }

        Örnek : Nested loop kullanarak kullanıcıdan hangi işlemi yapmak istediğini sorun. 1-toplama +
        2-Çıkarma 3-çarpma 4-bölme 5-çıkış kullanıcının isteğine göre işlem yapın. Kullanıcının
        seçimine göre Girilen ekrandan 2 sayı alın ve işlemin sonucunu ekrana yazın çıkmak sonuç
        0 ise çıkış ilemi yapılacağını kullanıcıya bildirin.*/

        Scanner scan=new Scanner(System.in);
        System.out.println("ne yapacaksiniz");
        System.out.println("1-toplama \n 2-cıkarma \n 3-carpma \n 4-bolme \n 5-cikis");
        System.out.println("seciminiz");
        int i=scan.nextInt();
        if(i==1){
            while(true){
                System.out.println("toplama icin cikis 0 olmali");
                System.out.println("1.sayi");
                int a=scan.nextInt();
                System.out.println("2.sayi");
                int b=scan.nextInt();
                System.out.println("toplam :" +(a+b));
                if((a+b)==0){
                    break;
                }
            }

            if(i==5){

                   //niye hata veriyor sonra bak break yazınca




            }


            }
        }

    }


