package eylul_28_Collection.Examples_Collection;

import java.util.*;

public class Example_2 {
    public static void main(String[] args) {

        List<Integer> liste1=new ArrayList<>();
        liste1.add(5);
        liste1.add(2);
        List<String > liste2=new LinkedList<>();
        List<Double>  liste3=new Vector<>();
        List<Object>  liste4=new ArrayList<>();
        liste4.add(liste1);
        liste4.add(liste2);
        liste4.add(liste3);
        System.out.println(liste4.get(0));// [5,2]

        List<Object> liste5=new ArrayList<>();
        liste5.add(liste4);
        System.out.println(liste5);  //[[[5, 2], [], []]]



        //pratik calisma

        // "bir berber bir berbere gel beraber bir berber dükkanı açalım demiş:sad asdas sadsa"

        String str="bir berber bir berbere gel beraber bir berber dükkanı açalım demiş:sad asdas sadsa";

        String [] sary=str.split(" ");
        System.out.println(Arrays.toString(sary));
        List<String> listsary=new ArrayList<>(Arrays.asList(sary));
        System.out.println(listsary);






    }
}
