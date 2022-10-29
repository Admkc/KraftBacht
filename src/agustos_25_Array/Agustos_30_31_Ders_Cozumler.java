package agustos_25_Array;

public class Agustos_30_31_Ders_Cozumler {
    public static void main(String[] args){
        int[] sayilar= {5,8,9,2,3,3,3,6,6,5,6,310,750,45,34,21};
        System.out.println(enBuyuk2(sayilar));
//        System.out.println(dublicateSayi(sayilar));
        String sarry="//«Bir fil ormanda boylu boyunca uzanmış, yüksek sesle horlayarak uyuyordu.\n" +
                "    //     Filin yemek dolu karnı horlarken bir aşağı bir yukarı gidiyordu.\n" +
                "    //     Filin horlama sesini duyan fare yuvasından çıkıp sesin olduğu tarafa gitti,\n" +
                "    //     filin horlarken sallanan karnı farenin hoşuna gitti. Usulca çıkıp filin karnının\n" +
                "    //     üzerine oturdu, salıncak gibi bir o yana bir bu yana\n" +
                "    //     sallanırken eğleniyordu.»    ";

//        System.out.println(dublicateKelimeCheck("araba ile yola çıktık fakat araba arıza yaptı"));
 //       System.out.println(Arrays.toString(enkucuk0Ata(sayilar)));
 //       System.out.println(asalSayiBul(sayilar));
    }
    // Array içerisindeki en büyük 2. sayıyı bulun. (Array.sort kullanılmayacak)

    public static int enBuyuk2(int[] sarry){
        int a=sarry[0];
        int b=sarry[0];
        for(int sayi:sarry){
            if(sayi>a)
                a=sayi;
            }
        for(int sayi:sarry){
            if(sayi>b && sayi!=a)
                b=sayi;

        }
        return b;
        }
    //Array’in içerisinde ard arda 3 adet sıralı sayı var ise true döndüren metodu yazınız.
//[2,3,3,4,5,6,5,6,3]  true   [2,4,5,8,8]  false    [1,2,3]  true [1,2]  false
    public static boolean ardArdaUc(int[] arr){     //kod hata veriyorrrr tekrar et
        if(arr.length<3){
            return false;
        }
        for(int i=0;i<arr.length-3;i++){
            if(arr[i]==arr[i+1]-1 && arr[i]==arr[i+2]-2){
                return true;

            }
        }
        return false;

    }
    //Array’in içerindeki eşi olmayan yalnız sayıları bulan ve
    // bunları ekrana yazdıran metodu yazınız.
    // (sağında veya solunda aynı sayı yoksa yalnızdır.) (return array)
//[2,3,3,4,5,6,5,6,3]  2,4,5,6,3
//[2,2,5,8,8] 5
//[2,2,3]  3
//[1,2]  1,2
    public static String[] yalnizSayilar(int[] arr){       //soruya tekrar bak***********

        String yalnızSayilar="";
        if(arr.length==1) {
            yalnızSayilar+=arr[0]+" ";
            return yalnızSayilar.split(" ");
        }

        if(arr[0]!=arr[1]) yalnızSayilar+=arr[0]+" ";

        for(int i=1; i<arr.length-1; i++){
            if(arr[i]!=arr[i-1]&&arr[i]!=arr[i+1])
                yalnızSayilar+=arr[i]+" ";
        }

        if(arr[arr.length-1]!=arr[arr.length-2])
            yalnızSayilar+=arr[arr.length-1]+" ";


        return yalnızSayilar.split(" ");


    }
    //Array’in içerisinde en çok bulunan sayıyı veren metodu yazınız.
// (eşitlik durumda herhangi birini alabilir,1 den  bulunmuyorsa -1 döndürecek)
//[2,3,3,3,6,6,5,6,3]  3
//
//[2,4,5,8,8]  8
//
//[2,4,5,8]  -1
    public static int enCokSayi(int[] sary){         //tekrar ettt recording
        int encok=-1;
        int count;
        int adet=1;
        for(int i=0;i<sary.length;i++){
            count=0;
            for(int k=0;k<sary.length;k++){
                if(sary[i]==sary[k]){
                    count++;
                }
            }
            if(count>adet){
                encok=sary[i];
                adet=count;
            }
        }
        return encok;
    }
    //Array’in içerindeki dublicate sayı varsa true yoksa false döndüren metodu yazınız
    //[1,2,8,1]   true
    //[25,89,78,98]   false
    public static boolean dublicateSayi(int[] sarry){
        for(int i=0;i<sarry.length;i++){
            for(int k=0;k<sarry.length;k++){
                if(i!=k && sarry[i]==sarry[k]){
                    return true;

                }
            }
        }
        return false;
    }
    //«Bir fil ormanda boylu boyunca uzanmış, yüksek sesle horlayarak uyuyordu.
    //     Filin yemek dolu karnı horlarken bir aşağı bir yukarı gidiyordu.
    //     Filin horlama sesini duyan fare yuvasından çıkıp sesin olduğu tarafa gitti,
    //     filin horlarken sallanan karnı farenin hoşuna gitti. Usulca çıkıp filin karnının
    //     üzerine oturdu, salıncak gibi bir o yana bir bu yana
    //     sallanırken eğleniyordu.» kelimesinde kaç adet o harfi vardır. (Büyük ve küçük ihmal edilecek)
    public static int findCountLetter(String str,String hedef){
        str=str.toLowerCase();
        String[] array=str.split("");
        int count=0;
        for(String harf:array){
            if(harf.equals(hedef)){
                count++;
            }
        }
        return count;
    }
    // 2.yontem:

