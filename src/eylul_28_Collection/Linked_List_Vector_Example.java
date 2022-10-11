package eylul_28_Collection;

import java.util.LinkedList;
import java.util.Vector;

public class Linked_List_Vector_Example {
    public static void main(String[] args) {

        LinkedList<String > linkedList=new LinkedList<>();

        linkedList.add("ali");
        linkedList.add("veli");
        linkedList.add("hasan");
        linkedList.add("tahsin");

        System.out.println(linkedList.add("murat"));
        System.out.println(linkedList.size());
        System.out.println(linkedList.get(4));
        System.out.println(linkedList.pop());
        System.out.println(linkedList.size());

        Vector<String > vector=new Vector<>();
        vector.add("ahmet");
        vector.add("ali");
        vector.add("ata");
        vector.add("ahmet");
        vector.add("yasin");
        vector.add("ibrahim");

        System.out.println(vector.size());


    }

}
