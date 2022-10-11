package eylul_28_Collection.Collection_Continue;

import java.util.*;

public class List_Lesson {

    public static void main(String[] args) {
        List<Integer> liste=new LinkedList<>(Arrays.asList(10,70,50,40,100));

        System.out.println(liste);  //[10, 70, 50, 40, 100]

        //accessing items
        System.out.println(liste.get(0));

        //adding items with index

        liste.add(0,5);
        System.out.println(liste); //[5, 10, 70, 50, 40, 100]
        System.out.println(liste.get(0));

        //updating items
        liste.set(0,3);
        System.out.println(liste);  //[3, 10, 70, 50, 40, 100]

        //getting item of index

        System.out.println(liste.indexOf(10));
        System.out.println(liste.indexOf(50));
        System.out.println(liste.indexOf(500));

        //remove with index

        liste.remove(1);
        System.out.println(liste);  //[3, 70, 50, 40, 100]

        //add all

        liste.addAll(Arrays.asList(150,200));
        System.out.println(liste);  //[3, 70, 50, 40, 100, 150, 200]

        liste.addAll(1,Arrays.asList(10,20,30));  //index ten sonra işliyor
        System.out.println(liste); //[3, 10, 20, 30, 70, 50, 40, 100, 150, 200]

        //sort

        liste.sort(null);
        System.out.println(liste);  //[3, 10, 20, 30, 40, 50, 70, 100, 150, 200]
        System.out.println("******************************");

        liste.sort(Comparator.naturalOrder());  // sort ile aynı
        System.out.println(liste); ////[3, 10, 20, 30, 40, 50, 70, 100, 150, 200]

        liste.sort(Comparator.reverseOrder());  //sondan geriye sıralama
        System.out.println(liste);//  [200, 150, 100, 70, 50, 40, 30, 20, 10, 3]

        //sublist (from , to )  listeden belli bir kesit alır.....

        System.out.println(liste.subList(2,5));  //[100, 70, 50]

        List<Integer> liste1=liste.subList(2,5);
        System.out.println("liste 1 : " +liste1); // [100, 70, 50]

        System.out.println("*********************");

        System.out.println(liste);

        liste1.set(1,500);
        System.out.println(liste1);  //[100, 500, 50]

        liste.set(3,300);
        System.out.println(liste);  //[200, 150, 100, 300, 50, 40, 30, 20, 10, 3]

        System.out.println(liste1);  //[100, 300, 50]// liste de yaptıgım degisiklikler liste 1 i de etkileyecektir.

        //list iterator
//          [200, 150, 100, 300, 50, 40, 30, 20, 10, 3]

         ListIterator<Integer> listIterator=liste.listIterator();
        System.out.println(listIterator.hasNext());
        System.out.println(listIterator.next());

        while (listIterator.hasNext()){
            Integer next = listIterator.next();
            System.out.println(next);
            if (next>40){
                listIterator.remove();

            }

        }
        System.out.println("************");
        System.out.println(liste);

        System.out.println(listIterator.hasNext());
        System.out.println(listIterator.hasPrevious());

        while (listIterator.hasPrevious()){
             Integer previous = listIterator.previous();
             if (previous<40){
         //        listIterator.remove();
         //        listIterator.set(2022);
                 listIterator.add(333);
             }

        }
        System.out.println(liste);




    }
    }
