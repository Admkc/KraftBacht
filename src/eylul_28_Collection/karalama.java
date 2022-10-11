package eylul_28_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class karalama {
    public static void main(String[] args) {

        Collection<Integer> col=new ArrayList<>(Arrays.asList(3,8,9,4,57,845,66,32,41));

        System.out.println(col);


        Iterator<Integer> iter=col.iterator();

        System.out.println(iter.next());
        System.out.println(iter.next());
        System.out.println(iter.hasNext());

    }
}
