package eylul_28_Collection.Collection_Continue;

import java.util.Arrays;
import java.util.Vector;

public class Vector_ {
    public static void main(String[] args) {

        Vector<String> vec=new Vector<>();
        vec.add("nn");
        System.out.println(vec.size());
        System.out.println(vec);

        //add all
        vec.addAll(Arrays.asList("aa","bb","ab","kk","ss"));
        System.out.println(vec); //[nn, aa, bb, ab, kk, ss]

        //addElement()

        vec.addElement("gs");
        System.out.println(vec); //[nn, aa, bb, ab, kk, ss, gs]

        //capasity()      ****sor

        System.out.println(vec.size());  //7
        System.out.println(vec.capacity()); //10

        //clear()
  //      vec.clear();
  //      System.out.println(vec);  //[]

        //clone()
         Object clone = vec.clone();
        System.out.println(clone); //[nn, aa, bb, ab, kk, ss, gs]

        //contain()
        System.out.println(vec.contains("gs"));

        //ContainsAll()
        System.out.println(vec.containsAll(Arrays.asList("nn", "gs")));

        //copyInto()
        String[] strings=new String[8];
       strings[0]="1";

        vec.copyInto(strings);
        System.out.println(Arrays.toString(strings));//[nn, aa, bb, ab, kk, ss, gs, null]

       //ensureCapacity
        System.out.println(vec.capacity());
        vec.ensureCapacity(30);
        System.out.println(vec.capacity());

        //trimToSize()   mevcut size i verir
        vec.trimToSize();
        System.out.println(vec.capacity());

        //set()
        vec.set(2,"cbb");
        System.out.println(vec);

        //setElementAt()
        vec.setElementAt("arslan",2);
        System.out.println(vec);


    }
}
