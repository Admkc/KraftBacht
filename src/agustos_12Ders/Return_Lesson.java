package agustos_12Ders;

public class Return_Lesson {
    public static void main(String[] args) {

//        boolean bl=lastDijiCheck(23,45);
//        System.out.println("bl :" +bl);
//        System.out.println(primeNumber(23));
 //       System.out.println(converttoPozitif(-8));
 //       System.out.println(gecmeNotu(63,78,87));

    }
///*
//         Bir method yazın boolean değer dondursun ve 2 sayı
//    kabul etsin sayıların son rakamı aynı ise true farklı ise
//        false döndürsün.


    public static boolean lastDijiCheck(int sayi1,int sayi2){
        if(sayi1%10==sayi2%10){
        return(true);

    }


        return false;
    }

//    Bir method yazın boolean değer döndürsün 1 sayı kabul
//etsin asal sayı ise true versin


    public static boolean primeNumber(int num){
        if(num==0 || num==1){
            return false;

        }else{
            for(int i=2;i<num;i++){
                if(num%i==0){
                    return false;
                }
            }
        }

        return true;
    }
//    Bir method yazın ve verdiğiniz sayıyı negatifse pozitif e
//pozitifse pozitif olarak versin.

    public static int converttoPozitif(int a){

        return Math.abs(a);    ////sayiyi pozitife ceviriyor Math.abs
    }


//Bir method yazın dönüş tipi char olsun. 3 ders notu kabul
//    etsin ve ortalamayı harf cinsinden döndürsün .
//    Not aralığı Harf karşılığı
//76-100 A
//51-75 B
//0-50 C


    public static char gecmeNotu(double not1,double not2,double not3){
        char not='X';     // /bu degeri baslangıc icin atamak zorundayiz
        double ortalama=(not1+not2+not3)/3;
        if(ortalama>=76 && ortalama<=100){
            return 'A';
        }else if(ortalama>=51 && ortalama<=75){

                    return 'B';


        }else if(ortalama>=0 && ortalama<=50){
            return 'C';

        }
        return 'X';   ///charlarda bi alternatif ya da baslangıc belirtmek zorundayız
    }

}
