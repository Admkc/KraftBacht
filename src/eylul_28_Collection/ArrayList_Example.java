package eylul_28_Collection;


import java.util.ArrayList;

public class ArrayList_Example {
    public static void main(String[] args){


       ArrayList<String > arrayList=new ArrayList<>();

        arrayList.add("ahmet");
        arrayList.add("mehmet");
        arrayList.add("ayse");
        arrayList.add("ahmet");

        System.out.println("arrayList.size : " +arrayList.size());
        System.out.println("arrayList.indexOf: " +arrayList.indexOf("ayse"));
        System.out.println("arrayList.lastIndexOf:  " +arrayList.lastIndexOf("ahmet"));
        System.out.println("arrayList.get: " +arrayList.get(3));


    }
}
