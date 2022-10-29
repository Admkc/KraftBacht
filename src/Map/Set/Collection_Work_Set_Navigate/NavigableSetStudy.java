package Map.Set.Collection_Work_Set_Navigate;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetStudy {
    public static void main(String[] args) {

        //    SortedSet<Integer> intSortedSet=new TreeSet<>();
        //   Set<Integer> intSortedSet=new TreeSet<>();
        NavigableSet<Integer> intSortedSet=new TreeSet<>();

        intSortedSet.add(35);
        intSortedSet.add(2);
        intSortedSet.add(2);
        intSortedSet.add(10);
        intSortedSet.add(40);
        intSortedSet.add(20);
        intSortedSet.add(50);
        intSortedSet.add(50);

        System.out.println("intSortedSet = " + intSortedSet);//[2, 10, 20, 35, 40, 50]

        //lower()

        System.out.println("intSortedSet.lower(39) = " + intSortedSet.lower(23));//20

        //higher()

        System.out.println("intSortedSet.higher(30) = " + intSortedSet.higher(30));//35

        //floor()  en yakın alt degeri veriyor

        System.out.println("intSortedSet.floor(26) = " + intSortedSet.floor(26));//20

        //ceiling()  en yakın ust degeri veriyor

        System.out.println("intSortedSet.ceiling(33) = " + intSortedSet.ceiling(33));//35

        //pollfirst

        System.out.println("intSortedSet.first() = " + intSortedSet.first());//2
        System.out.println("intSortedSet = " + intSortedSet);//[2, 10, 20, 35, 40, 50]

        System.out.println("intSortedSet.pollFirst() = " + intSortedSet.pollFirst());//2
        System.out.println("intSortedSet = " + intSortedSet);// sonrasında 2 cıkıyor  [10, 20, 35, 40, 50]

        //polllast

        System.out.println("intSortedSet.pollLast() = " + intSortedSet.pollLast()); //50
        System.out.println(intSortedSet); //[10, 20, 35, 40]    50 yi atıyor

        //descending set   tersten yazıyor
        intSortedSet.addAll(Arrays.asList(50,60,70,80));

        System.out.println("intSortedSet.descendingSet() = "
                + intSortedSet.descendingSet());//[80, 70, 60, 50, 40, 35, 20, 10]

        //subset()

        System.out.println("intSortedSet.subSet(30,true,70,false) = "
                + intSortedSet.subSet(30, true, 70, false));//[35, 40, 50, 60]

        System.out.println("intSortedSet.subSet(13,false,41,true) = "
                + intSortedSet.subSet(13, true, 41, true));//[20, 35, 40]

        //headset()

        System.out.println("intSortedSet.headSet(40,false) = "
                + intSortedSet.headSet(40, false));//[10, 20, 35]

        //tail.set()

        System.out.println("intSortedSet.tailSet(40,false) = "
                + intSortedSet.tailSet(40, false));//[50, 60, 70, 80]

        //iterator()

        Iterator<Integer> iter=intSortedSet.iterator();
        while (iter.hasNext()){
            int next=iter.next();
            if (next>40){
                iter.remove();
            }

        }
        System.out.println("lastintSortedSet = " + intSortedSet);// [10, 20, 35, 40]



    }
    }

