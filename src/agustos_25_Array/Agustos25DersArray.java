package agustos_25_Array;

public class Agustos25DersArray {
    public static void main(String[] args) {
        int[] iArr={1,2,3,4,5,6,7};
        int[] iArr2={1,2,3,4,5,6,7};
        int[] sayilar={145,254,354,44,5,644,744};
// soru1       System.out.println(checkLenght(iArr));
 // soru2       System.out.println(find5(sayilar,5));
//soru 3        System.out.println(firstEquals(iArr, iArr2));
// soru 4        System.out.println(Arrays.toString(newArrWithFirstElement(iArr, iArr2)));
//soru 5        System.out.println(sumArryEleman(sayilar));
//soru 6        System.out.println(Arrays.toString(concatArry(iArr,iArr2)));

    }


 //          ************ soru1******************

 //         Bir method yazın ve int[] kabul etsin. length i 5 den büyükse true döndürsün.

    public static boolean checkLenght(int[] iArry){

        return iArry.length>5;
}
// ************ soru2******************
//Bir method yazın int array kabul etsin array in içinde 5 olup olmadığını kontrol etsin.


    public static boolean find5(int[] iARr,int param){

        for(int i=0;i<iARr.length;i++){
            if(iARr[i]==param){
                return true;
            }
        }
        return false;

    }
//    ************ soru3******************

 //   Bir method yazın ve 2 array kabul etsin ilk elemanları eşitse true döndürsün.

              public static boolean firstEquals(int[] iarr1,int [] iarr2){

        return  iarr1[0]==iarr2[0];
              }

// ************ soru4******************

 //           2 array kabul eden bir method yazın ve arraylerin llk elemanları ile yeni bir array döndürsün.

    public static int[] newArrWithFirstElement(int[] iArr1,int[] iArr2){      //sor****
       int[] newArr=new int[2];
 //       int[] newArr={iArr1[1],iArr2[3]};        2.yontem
        newArr[0]=iArr1[1];
        iArr1[1]=iArr2[3];
        return newArr;
    }
  //              ************ soru5******************

// Int array in elemanlarının toplamını veren bir method yazın

    public static int sumArryEleman(int[] iArr){
        int sum=0;
        for(int i=0;i<iArr.length;i++){
            sum+=iArr[i];
        }
        return sum;
    }
 //   ************ soru6******************

 //   Verilen 2 arrayi birleştirip array döndüren bir method yazın. *****TEKRAR EDİLECEK***kod calismiyor

    public static int[] concatArry(int[] Arr1,int[] Arry2) {
        int[] newArry=new int[Arr1.length+Arry2.length];
        for(int i=0;i<newArry.length;i++){
            if(i<Arr1.length){
                newArry[i]=Arr1[i];
            }else{
                newArry[i]=Arr1[i-Arr1.length];
            }
        }
        return newArry;
    }


}








