package agustos_12Ders;

import java.util.Random;

public class Agustos_24_Array {
    public static void main(String[] args){

/*        String str[]=new String[0];
        String[] str1=new String[1];

        String[] str2;
        str=new String[7];

        int sayi[]=new int[5];
        sayi[0]=12;
        sayi[1]=114;
        sayi[2]=122;
        sayi[3]=128;
        sayi[4]=1211;
        System.out.println(2*sayi[2]+10);
        for(int i=0;i<5;i++){
            System.out.println(Math.pow(sayi[i],2));   // karesini almak icin (Math.pow(sayi[i],2

            String day[]=new String[7];
            day[0]="pazartesi";
            day[1]="sali";
            day[2]="carsamba";
            day[3]="persembe";
            day[4]="cuma";
            day[5]="cumartesi";
            day[6]="pazar";
            System.out.println("bugun gunlerden " +day[2]);
  //      for(int i=0;i<7;i++){
  //          System.out.print(day[i]);

//        **********soru********
//        haftanin 3.gününün carsamba olup olmadigini kontrol edin,oyleyse carsamba ,degilse carsamba degildir yazsin

 //       if(day[2].equals("carsamba")){
 //           System.out.println("haftanin 3.günü carsmbadir");
  //      }
   //     else{
 //           System.out.println("haftanin 3.günü degildir");
  //      }

 //       ************soru**************

 //               günlerin icinde cuma var midir varsa true yoksa false yazdir

 //       for(int i=0;i<7;i++){
//            if(day[i].equalsIgnoreCase("cuma")){
 //               System.out.println("true");
 //               break;
 //           }else{
  //              if(i==6){
 //                   System.out.println("false");
 //               }
 //           }
 //       }
 // ******************2.yontem******
        int count=0;
        for(int i=0;i<7;i++){
           if(day[i].equalsIgnoreCase("cuma")){
               count++;
           }
        }
        if(count>0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

 Örnek:
        5 boyutlu bir array oluşturun ve içerisine 5 adet isim atayın içerinde kendi isminizin olup
        olmadığını kontrol edin. Var ise isminiz grup içerisinde vardır yazdırsın yok ise isminiz
        grup içerinde yoktur yazdırsın.

        String isim="adem";
        String[] str={"ali","ayse","betul","efe","ponci"};

      for(int i=0;i<5;i++){
          if(str[i].equalsIgnoreCase(isim)){
              System.out.println("adem grup icerisinde vardir");
              break;
          }else{
              System.out.println("adem yoktur");
          }
      }
      ********2.yontem********

        String isim="adem";
        String[] str={"ali","ayse","betul","efe","ponci"};
          int count=0;
        for(int i=0;i<5;i++){
            if(str[i].equalsIgnoreCase(isim)){
                count++;
            }
        }
        if(count>0){
            System.out.println("adem grup icerisinde vardir");

        }else{
            System.out.println("adem grup icerisinde yoktur");
        }
        Örnek:
        20 boyutunda bir dizi oluşturun ve her bir index’ine random 0 ile 100 arasın bir değer
        atayın. Sonrasında 17 index numarasındaki veriyi ekrana yazdırın.


//        Random random=new Random();
 //       int x=random.nextInt(100);
//        System.out.println(x);

        int[] sayi=new int[20];
        Random random=new Random();
        for(int i=0;i<20;i++){
            sayi[i]=random.nextInt(100);
            System.out.println((i)+" .sayi :" +sayi[i]);
        }
        System.out.println("17.sayi =" +sayi[17]);

       ************soru ********
              arraylerin icindeki tek ve cift sayilari bul
              */

        int[] sayi=new int[20];
        Random random=new Random();
        for(int i=0;i<20;i++){
            sayi[i]=random.nextInt(100);
            System.out.println((i)+" .sayi :" +sayi[i]);
        }
        System.out.println("17.sayi =" +sayi[17]);

        int tek=0;int cift=0;

        for(int i=0;i<20;i++){
            if(sayi[i]%2==0){
                cift++;
            }
            else{
                tek++;
            }
        }
        System.out.println("tek sayi :" +tek);
        System.out.println("cift sayi :" +cift);



    }
}





