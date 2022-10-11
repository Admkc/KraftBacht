package eylul_28_Collection.Examples_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_Homework {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>(Arrays.asList("ali","efe","ey","edip","adanada","pide","ye"));



       // String a="galata";
       // System.out.println(reversePalindrom("harun"));
      // System.out.println(reversePalindrom(a));
      //  System.out.println(reversePalindromList(list));
      //  System.out.println(removePalindromListWithIterable(list));
       // System.out.println(allPalindromClearList(list));



    }

    //ödev-1
    // interviev questions List<String>
    // List içerisindeki polindrom kelimeleri list içerinden silen metodu yazınız.
    //ey,  edip, adanada, pide, ye  ey,  edip,pide, ye

    //ödev-2
    // List içerisindeki polindrom kelimeler varsa list içerinden her iki kelimeyi silen metodu yazınız.
    //ey,  edip, adanada, pide, ye      boş

    public static String reversePalindrom(String str){
        String result="";
        for (int i = str.length()-1; i >=0; i--) {
            result+=str.charAt(i);


        }
        return result;

    }
    //yukaridaki kodu asagıda soruyu cozmek icin kullaniyorum
    public static List<String > reversePalindromList(List<String > liste) {

    for (int i=0;i<liste.size();i++){
        if (liste.get(i).equals(reversePalindrom(liste.get(i)))){
            liste.remove(liste.get(i));
        }
    }
    return liste;

    }
    //2.yontem ıterator ile
    public static List<String > removePalindromListWithIterable(List<String> list){
        Iterator<String > iter=list.iterator();
        while (iter.hasNext()){     //hasnext icerideki tüm verileri dolaştırır.
           String str= iter.next();   //  next ilk veriyi alır
           if (str.equals(reversePalindrom(str))){
               iter.remove();

           }
        }
   return list;

    }

    public static List<String> allPalindromClearList(List<String> list){  //tekrar etttttt

        for (int i=0;i<list.size();){
            String reserveStr=reversePalindrom(list.get(i));
            if (list.contains(reserveStr)){
                list.removeAll(Arrays.asList(list.get(i),reserveStr));
                continue;
            }
            i++;


        }
        return list;



    }






    }










