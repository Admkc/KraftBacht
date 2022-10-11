package eylul_28_Collection.Collection_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Iterating {  //mean: yenilemek
    public static void main(String[] args) {

        Collection<Integer>
                cll=new ArrayList<>(Arrays.asList(3,5,7,10,20));
//        for (Integer each:cll){
//            System.out.print(cll);
//            if (each>5){
//                cll.remove(each);
//            }
//        }//we can not use remove and update item
//
         Iterator<Integer> iterator = cll.iterator();  //iterator itaration interface in altında bir metot
//
//        //next()
//
//        System.out.println(iterator.next());  //3
//   //     System.out.println(iterator.next());  //5
//   //     System.out.println(iterator.next());  //7
//
//        //remove
//        iterator.remove(); // 5,7,10,20
//    //    iterator.remove();// hata verir removedan once next yapılmalıdır
//        System.out.println(iterator.next());
//       // iterator.remove();
//        iterator.remove();
//        System.out.println(cll);

  // 3,5,7,10,20

        while (iterator.hasNext()){
             Integer next = iterator.next();
            System.out.println(next);
            if (next>5){   //   if(next%2==0)   cift sayilari atar remove
                iterator.remove();
            }

        }
        System.out.println(cll);  //[3, 5]

        System.out.println(iterator.hasNext());  //false donduruyor

    }



}
