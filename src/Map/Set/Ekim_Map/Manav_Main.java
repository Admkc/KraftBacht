package Map.Set.Ekim_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Manav_Main {
    public static void main(String[] args) {

        Map<String ,Manav> manav=new TreeMap<>();

        manav.put("02Elma02/",new Manav("Elma",5));
        manav.put("1/Ayva*/",new Manav("Ayva",14.6));

        manav.get("02Elma02/").setFiyat(11.5);
        System.out.println(manav.get("02Elma02/").getFiyat());
        manav.get("02Elma02/").fiyatArttir(12);
        System.out.println(manav.get("02Elma02/").getFiyat());

        //for
        for (String key:manav.keySet()){
            System.out.println(manav.get(key).getFiyat());
        }

        //tpolam fiyatı almak icin

        double toplamFiyat=0;
        for (String key:manav.keySet()){
            toplamFiyat+=manav.get(key).getFiyat();
        }
        System.out.println(Math.round(toplamFiyat));

        //map different example;

        Map<String,Integer> map=new HashMap<>();
        map.put("erik",20);
        map.put("kiraz",15);

        int result=map.get("erik")+15;
        System.out.println(result);

        int a=map.get("kiraz")*2;
        System.out.println(a);

        //for ile toplam alma

        int result1=0;

        for(String num:map.keySet()){
            result1+=map.get(num);
        }
        System.out.println(result1);

        map.forEach((k,v)-> System.out.println(k));
        map.forEach((k,v)-> System.out.println(v));
        map.forEach((k,v)-> System.out.println(k+" "+v));


    }







}
