package Map.Set.Ekim_Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Map_Example_Main {
    public static void main(String[] args) {

        Map<Integer,Ogrenci> okul=new TreeMap<>();

        Ogrenci ogrenci1=new Ogrenci("Ali","Tas",89);
        Ogrenci ogrenci2=new Ogrenci("Veli","Sen",77);
        Ogrenci ogrenci3=new Ogrenci("Kazim","Kaz",58);
        Ogrenci ogrenci4=new Ogrenci("SerKan","Sert",86);

        okul.put(785,ogrenci1);
        okul.put(425,ogrenci2);
        okul.put(236,ogrenci3);
        okul.put(368,ogrenci4);

        okul.put(2046,new Ogrenci("Harun","Isık",5));

        System.out.println(okul.get(425).getAverageNo());
       okul.get(785).setAverageNo(99);
        System.out.println(okul.get(785).getAverageNo());

        okul.get(368).setSurName("kilic");
        System.out.println(okul.get(368).getSurName());


        List<Ogrenci> liste=new ArrayList<>();
        liste.add(ogrenci1);
        liste.add(ogrenci2);
        liste.add(ogrenci3);
        liste.add(ogrenci4);

        System.out.println(liste.get(2).getAverageNo());

    }
}
