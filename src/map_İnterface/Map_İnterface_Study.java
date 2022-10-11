package map_İnterface;

import java.util.HashMap;
import java.util.Map;

public class Map_İnterface_Study {
    public static void main(String[] args) {

        Map<String,Integer> ageMap=new HashMap<>();

        //put()
        ageMap.put("Mehmet",25);
        ageMap.put("Ahmet",24);
        ageMap.put("Ayse",22);

        //size()
        System.out.println("ageMap.size() = " + ageMap.size());

        //get()
        System.out.println("ageMap.get(\"Mehmet\") = " + ageMap.get("Mehmet"));// 25

        //****
        int ageOfMehmet=ageMap.get("Mehmet");  //unboxed

        //containsKey()

        System.out.println("ageMap.containsKey(\"Mehmet\") = " + ageMap.containsKey("Mehmet"));

        //remove()

        System.out.println("ageMap.remove(\"Mehmet\") = " + ageMap.remove("Mehmet"));//25

        System.out.println("ageMap = " + ageMap);//{Ahmet=24, Ayse=22}

        //putAll()
        Map<String ,Integer> ageMap2=new HashMap<>();
        ageMap2.put("Metin",null);
        ageMap2.put("Osman",37);
        ageMap2.put("Hakan",24);
        ageMap2.put("Ahmet",25);

        ageMap.putAll(ageMap2);
        System.out.println("ageMap = " + ageMap);

        //clear()

        ageMap2.clear();
        System.out.println("ageMap2 = " + ageMap2); //{
        System.out.println("ageMap = " + ageMap);//{Ahmet=25, Ayse=22, Osman=37, Hakan=24, Metin=null}

        //putIfAbsent()
        System.out.println("ageMap.putIfAbsent(\"Osman\",38) = " + ageMap.putIfAbsent("Osman", 38));//37
        Integer integer=ageMap.putIfAbsent("Osman" ,37);//37
        System.out.println("ageMap.putIfAbsent(\"Metin\",23) = " + ageMap.putIfAbsent("Metin", 23));
        System.out.println("ageMap = " + ageMap);


        //getOrDefault()

        System.out.println("ageMap.getOrDefault(\"Ayse\",22) = " + ageMap.getOrDefault("Ayse", 25));

        int ayse= ageMap.getOrDefault("Ayse",22);
        System.out.println("ageMap = " + ageMap);//{Ahmet=25, Ayse=22, Osman=37, Hakan=24, Metin=23}

        //replace()
        System.out.println("ageMap.replace(\"Ayse\",24) = " + ageMap.replace("Ayse", 24));//22

        System.out.println(ageMap);//{Ahmet=25, Ayse=24, Osman=37, Hakan=24, Metin=23} yası degisti aysenin

        System.out.println("ageMap.replace(\"Ayse\",24,25) = " + ageMap.replace("Ayse", 24, 25));//true
        System.out.println(ageMap);//{Ahmet=25, Ayse=25, Osman=37, Hakan=24, Metin=23}


    }



}
