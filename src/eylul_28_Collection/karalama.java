package eylul_28_Collection;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class karalama {
    public static void main(String[] args) {
        Map<Integer,String > map=new LinkedHashMap<>();

        map.put(1905,"GS");
        map.put(1903,"BJK");
        map.put(1907,"FB");
        map.put(1961,"TS");
        map.forEach((k,v)-> System.out.println(k+" "+v));

        System.out.println(map.get(1905));
        System.out.println(map.toString());
        System.out.println(map.containsKey(1903));
        System.out.println(map.keySet());
        System.out.println(map.values());
        for (Integer each:map.keySet()){
            System.out.println(map.get(each));
        }

        Map<Integer,String > fenA=new LinkedHashMap<>();
        fenA.put(888,"veli");
        fenA.put(777,"ali");
        fenA.put(999,"alkan");
        fenA.put(325,"ahmet");

        Map<Integer,String > fenB=new LinkedHashMap<>();
        fenB.put(456,"kazim");
        fenB.put(478,"tahsin");
        fenB.put(785,"dursun");
        fenB.put(369,"lale");

        List<Map<Integer,String >> okul=new ArrayList<>();

        okul.add(fenA);
        okul.add(fenB);
        System.out.println(okul);
        System.out.println(okul.size());
        System.out.println(fenA.get(999));
        System.out.println(okul.get(1).get(456));

        for (Map<Integer,String > each:okul){
            for(Integer each1:each.keySet()){
                System.out.println(each.get(each1));
            }
        }


    }






    }








