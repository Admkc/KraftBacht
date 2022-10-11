package agustos_08DersFor_Loop;

import java.util.Scanner;

public class For_Loop {
    public static void main(String[] args){

       System.out.println("Giris");

        for(int i=0;i<20;i++){
            System.out.println(i+ " :betul");
    }
        System.out.println("cikis");



//    Örnek: ekrana 20 adet alt alta «merhaba dünya» yazdırın.+

        for(int i=0;i<=20;i++){

            System.out.println(i+ ": merhaba dunya");

}

//    Örnek: 0 dan 100 e kadar olan sayıları ekrana yazdırın +

        for(int i=0;i<=100;i++){
            System.out.print(i+ " ");
        }
//            Örnek: 15 den 100 e kadar olan sayıları ekrana yazdırın.+

        for(int i=15;i<=100;i++){
            System.out.print(i+ " ");
        }

//Örnek: 0 dan 100 e kadar olan sayıları tersten ekrana yazdırın. (99+98 97 vs)

        for(int i=100;i>=0;i--){
            System.out.print(i+ " ");
        }

 //           Örnek: 0 dan 100 e kadar olan çift sayıları ekrana yazdırın.+

        for(int i=0;i<=100;i++){    ////i+=2 de olur
            if(i%2==0){
            System.out.print(i+ " ");

}
}
//        Örnek: 0 dan 100 e kadar olan tek sayıları ekrana yazdırın.+


        for(int i=0;i<=100;i++){    //i+=2 de olur
            if(i%2==1){             //(i%2!=0) de olur
                System.out.print(i+ " ");
}
}
//Örnek: 10 ile 1000 arasında olan 10 a tam bölünebilen tüm sayıları ekrana yazdırın.

        for(int i=10;i<=1000;i++){
            if(i%10==0){
                System.out.print(i+ " ");
        }
        }
//           Örnek: 6 faktöriyel’in sonucu nedir? (6!=6*5*4*3*2*1)+


        int sonuc=1;
        for(int i=6;i>0;i--){
            sonuc*=i;    //sonuc=sonuc*i;
        }
        System.out.println("6! :" +sonuc );


//        Örnek: 0 ile 20 arasındaki tüm sayılarının küpleri alarak ekrana +
//        yazdırın.
//        0 0
//        1 1
//        2 8
//        3 27
//        4 vs

        for(int i=0;i<20;i++){
            int snc=1;
            sonuc=i*i*i;      //sonuc=Math.pow(i,3) kolay yontemi
            System.out.println(i+ " nin kupu " +sonuc);
        }
//         Örnek: 23 derece ile 50 derece arasında olan tüm Fahrenheit
//        değerlerini ekrana yazdırın. (C=(F-32) / 1.8)

        for(int i=23;i<=50;i++){
            double fahrenheit=(i*1.8)+32;
            System.out.println(i+ "  c = " +fahrenheit+" f dir");
        }

//       Örnek: Kullanıcıdan bir kelime alın ve kaç defa yazdırmak istediğini +
//        sorun . Kullanıcıdan aldığınız kelimeyi kullanıcının istediği kadar
//        ekrana yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println(" kelime soyle");
        String kelime=scan.nextLine();
        System.out.println(" kac defa yazdirmak istiyorsun?");
        int tekrarsayisi=scan.nextInt();

        for(int i=0;i<tekrarsayisi;i++){
            System.out.println(kelime);

        }
//        Örnek: Kullanıcıdan 0 ile 1000 arasında bir sayı isteyin. Kullanıcın   +
//        girdiği sayı dahil . 0 dan başlayarak kullanıcının girdiği sayıya kadar
//        olan tamsayıların toplamını ekrana yazdıran programı yazınız

        Scanner scan1=new Scanner(System.in);
        System.out.println(" 0 ile 1000 arasinda sayi soyle");
        int sayi1=scan1.nextInt();

        int sonuc3=0;
        for(int i=0;i<=sayi1;i++){
            sonuc3+=i;


       }
        System.out.println(sonuc3);

//         Örnek: Kullanıcıdan 0 ile 1000 arasında bir sayı isteyin. Kullanıcının   +
//        girdiği sayı dahil  0 dan başlayarak kullanıcının girdiği sayıya kadar
//        tek ve çift tamsayıların toplamını ayrı ayrı ekrana yazdıran programı
//        yazınız.


        Scanner sc=new Scanner(System.in);
        System.out.println(" 0 ile 1000 arasinda sayi soyle");
        int sayi=sc.nextInt();
        int tek=0;
        int cift=0;

        for(int i=0;i<sayi1;i++){
            if(i%2==0){
                cift+=i;
            }
            else {
                tek+=i;
            }
    }
        System.out.println(" tek sayilarin toplami " +tek);
        System.out.println(" cift sayilarin toplami " +cift);

//        Örnek: Kullanıcıdan taban ve kuvvet bilgilerini alarak ekrana sonucu ***tekrar et
//        yazdıran programı yazdırınız.(2 üzeri 4 =16)


        Scanner scn=new Scanner(System.in);
        System.out.println(" taban soyle");
        int taban=scn.nextInt();
        System.out.println(" ust soyle");
        int ust=scan.nextInt();

        int result=1;
        for(int i=0;i<ust;i++){
            result*=taban;
        }
        System.out.println(result);         // ust u nasıl koyuyur sorrrrrr



    }
}
