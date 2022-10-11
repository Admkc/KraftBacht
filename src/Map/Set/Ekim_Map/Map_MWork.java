package Map.Set.Ekim_Map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Map_MWork {
    public static void main(String[] args) {

        Map<Integer,String > map=new LinkedHashMap<>();

        map.put(1905,"GS");
        map.put(1903,"BJK");
        map.put(1907,"FB");
        map.put(1961,"TS");

        map.forEach((k,v)-> System.out.println(k+" "+v));

        System.out.println(map.get(1905));

        System.out.println(map.size());

        System.out.println("to string " +map.toString()); //{1905=GS, 1903=BJK, 1907=FB, 1961=TS}

        System.out.println(map.containsKey(1903));

        System.out.println(map.containsValue("FB"));

       map.replace(1905, "cimbombom");

        System.out.println(map);
        System.out.println("key set " +map.keySet());//key set [1905, 1903, 1907, 1961]
        System.out.println("value "+map.values());  //value [cimbombom, BJK, FB, TS]

        //for ile yazdırmak icin

        for (Integer num:map.keySet()){
            System.out.println(map.get(num));
        }

        System.out.println("***************************************************");

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
        System.out.println(okul.toString());
        System.out.println(okul.size());

        System.out.println(fenA.get(999)); //    alkan

        System.out.println(okul.get(1).get(456));   //kazim   fenb 1.index oluyurrrr ***burası onemli

        //butun verileri cekmek icin

        for (Map<Integer,String > sinif:okul){
            for (Integer key:sinif.keySet()){
                System.out.println(sinif.get(key));
            }

            for (int i=0;i<okul.size();i++){
                for (Integer key:okul.get(i).keySet()){
                    System.out.println(okul.get(i).get(key));
                }
            }
        }



    }


}
