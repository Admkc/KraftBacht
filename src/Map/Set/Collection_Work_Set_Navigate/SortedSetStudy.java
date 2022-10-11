package Map.Set.Collection_Work_Set_Navigate;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetStudy {
    public static void main(String[] args) {
        SortedSet<Integer> intSortedSet=new TreeSet<>();
        //   Set<Integer> intSortedSet=new TreeSet<>();
        //   NavigableSet<Integer> intSortedSet=new TreeSet<>();

        intSortedSet.add(2);
        intSortedSet.add(2);
        intSortedSet.add(10);
        intSortedSet.add(10);
        intSortedSet.add(10);

        System.out.println("intSortedSet = " + intSortedSet);

        System.out.println("intSortedSet.first() = " + intSortedSet.first());//2

        System.out.println("intSortedSet.last() = " + intSortedSet.last());//10

        intSortedSet.addAll(Arrays.asList(25,35,45));
        System.out.println("intSortedSet = " + intSortedSet);//[2, 10, 25, 35, 45]

   //     System.out.println("intSortedSet.add(null) = " + intSortedSet.add(null));  //null degeri almaz

        //subset     [2, 10, 25, 35, 45]
        System.out.println("intSortedSet.subSet(25,45) = " + intSortedSet.subSet(25, 45));//[25, 35]

        System.out.println("intSortedSet.subSet(1,48) = " + intSortedSet.subSet(1, 48));//[2, 10, 25, 35, 45]

        System.out.println("intSortedSet.subSet(13,39) = " + intSortedSet.subSet(13, 39));//[25, 35]

        //headset()
        System.out.println("intSortedSet.headSet(35) = "
                + intSortedSet.headSet(35));//intSortedSet.headSet(35) = [2, 10, 25]
        System.out.println("intSortedSet.headSet(13) = " + intSortedSet.headSet(13));//[2,10]

        //tailset()

        System.out.println("intSortedSet.tailSet(25) = " + intSortedSet.tailSet(25));//[25, 35, 45]
        System.out.println("intSortedSet.tailSet(13) = " + intSortedSet.tailSet(13));//[25, 35, 45]


             //[2, 10, 25, 35, 45]

        SortedSet<Integer> myTailset=intSortedSet.tailSet(25);

        System.out.println("myTail = " + myTailset);//[25, 35, 45]

        System.out.println("myTailset.remove(10) = " + myTailset.remove(10));//false
        System.out.println("myTailset.remove(25) = " + myTailset.remove(25));//true
        System.out.println("myTailset = " + myTailset); //[ 35, 45]
        System.out.println("intSortedSet = " + intSortedSet);//[2, 10, 35, 45]


    }
}
