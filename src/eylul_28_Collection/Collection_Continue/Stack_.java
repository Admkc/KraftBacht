package eylul_28_Collection.Collection_Continue;

import java.util.Arrays;
import java.util.Stack;

public class Stack_ {
    public static void main(String[] args) {


        Stack<Integer> stc=new Stack<>();
        stc.addAll(Arrays.asList(2,4,6,7,8));
        System.out.println(stc);

        //push()

        stc.push(1);
        System.out.println(stc);  //  LİFO--> [2, 4, 6, 7, 8, 1]   sonuna ekliyor
        stc.push(11);
        System.out.println(stc);  //[2, 4, 6, 7, 8, 1, 11]

        //pop()  remove yapar

        System.out.println(stc.pop()); //11   remove yaptıgı metodu dondurur.
        System.out.println(stc);  //[2, 4, 6, 7, 8, 1]

        //peek
        System.out.println(stc.peek());  //1    en usttekini verir

        System.out.println(stc);//[2, 4, 6, 7, 8, 1]

        //search
        System.out.println(stc.search(8)); //2     yani 8 2.sırada  sondan sayar
        System.out.println(stc.search(11)); //olmadıgı icin -1 verir



    }
}
