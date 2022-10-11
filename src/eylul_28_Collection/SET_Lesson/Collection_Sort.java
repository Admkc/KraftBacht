package eylul_28_Collection.SET_Lesson;

import java.util.*;

public class Collection_Sort {
    public static void main(String[] args) {

        List<Integer > list=new ArrayList<>(Arrays.asList(61,2,3,4,5,99,87,7,9,11,12,15,19));

        list.forEach(p-> System.out.print(p+" "));

        System.out.println();

        Collections.sort(list);
        list.forEach(p-> System.out.print(p+" "));
    }
}
