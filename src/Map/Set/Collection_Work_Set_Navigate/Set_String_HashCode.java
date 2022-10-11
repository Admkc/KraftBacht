package Map.Set.Collection_Work_Set_Navigate;

import java.util.HashSet;
import java.util.Set;

public class Set_String_HashCode {
    public static void main(String[] args) {
        //Hashcode her nesne oluşturma için JVM tarafından oluşturulan benzersiz bir koddur ..

        System.out.println(new String("Murat").hashCode());//74709341

        System.out.println("Murat".hashCode());// 74709341

        Set<String > stringSet=new HashSet<>();
        stringSet.add("Murat");
        stringSet.add("Hakan");
        stringSet.add("Murat");

        System.out.println("string set "+stringSet); //[Hakan, Murat]


        Student_HashCode ogrenci1=new Student_HashCode("Adem",8);
        Student_HashCode ogrenci2=new Student_HashCode("Adem",8);
        Student_HashCode ogrenci3=new Student_HashCode("Adem",8);

        System.out.println(ogrenci1.hashCode());//931919113
        System.out.println(ogrenci2.hashCode());//1607521710
        System.out.println(ogrenci3.hashCode());//764977973

        System.out.println(ogrenci1.equals(ogrenci2));//false

        //Generate equals and hashCode yapınca
        //hash kodlar esitlenir


        System.out.println(ogrenci1.hashCode());//63109374
        System.out.println(ogrenci2.hashCode());//63109374
        System.out.println(ogrenci3.hashCode());//63109374

        System.out.println(ogrenci1.equals(ogrenci2));//true




        Set<Object> studentSet=new HashSet<>();
        studentSet.add(ogrenci1);
        studentSet.add(ogrenci2);
        studentSet.add(ogrenci3);

        System.out.println(studentSet);//[FreeWork.Student@378bf509, FreeWork.Student@2d98a335, FreeWork.Student@5fd0d5ae]
        System.out.println(studentSet.size());  //3


    }
}
