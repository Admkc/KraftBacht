package eylul_27_Exception;

import java.util.Arrays;

public class Exceeption_Soru_Cevap {
    public static void main(String[] args) throws Exception {

//*************soru******************
        //integer değişken kabul eden bir metot yazın
        //kullanıcıdan tek bir giriş sağlayın
        //kullanıcı integer dışında bir değer girerse  "Lütfen tekrar deneyiniz" hata mesajı verin
        //kullanıcı doğru girişi yapana kadar kullanıcıdan veri almaya devam edin

//        boolean devam=true;
//        while (devam){
//            try{
//            Scanner scanner=new Scanner(System.in);
//            System.out.println("bir sayi giriniz");
//            int sayi=scanner.nextInt();
//
//        }catch (Exception e){
//                System.out.println("lutfen tekrar giriniz");
//                continue;
//
//            }
//            System.out.println("finish");
//
//            devam=false;
//
//        }
//*********************soru****************************

        // 2 int sayı alın 1. sayıyı 2. sayıya bölün kalanı ekrana yazdırın
        //2 adet catch bloğu kullanın sonunda finally bloğunu kullanın

//        boolean devam=true;
//        while (true){
//            Scanner scan=new Scanner(System.in);
//            System.out.println("sayi: ");
//            int a=scan.nextInt();
//            System.out.println("bolme : ");
//            int b=scan.nextInt();
//            try {
//                System.out.println(a/b);
//            }catch (ArithmeticException art){
//                System.out.println(art.getMessage());
//                System.out.println("boyle bir islem tanımlanmamistir");
//                System.out.println("be careful");
//            }catch (Exception ex){
//                ex.printStackTrace();
//
//                System.out.println("islem olmadi");
//
//
//            }finally {
//                System.out.println("islem bitmek uzere");
//            }
//            devam=false;
//
//        }
//************************soru**********************************

        //personel islerini tutan bir array tanımlayın ve içerisine 5 adet integer türünde
        //id gönderin (arr[]={}) bu idlerin içerisinde 0 var ise IllegalArgumentException hatası verin
        //bunu bir checkArrayId metodunun içerinde yapın true veya false retun edebilirsiniz
        // yada 0 veya 1 döndürebilirsiniz

//        int [] arry={456,478,745,789,458,0};
//        try {
//            System.out.println(checkArrayId(arry));
//        }catch (IllegalArgumentException ee){
//            ee.printStackTrace();
//            System.out.println("uygun olmayan Id var");
//
//        }catch (Exception e){
//            e.printStackTrace();
//            System.out.println("bilinmeyen bir hata var");
//        }
//        System.out.println("programa devam ediliyor");
//
//
//    }
//    public static boolean checkArrayId(int[] sarry){
//        for (int i=0;i<sarry.length;i++){
//            if (sarry[i]==0){
//                throw new IllegalArgumentException("sifir rakamini kullanmayiniz");
//
//            }
//        }
//        return true;

//***********************soru****************************************************


        int[] array={1,3,5,8,5};
        //  System.out.println(maxDeger(array));

        System.out.println(maxNumberIndex(array));

        //array içerinde en büyük sayının index numarasını getiren metodu yazınız
        //eğer en büyük sayıdan 2 veya daha fazla var ise new exception throw edin.


    }
    public static int maxNumberIndex(int[] array) throws Exception {


        int[] arr=array.clone();

        int indexNumber=0;

        Arrays.sort(arr);
        int x=arr[arr.length-1];

        if(arr.length==1) return 0;

        if(arr[arr.length-2]==x){
            throw new Exception("en büyük sayıdan 2 adet vardır");
        }


       /* try {
            if(arr[arr.length-2]==x){
                throw new Exception("en büyük sayıdan 2 adet vardır");
            }
        }catch (ArrayIndexOutOfBoundsException e){

        }catch (Exception e){}  */

        for(int i=0; i<array.length; i++){
            if(array[i]==x){
                indexNumber=i;
            }

        }
        return indexNumber;
    }



    public static int maxNumber(int[] arr){

        // Arrays.sort(arr);
        //int min=arr[0];
        //int max=arr[arr.length-1];




        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;



    }


}
