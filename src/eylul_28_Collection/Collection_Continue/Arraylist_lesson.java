package eylul_28_Collection.Collection_Continue;

import java.util.*;


public class Arraylist_lesson {
    public static void main(String[] args) {
     ArrayList<Integer> liste1=new ArrayList<>();
     List<Integer> liste=new ArrayList<>();  //polymorphic way

     Collection<Integer> col=new ArrayList<>();

     //***adding element / object  / item

        col.add(5);col.add(15);col.add(25);
        col.add(20);col.add(50);
        System.out.println(col);  //[5, 15, 25, 20, 50]

        //***getting size***
        System.out.println(col.size());

        //remove items
        col.remove(15);
        System.out.println("col : "+col);   //  [5, 25, 20, 50]
        System.out.println(col.remove(100));  // element olmadıgı icin false
        col.add(5);
        col.add(80);
        System.out.println(col);  //[5, 25, 20, 50, 5, 80]
        col.remove(5);
        System.out.println(" col " +col);  //[25, 20, 50, 5, 80]  ilk 5 gider

        //contains item
        System.out.println(col.contains(50));  //true
        System.out.println(col.contains(1000));  // false

        //checking empty or not
        System.out.println(col.isEmpty());  //false
        System.out.println("************************");

        //remove all
        System.out.println(col.removeAll(col)); //true
        col.add(10);col.add(20);col.add(30);col.add(40);col.add(50);
        System.out.println(col);  //[10, 20, 30, 40, 50]
        System.out.println("********");
 //       System.out.println(col.removeAll(col));  //true

        col.removeAll(Arrays.asList(50));  //[10, 20, 30, 40]
        System.out.println(col);
        col.removeAll(Arrays.asList(50,500));//remove yapılmak istenen collcetionın eşleşen elemanları remove edilir.

        //adding all
        col.addAll(Arrays.asList(60,70,80));
        System.out.println(col);  //[10, 20, 30, 40, 60, 70, 80]

        //contains all
        System.out.println(col.containsAll(Arrays.asList(70,80))); //true
        System.out.println(col.containsAll(Arrays.asList(70,100))); //true vermesi için yapılan controlde her iki item da bulmalı

        //retains all   [10, 20, 30, 40, 60, 70, 80]    retain tutmak demek
        col.retainAll(Arrays.asList(10,20,30));
        System.out.println(col);   //  [10, 20, 30]
        col.retainAll(Arrays.asList(100,110));
        System.out.println(col);  ////eger girilen elemanlar listede yoksa boş bir collection dondurur.

        //turning toArray

        col.addAll(Arrays.asList(60,70,80,25, 20, 50, 5, 80, 60, 70, 90));

        Integer[] toarray=col.toArray(new Integer[15]);  //boyutundan byuk olursa deger digerlerini null yazdırır.

        System.out.println("array : "+Arrays.toString(toarray));


    }
}
