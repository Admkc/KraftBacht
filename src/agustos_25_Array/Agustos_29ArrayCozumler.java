package agustos_25_Array;

import java.util.Random;

public class Agustos_29ArrayCozumler {
    public static void main(String[] args){
        int[] sary1 = {1,2,3,4,5,6,7};
        int[] sary2 = {1,2,3,4,5};
        int[] sayılar1 = {1000,34,83,74,1,5};
        int[] sayılar2 = {100,3,3,48,3,7,1,5};
//        System.out.println(max(sary1)-min(sary1));
//        System.out.println(Arrays.toString(enKucukSayiIleDoldur(sary2)));
 //       System.out.println(arrayCheck(sary2, sary1));
//        System.out.println(tersArray(sary1));
        //       System.out.println(rastgeleArray(1000));     yazdırmiyor tekrar bak
//        System.out.println(rastgeleElliSeksen(100));
//        System.out.println(Arrays.toString(rastgeleArray(5000)));
        //       System.out.println(find125(5000));
 //       System.out.println(Arrays.toString(arrayBirlestir(sary1, sary2)));
//        System.out.println(Arrays.toString(araSayılariAta(14,9)));

    }
    //NOTTTTTTTT’in içerisindeki tüm sayıların toplamını veren metodu yazınız..(for each)
    public static int toplam(int[] arr){
        int result=0;
        for(int sayi:arr){
            result+=sayi;
        }
        return result;
}
         //NOTTTTTTTT’in içerisindeki tüm çift sayıların toplamını veren metodu yazınız.
    public static int ciftToplam(int[] arr){
        int result=0;
        for(int sayi:arr){
            if(sayi%2==0){
                result+=sayi;
            }

        }
        return result;

    }
    //NOTTTTTTTT’in içerisindeki tüm 3 sayılarının toplamını veren metodu yazınız.
    public static int ucSum(int[] arr){
        int result=0;
        for(int sayi:arr){
            if(sayi==3){
                result+=sayi;
            }
        }
        return result;

    }
    //   NOTTTTTTTT’in içerisindeki en büyük ve en küçük sayı arasındaki farkı bulan metodu yazınız.
    //   (Arrays.sort kullanılmayacak)
    public static int min(int[] arr){
        int min=arr[0];
        for(int sayi:arr){
            if(min>sayi){
                min=sayi;
            }
        }
        return min;

    }

    public static int max(int[] arr){
        int max=arr[0];
        for (int sayi:arr) {
            if(max<sayi){
                max=sayi;
            }

        }
        return max;

    }
    //NOTTTTTTTT’in içerisindeki en küçük sayıyı tüm indekslere atayan bir
    // metod yazınız.(Arrays.sort ve Arrays.fill kullanılmayacak)
    public static int[] enKucukSayiIleDoldur(int[] arr){
        int[] yeniArray=new int[arr.length];

        int min=arr[0];                             //int min=arr[0];
        for(int i=0; i<arr.length; i++){            //for(int sayi:arr){
            if(arr[i]<min)                          //if(sayi<min)
                min=arr[i];                         // min=sayi;

        }
        for(int i=0;i<yeniArray.length;i++){
            yeniArray[i]=min;
        }
        return yeniArray;
    }

    //2 adet array kabul eden ve sonucunda      tekrar etttttt************sorrrrrrr
    // bu 2 array’in verileri ile birlikte
    // tek bir array oluşturan metodu yazınız.

    public static int[] arrayBirlestir(int[] a,int[] b){

        int[] resultarry=new int[a.length+b.length];

        for(int i=0,k=0;i<resultarry.length;i++){
            if(i<a.length){
                resultarry[i]=a[i];
            }
            if(i>a.length-1){
                resultarry[i]=b[k];
                k++;

            }
        }
        return resultarry;
    }
    //2 adet integer sayı alan ve
    // arasındaki sayıları indekslere atayan metodu yazınız. (5,11) 5,6,7,8,9,10,11

    public static int[] araSayılariAta(int a,int b){    //  tekrar ettttttttttt
        int max=Math.max(a,b);

        if(max==a){
            int[] yeniArray=new int[(a-b+1)];
            for(int i=0; i<yeniArray.length; i++){
                yeniArray[i]=b+i;
            }
            return yeniArray;
        }
        else{
            int[] yeniArray=new int[(b-a+1)];
            for(int i=0; i<yeniArray.length; i++){
                yeniArray[i]=a+i;
            }
            return yeniArray;
        }
    }

    //2 array kabul eden, ilk array in içerindeki
    // tüm sayılar ikinci arrayin içinde yer alıyorsa
    // true yer almıyorsa false yazdıran metodu yazınız.
    //[5,4,3,2,1] , [1,2,3,4,5,7,9] true
    //[2,1,1,2,1,2,1,2] , [1,2] true
    public static boolean arrayCheck(int[] sarry,int[] sarry2){
       firstloop: for(int i=0;i<sarry.length;i++){
         secondloop: for(int k=0;k<sarry2.length;k++){
          if(sarry[i]==sarry2[k]){
              continue firstloop;
          }
          continue secondloop;
         }
         return false;
        }
        return true;
    }
//    NOTTTTTTTT’in içerisindeki sayıları
// ters çevirerek yeni bir array oluşturan metodu yazınız    //tekrar bak kod calişmıyorrrr

    public static int[] newAr(int[] sary){

        int[] newary=new int[sary.length];
        for (int i=newary.length-1,k=0;i>=0;i--,k++){
            newary[i]=sary[k];
        }
        return newary;
    }
    //Boyutu 10 olan bir array oluşturun ve içerisine Random sınıfını
    // kullanarak 0-100 arasında
    // rasgele sayılar atayın ve ekrana bu verileri yazdıran metodu yazınız.
    public static int[] rastgeleArray(int boyut){
        Random random=new Random();
        int[] yeniarry=new int[boyut];
        for (int i = 0; i < boyut; i++) {
            yeniarry[i]=random.nextInt(100);

        }
        return yeniarry;
    }
    //Boyutu 500 olan bir array oluşturun ve içerisine
// Random sınıfını kullanarak 50-80 arasında rasgele sayılar atayın.
    public static int[] rastgeleElliSeksen(int boyut){
        Random random=new Random();
        int[] yenisarry=new int[boyut];
        for(int i=0;i<boyut;i++){
            yenisarry[i]=random.nextInt(30)+50;
        }
        return yenisarry;
    }
    //Boyutu 500 olan bir array oluşturun ve içerisine Random sınıfını
// kullanarak 120-140 arasında rasgele sayılar atayın.
// Oluşturduğunuz NOTTTTTTTT in içerinde kaç adet 125 sayısı vardır?
    public static int find125(int boyut){
        Random random=new Random();
        int [] yeniArray=new int[boyut];
        int count=0;
        for(int i=0; i<boyut; i++){
            yeniArray[i]=random.nextInt(20)+120;
            if(yeniArray[i]==125){
                count++;
            }
        }
        return count;

}
    }









