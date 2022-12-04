package agustos_25_Array;

public class Eylul_01_Wrapper {
    /**
     * birer nesne (object) olarak kullanmak için bize bir yol sunmaktadır
     javada primitive tiplerinde nesne olarak üretilebileceği veya convert edilebileceği her tipe
     karşılık gelen class ları vardır. Bunlara Wrapper Classes denmektedir.
     ***Eğer biz bir collections nesnesinin içerisinde bir Primitive tip tutmak istiyorsak mecburen
     o Primitive tipi başka bir sınıf ile sarmalamamız gerekecek.
     Bu yüzden Java da java.lang package altında her ilkel tip için bir sarmalayıcı (wrapper classes) sınıf vardır.
     ***Autoboxing primitive in object karşılığına çevrilmesidir.
     ***Unboxing bir object in primitive karşılığına çevrilmesidir
     */
    public static void main(String[] args) {

        sum(5,10,15);
        sum(20,30,40);
        sum(100,200,300,400);

        concat("galatasaray");
        concat("cimbombom");
        concat1("anne","baba","betul");
        System.out.println(concat1("ali","veli"));
    }

    
    public static void sum(int...sayilar){

 //       System.out.println(sayilar.length);
        if(sayilar.length==4){
 //           System.out.println(sayilar[0]+sayilar[3]);
        }
        int sum=0;
        for(int i:sayilar){
            sum+=i;
        }
 //       System.out.println("girilen  "+sayilar.length+ " in toplami" +sum);

    }
    public static void concat(String...strs){
        String result="";
        for(String s:strs){
            result+=s;
        }
        System.out.println(result);

    }
    public static String concat1(String...str1){
        String result="";
        for(int i=0;i<str1.length;i++){
            result+=str1[i].charAt(0);
        }
        return result;
    }

}
//package day_29;
//
//import java.util.ArrayList;
//
//public class WrapperClass {
//
//    public static void main(String[] args) {
//
//        Byte B = new Byte((byte)127);
//        Byte B2 = new Byte("127");
//
//
//        System.out.println("B = " + B);
//        System.out.println("B2 = " + B2);
//
//        Short S = new Short((short)1000);
//        Short S2 = new Short("1000");
//
//        Integer I = new Integer(10000);
//        Integer I2 = new Integer("10000");
//
//        Long L = new Long(1000000);
//        Long L2 = new Long("1000000");
//
//        Float F = new Float(1.2);
//        Float F2 = new Float("1.2");
//
//        Double D = new Double(3.14);
//        Double D2 = new Double("3.14");
//
//        Character C = new Character('a');
//
//
//        //Autoboxing and unboxing
//
//        int i = 10;
//        Integer x = i;//autoboxed
//
//        Integer x1 = new Integer(5);
//        int i1 = x1; //unboxed
//
//        Double db = new Double(10.0);
//
//        double dbl = db;//unboxed
//        double bdl1 = new Double(3.14);//unboxed
//
////        valuOf
//
//        String s2 = "10";
//       Integer integer = Integer.valueOf(s2);
//        System.out.println("integer = " + integer);
//        Integer integer1 = Integer.valueOf(10);
//        System.out.println(integer+integer1);
//
//        Boolean Bl = Boolean.valueOf("true");
//        Boolean Bl1 = Boolean.valueOf(true);
//        Character ch = Character.valueOf('a');
//
//        System.out.println("Bl = " + Bl);
//        System.out.println("Bl1 = " + Bl1);
//        System.out.println("ch = " + ch);
//
////        Integer integer2 = Integer.valueOf("");
////        Integer integer3 = Integer.valueOf("ten");
//
////        parse// String argumanı kabul ediyor ve bunu ilgili primitive data tipine convert ediyor.
//        String tring = "100";
//        int y = Integer.parseInt(tring);
//        Integer buObject = y;
//
//        int i2 = buObject + 10;//unboxed
//        Integer baskaBirNesne = buObject+10;//autoboxed
//
//
//
//                     //soldakilerin tipinde oluyor =//sagdakiler
//
//        System.out.println(buObject+y);
//        System.out.println(tring+2);
//        System.out.println(Integer.parseInt("100")+2);
//
//        System.out.println("y = " + y);
//        int y1 = Integer.parseInt("-100");
//        int y2 = Integer.parseInt("+100");
//
//        String s3 = "1000";
//
//        Double dble = Double.parseDouble(s3);
//        Boolean bl = Boolean.parseBoolean("true");
//        System.out.println("dble = " + dble);
//        System.out.println("bl = " + bl);
//
//
//        System.out.println("y1 = " + y1);
//        System.out.println("y2 = " + y2);
//
////        int y3 = Integer.parseInt("100b");
////        int y4 = Integer.parseInt("100-");
////        int y5 = Integer.parseInt("a100");
////        int y6 = Integer.parseInt(" ");
////        System.out.println("y3 = " + y3);
////        System.out.println("y4 = " + y4);
////        System.out.println("y5 = " + y5);
////        System.out.println("y6 = " + y6);
//
//
//    }
//}

