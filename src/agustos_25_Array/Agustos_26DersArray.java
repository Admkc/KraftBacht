package agustos_25_Array;

import java.util.Arrays;

public class Agustos_26DersArray {
    public static void main(String[] args){
        int[] iArr = {1,2,3,4,5,6,7};
        int[] iArr2 = {1,2,3,4,5};
        int[] sayılar = {1000,3348374,1,5};
        int[] sayılar2 = {100,33,48,37,1,5};
        String str = "merhaba java insanları bugün nasılsınız";
        String str2 = "kayısı, armut, üzüm, çilek, nar";
        String str3 = "elma, armut, üzüm, çilek, nar";
        String str4 = "merhaba java insanları bugün nasılsınız";
//        System.out.println(aritmetic(iArr2));

//        System.out.println(bigOne(iArr));
//        System.out.println( Arrays.toString(  swapFirstAndLast(iArr)  ) );
//        System.out.println(Arrays.toString(  reverseArry(iArr2)  ));
//          System.out.println(sumOfOddIdx(iArr));
//        System.out.println(Arrays.toString(stringToArray(str)));
//        System.out.println(Arrays.toString(stringToArray2(str2)));
//        System.out.println(Arrays.toString(stringToArray3(str3)));
//        System.out.println(Arrays.toString(stringToArray4(str4)));
//        System.out.println(Arrays.toString(nBoy(10)));
 //       System.out.println(Arrays.toString(fillEnKucuk(sayılar2)));
        System.out.println(Arrays.toString(fillEnKucukWithoutLast(sayılar2)));
    }
 //       İnt arry in en büyük elemanını döndüren bir method yazın
    public static int bigOne(int[] arr){
        int max =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    //    Bir array oluşturun ve ilk ve son element leri swap(yer değiştirme) yapın.
    public static int[] swapFirstAndLast(int[] arr){
        int temp;

        temp = arr[0];
        arr[0]=arr[arr.length-1]; //{7,2,3,4,5,6,7}
        arr[arr.length-1] = temp; //{7,2,3,4,5,6,1}
        return arr;
}
    //    Bir method yazın ve verilen arry in elemanlarını tersden sıralayıp yeni bir array döndürsün.

    public static int[] reverseArry(int[] arr){
        int[] ints = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ints[i] = arr[(arr.length-1)-i];
        }
        return ints;
    }
    //    Bir methodla verilen array ın teksayı indexinde bulunan elemanların toplamını alın.
    public static int sumOfOddIdx(int[] arr){
        int sum = 0;
        for (int i = 1; i < arr.length; i+=2) {
            sum+=arr[i];
        }
        return sum;
    }
//       «merhaba java insanları bugün nasılsınız» gibi bir cümleyi her kelime bir
//    element olacak şekilde bir array a dönüştüren bir method yazın.

    public static String[] stringToArray(String str){

        return str.split(" ");
    }

 //       «kayısı, armut, üzüm, çilek, nar» cümlesinde ki meyve isimlerini her biri bir
//    element olacak şekilde bir array a atın. Elementlerden 5 den az harfi olan
//    varsa onun yerine çilek atayın.
    public static String[] stringToArray2(String str){
        String[] split = str.split(", ");
        for (int i = 0; i < split.length; i++) {
            if (split[i].length()<5){
                split[i]="çilek";
            }
        }
        return split;

    }

    //  «elma, armut, üzüm, çilek, nar» cümlesinde ki meyve isimlerini her biri bir
//      element olacak şekilde bir array a atın. İlk ve son idexi swaping yapın.
    public static String[] stringToArray3(String str){
        String[] split = str.split(", ");

        String temp = split[0];
        split[0]=split[split.length-1];
        split[split.length-1]=temp;

        return split;
    }
//      «merhaba java insanları bugün nasılsınız» gibi bir cümlenin ikinci kelimesinin
//    harflerinden array döndüren method yazın.

    public static String[] stringToArray4(String str){
        String[] arr = str.split(" ");
        return arr[1].split("");
    }
    //    Bir method yazın int n parametre olarak alsın. n değeri kadar sayıları sıralı bir
//    biçimde bir array içine yerleştirsin. n = 5 Exm: [0,1,2,3,4].
    public static int[] nBoy(int n){
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= i;
        }
        return arr;

}
//    karmaşık Bir sayı dizisinin en büyük ve en küçük değerli element lerinin aritmetik ortalamasını
//     veren bir method yazın.
    public static int aritmetic(int[] sarry){
        Arrays.sort(sarry);
        return (sarry[0]+sarry[sarry.length-1])/2;
    }

    //    Bir sayı dizisinin en küçük elemanı ne ise sayı dizisini onunla dolduran bir
//      method yazın.
    public static int[] fillEnKucuk(int[] saary){
        Arrays.sort(saary);
       Arrays.fill(saary,saary[0]);
       return saary;

    }
    //    Bir sayı dizisinin en küçük rakamı ne ise sayı dizisini (en büyük değer hariç)
//    onunla dolduran bir method yazın.

    public static int[] fillEnKucukWithoutLast(int[] saary){
        Arrays.sort(saary);
        Arrays.fill(saary,0,saary.length-1,saary[0]);
        return saary;
    }
    }














