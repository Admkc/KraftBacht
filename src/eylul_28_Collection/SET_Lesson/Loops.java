package eylul_28_Collection.SET_Lesson;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Loops {
    public static void main(String[] args) {
        Integer[] arry={1,2,3,4};

        Set<Integer> set=new TreeSet<>(Arrays.asList(arry));

 /*

        //for loop

       for (int i = 0; i < arry.length; i++) {
           System.out.println("for loop " +arry[i]);

        }

        // while

        int i=0;
        while (i<arry.length){
            System.out.println("while "+arry[i]);
            i++;
       }

        //do ---while

        do{
            System.out.print("do while " +arry[i]);
           i++;
        }while (i<arry.length);

        //for each

        for (Integer num:set){
           System.out.print("for each " +num);
        }
       //iterator

       Iterator<Integer> iter=set.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
       }
*/
       //  forEach metodu                                                     sor   p-> ismi neydi************
        set.forEach(p-> System.out.println(p+2));  //iki artırarak yazdırır
        set.forEach(p-> System.out.println(p));







}
    }