    public static int findCountLetter_2(String str,String harf){

        return str.toLowerCase().split(harf).length-1;

    }
    //     3.yontem
    public static int findCountLetter_3(String str,String harf){
        return str.toLowerCase().length()-str.toLowerCase().replace("o","").length();
    }
    //Verilen bir cümlenin içerinde dublicate kelime varsa true yoksa false döndüren metodu yazınız.
// araba ile yola çıktık fakat araba arıza yaptı     true
// araba ile yola çıktık fakat arıza yaptı      false

    public static boolean dublicateKelimeCheck(String str){     //kod calısmıyor
        str=str.toLowerCase().replace(",","").replace(",","");
        String [] sarray=str.toLowerCase().split(" ");
        for(int i=0;i<sarray.length;i++){
            for(int k=0;k<sarray.length;k++){
                if(i!=k && sarray[i].equals(sarray[k])){    //i k ne alaka
                    return true;
                }
            }

        }
        return false;
    }
//    Array’in içerisindeki en küçük sayıyı bulan ve array in ilk indeksine
// bu sayıyı atayan diğer indekslere 0 atayan metodu yazınız.  [5,7,1,9]  [1,0,0,0]

      public static int[] enkucuk0Ata(int[] sarry){
        int enkucuk=sarry[0];
        for(int sayi:sarry){
            if(sayi<enkucuk){
                enkucuk=sayi;
            }
        }
        int[] yeniarray=new int[sarry.length];
        yeniarray[0]=enkucuk;
          for (int i = 1; i <sarry.length ; i++) {
              yeniarray[i]=0;

          }
          return yeniarray;

      }
    //Array’in içerisindeki sayılardan 5 den sonra 8 geliyorsa 8 yerine 1 atayan metodu yazınız

    public static int[] degerAtamaKontrol(int[] arr,int ilkDeger,int kontroldegeri, int atanacakSayi){
        int[] yeniArray=new int[arr.length];

        yeniArray[0]=arr[0];                              //************tekrar et*******

        for(int i=0; i<yeniArray.length-1; i++){
            if(arr[i]==ilkDeger && arr[i+1]==kontroldegeri){
                yeniArray[i+1]=atanacakSayi;
            }
            else{
                yeniArray[i+1]=arr[i+1];
            }
        }
        return yeniArray;
    }
    //Array’in içerisindeki asal sayıları bularak ekrana yazdıran metodu yazınız
    public static String asalSayiBul(int[] sary){
        String result="";
               firstLoop: for(int sayi:sary){
                    if(sayi==2){
                        result+=sayi+" ";
                    }
                    else if(sayi==0 || sayi==1) {
                        continue firstLoop;
                    }
                    else {
                        for(int i=2; i<sayi; i++){
                            if(sayi%i==0){
                                continue firstLoop;
                            }
                        }
                        result+=sayi+" ";
                    }
                }

                return result;
            }
      //Array’in içerisindeki sayıları artan düzeyde sıralayınız. (Arrays.sort kullanılmayacak)

            public static int[] kucuktenBuyugeSirala(int[] arr){

                    int depo=0;
                    for(int i=0; i<arr.length; i++){

                        for(int k=i+1; k<arr.length; k++){
                            if(arr[i]>arr[k]){
                                depo=arr[i];
                                arr[i]=arr[k];
                                arr[k]=depo;
                            }

                        }
                    }
                  return arr;
 }

 }





