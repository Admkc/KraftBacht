package repeat_Lesson;

import java.util.Scanner;

public class Loops_ {
    public static void main(String[] args) {
        
//        //son kelimeyi tersten yazdir
//        //how to reverse last word of message
//
//        String message="Welcome to bootcamp";
//        String reverse="";
//
//        int i=message.length()-1;
//        for ( i = i; i >=0 ; i--) {
//            if (message.charAt(i)==' ')
//                break;
//            if (message.charAt(i)!=' '){
//                reverse+=message.charAt(i);
//
//
//            }
//
//        }
//        System.out.println("forrr " +reverse);
//
//        //*******************************************************************
//
//        int k=message.length()-1;
//        reverse="";
//
//        while (message.charAt(k)!=' '){
//            reverse+=message.charAt(k);
//            k--;
//
//        }
//
//        System.out.println("whileee " +reverse);
//
//   //******************************************************************************
//
//    String color="red";
//    int count=0;
//    do {
//        count++;
//        System.out.println(count + "---> do it ");
//
//    }while (color.equals("mavi") &&  count<10) ;
//
//    //*****************************************************************
//
//      //  break and continue
//
//        //1- 7 ye tam bolunen sayiya kadar azalan sekilde yazalim.
//        //2- 7 ye tam bolunenleri yazdırın artan bir sekilde.

       Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();

        //1-
//
//        for (int j=Integer.max(a,b);j>=Integer.min(a,b);j--){
//            if (j%7==0) break;  //true oldugu anda donguyu kesiyor
//                System.out.println(" " +j);
//            }

        for (int t=Integer.min(a,b);t<=Integer.max(a,b);t++){
            if (t%7!=0) continue;// true ise devam etme, alttaki satırları yazmadan for dongusune gec
            System.out.println(" "+t);
        }
        //label works with break and continue

        //verilen aralıktaki prime numberları bulunuz.

        //1-prime number sadece 1 e ve kendine bolunen sayılar.
        //2-hersayı 1 e bolunebilir loop 2 den başlamalı
        //3-iç içe 2 loop olmalı dıstak sayı aralıığını tek tek gezmeli gezmeli
        //4-içdeki loop dışrakinden gelen her sayıyı 2 dahil son sayıya kadar tüm sayılara bolmeli ve tam bir bolum olup olmadıgını denetlemeli

        //7 8 9 10 11 12 13 14
        label:for (int i=7;i<14;i++){

            //7---2,3,4,5,6
//            8---2,3,4,5,6,7
            for (int k=2;k<i;k++){
                if (i%k==0){
                    continue label;
                }
            }
            System.out.println(i+" ");
        }


    }
    }













