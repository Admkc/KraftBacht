package eylul_28_Collection.SET_Lesson;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set_Example_2 {
    public static void main(String[] args) {

        Set<Integer> set1=new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> set2=new HashSet<>(Arrays.asList(4,5,6,7,8));

        //union birlesim

        set1.addAll(set2);
        set1.forEach(p-> System.out.print(p+ " "));  //1 2 3 4 5 6 7 8

        //intersection kesişim

        set1.retainAll(set2);
        set1.forEach(p-> System.out.print(p+" "));//4 5

        //different item

        set1.removeAll(set2);
        set1.forEach(p-> System.out.print(p+" ")); //1 2 3

        set2.removeAll(set1);
        set2.forEach(p-> System.out.print(p+" "));  //6 7 8

        System.out.println("*************************************************");

        Set<String > set3=new HashSet<>();
        set3.add("elma");
        set3.add("armut");
        set3.add("uzum");
       // set3.add("elma");

        Set<String > set4=new HashSet<>();
        set4.add("elma");
        set4.add("armut");
        set4.add("karpuz");

        System.out.println(set3);
        System.out.println(set4);

        set3.addAll(set4);
        set3.forEach(p-> System.out.print(p +" "));  //birlesim

       set3.retainAll(set4);
        set3.forEach(p-> System.out.println(p+" "));  //kesisim

        set3.removeAll(set4);
        set3.forEach(p-> System.out.println(p));

        set4.removeAll(set3);
        System.out.println(set4);

        for (String str:set4){
            System.out.println("foreach " +set4);
        }


    }
}
