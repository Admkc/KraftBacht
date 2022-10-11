package map_İnterface;

import java.util.*;

public class Map_İnterface_Study2 {
    public static void main(String[] args) {


        Map<String,Integer> ageMap=new HashMap<>();

        //put()
        ageMap.put("Mehmet",25);
        ageMap.put("Hatice",24);
        ageMap.put("Ayse",22);
        ageMap.put("Metin",50);
        ageMap.put("Osman",37);
        ageMap.put("Zeynep",24);
        ageMap.put("Veli",24);
        ageMap.put("Ahmet",45);

        Set<String> stringSet= ageMap.keySet();
        System.out.println("stringSet = " + stringSet);//[Ahmet, Veli, Ayse, Zeynep, Mehmet, Osman, Hatice, Metin]

        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()){
          String  next= iterator.next();
            if(ageMap.get(next)>25){
                iterator.remove();
            }

        }
        System.out.println("agemap " +ageMap);// {Veli=24, Ayse=22, Zeynep=24, Mehmet=25, Hatice=24}

        for (String each:stringSet){
            System.out.println("each " +each+ "--> " +ageMap.get(each));
        }
        //Coolection<V>  values()
        Collection<Integer> value=ageMap.values();
        System.out.println("value = " + value);//[24, 22, 24, 25, 24]

        Iterator<Integer> iterValues =value.iterator();
        while (iterValues.hasNext()){
           Integer  next= iterValues.next();
            if(next<24){
                iterValues.remove();

    }
}
        System.out.println("value :" +value);//[24, 24, 25, 24]
        System.out.println("agemap :"+ageMap);//{Veli=24, Zeynep=24, Mehmet=25, Hatice=24}

        System.out.println(iterValues.hasNext()); //false

        Iterator<Integer> iterValues2=value.iterator();

        System.out.println("iterValues2.hasNext() = " + iterValues2.hasNext());//true

        Set<Map.Entry<String ,Integer>> entries=ageMap.entrySet();

        for (Map.Entry<String ,Integer> eachEntry: entries){
            System.out.println(eachEntry.getValue());

            if (eachEntry.getValue()==24){
                eachEntry.setValue(eachEntry.getValue()+10);


            }

        }
        System.out.println(ageMap);
        ageMap.forEach((K,V)-> System.out.println(K+" "+V));

        NavigableMap<Integer,String> navMap =
                new TreeMap<>();
        navMap.put(25,"Mehmet");
//        navMap.put(24,"Hatice");
        navMap.put(22,"Ayşe");
        navMap.put(50,"Metin");
        navMap.put(37,"Osman");
//        navMap.put(24,"Zeynep");
        navMap.put(24,"Veli");
        navMap.put(45,"Ahmet");

        System.out.println("navMap = " + navMap);
        System.out.println("navMap.descendingKeySet() = "
                + navMap.descendingKeySet());
        //[50, 45, 37, 25, 24, 22]

    }
    }
