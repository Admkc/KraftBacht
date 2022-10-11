package Map.Set.Collection_Work_Set_Navigate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set_İnterface_Study {
    public static void main(String[] args) {
        Set<Long> longSet=new HashSet<>();

        System.out.println("longSet.add(7l) = " + longSet.add(7l)); //true
        System.out.println("longSet.add(7l) = " + longSet.add(7l)); //false
        System.out.println("longSet.add(7l) = " + longSet.add(7l));//false
        longSet.add(70l);
        longSet.add(70l);
        longSet.add(70l);

        System.out.println("longSet = " + longSet);  //[70, 7]

        //for ile yazdırma
        for (Long each:longSet){
            System.out.println(longSet);  //70,7
        }

        longSet.addAll(Arrays.asList(2l,3l,4l,4l,4l));
        System.out.println("longSet = " + longSet);  //[2, 3, 4, 70, 7]

        System.out.println("longSet.add(null) = " + longSet.add(null));//set icinde null yok true dondurdu
        System.out.println("longSet.add(null) = " + longSet.add(null));//set icinde null var false dondurdu
        System.out.println("longSet.add(null) = " + longSet.add(null));
        System.out.println("longSet = " + longSet);

        if (! longSet.add(70l)){
            //item varsa false  ,  ! oldugu icin true dondurur.if te calisir.
            longSet.remove(70l);
        }
        System.out.println("longSet = " + longSet); //[null, 2, 3, 4, 7]    70 gitti


    }
}
