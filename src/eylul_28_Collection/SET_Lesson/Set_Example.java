package eylul_28_Collection.SET_Lesson;

import java.util.*;

public class Set_Example {
    public static void main(String[] args) {

        Set<Integer> set=new HashSet<>();
        set.add(5);
        set.add(10);
        set.add(15);
        set.add(5);
        set.add(30);
        System.out.println(set);

        Set<String > set1=new HashSet<>();
        set1.add("ali");
        set1.add("35");
        set1.add("hasan");
        set1.add("ali");

        System.out.println(set1);

        //*********hangi harflerin gectigini yazdır

        String str="bugun eve cok gec geldim,yoruldum ama cok mutluyum";
       str=str.replace(" ","");
       str=str.replace(",","");
       String [] sarry=str.split("");


       //1.yöntem

        Set<String > setary=new HashSet<>();

       for (int i=0;i<sarry.length;i++){
           setary.add(sarry[i]);

       }
        System.out.println(setary);

      // 2.yontem
        Set<String > setarry2=new HashSet<>(Arrays.asList(sarry));
        System.out.println(" 2. yontem : "+setarry2);

        //eger Listin icine alsam

        List<String > strArray=new ArrayList<>(Arrays.asList(sarry));
        System.out.println("list : " +strArray);

        //hash set ile tree set farkını gor

        Integer[] arry={1,2,3,7,9,45,78,6,5,1,2,3,7,99,65,7,2};

        Set<Integer > setset=new HashSet<>(Arrays.asList(arry));
        Set<Integer>  setset2=new TreeSet<>(Arrays.asList(arry));
        System.out.println("hashset : " +setset);  //[1, 65, 2, 3, 99, 5, 6, 7, 9, 45, 78]
        System.out.println("treset : " +setset2);// [1, 2, 3, 5, 6, 7, 9, 45, 65, 78, 99]














    }



    }

