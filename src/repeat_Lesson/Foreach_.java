package repeat_Lesson;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Foreach_ {
    public static void main(String[] args) {
        //foreach
        //iterator is fixed
        //there must be data structure

        int[] nums=new int[8];
        nums[0]=2;        
        nums[1]=8;
        nums[2]=9;
        nums[3]=11;
        nums[4]=25;
        nums[5]=29;
        nums[6]=39;
        nums[7]=79;

        for (int each:nums){
            System.out.print(each+" ");

            System.out.println("*********************");

        }
        SortedSet<Integer> sorted=new TreeSet<>(Arrays.asList(3,6,67,23,1,11,58,96,41,1,2,7));

        System.out.println(sorted);//[1, 2, 3, 6, 7, 11, 23, 41, 58, 67, 96]
        for (Integer each:sorted){
            System.out.println("each " +each);
        }


            

        
    }
    
}
