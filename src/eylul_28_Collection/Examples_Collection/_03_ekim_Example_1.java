package eylul_28_Collection.Examples_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class _03_ekim_Example_1 {
    public static void main(String[] args) {
       Integer[] arry={3,9,47,45,62,82,4,5,4,4,5,5,4,3,4,3,4,5,4};
       List<Integer> liste=new ArrayList<>(Arrays.asList(arry));

  //      System.out.println(addListMethod(arry));
  //      System.out.println(addListMethodterstenyazdir(arry));
  //      System.out.println(addListMethod2(arry));
 //       System.out.println(removeListMethod3(liste,4));
 //       System.out.println(liste);
 //       removeListMethod3(liste,5);
        // System.out.println(removeListMethod3(list,4));
  //      removeListMethod3(liste,3);
 //       System.out.println(liste);
 //       System.out.println(removeListMethods4(liste,4));
 //       System.out.println(removeListMethods4(liste,3));

        System.out.println(remove3(liste,4));
        System.out.println(liste);





    }
    //***********SORU***********
    // bir arrayi list'in içerine alan ve list return eden bir metod yazınız?

    public static List<Integer> addListMethod(int[] sarry){
        List<Integer> liste=new ArrayList<>();
        for (int i=0;i<sarry.length;i++){
            liste.add(sarry[i]);
        }
        return liste;


    }
    public static List<Integer> addListMethodterstenyazdir(int[] sarry){
        List<Integer> liste=new ArrayList<>();
        for (int i=sarry.length-1;i>=0;i--){
            liste.add(sarry[i]);
        }
        return liste;

}
    public static List<Integer> addListMethod2(Integer[] sarry){
        List<Integer> listem=new ArrayList<>();
       listem= Arrays.asList(sarry);
       return listem;

    }
    public static boolean removeListMethod3(List<Integer> list,Integer data){
        return list.removeAll(Arrays.asList(new Integer[]{data}));

    }
     public static List<Integer> removeListMethods4(List<Integer> list,Integer data){
         Iterator<Integer> iter=list.iterator();
         while (iter.hasNext()){
             if (iter.next().equals(data)){
                 iter.remove();
             }
         }
         return list;
    }
    //************soru***************
    //içerisine bir list ve data kabul eden ve bu datayı tüm listeden silen
    // sonucunda bir Integer list döndüren metodu yazınız?
    // clearAllList(List<Integer>, Integer data)

    public static List<Integer> remove(List<Integer> liste,Integer data){
        List<Integer> mylist=new ArrayList<>();
        for (int i=0;i<liste.size();i++){
            if (!liste.get(i).equals(data)){
                mylist.add(liste.get(i));
            }
        }
        return mylist;

    }
    public static List<Integer> remove2(List<Integer> liste,Integer data){
        for (int i=0;i<liste.size();i++){
            if (liste.get(i).equals(data)){
                liste.remove(liste.get(i));

            }
        }
        return liste;

    }
    public static boolean remove3(List<Integer> liste,Integer data){
        return liste.removeAll(Arrays.asList(new  Integer[] {data}));

    }



    }














