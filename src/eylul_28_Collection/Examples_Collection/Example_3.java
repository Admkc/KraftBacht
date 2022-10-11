package eylul_28_Collection.Examples_Collection;

import java.util.*;

public class Example_3 {
    public static void main(String[] args) {

        Integer[] arr1={0,2,0,4,5};
        List<Integer> listem=new ArrayList<>(Arrays.asList(arr1));
     //   System.out.println(zeroAddListEnd(listem));
     //   System.out.println(zeroAddListListEnd2(listem));
     //   String [] sary={"ali","veli","mehmet","hasan"};
      //  List<String > listem2=new ArrayList<>(Arrays.asList(sary));
     //   System.out.println(removeName(listem2,"mehmet"));

        String [] sary={"ey,  edip, adanada, pide, ye  ey, edip,pide, ye"};
        List<String > listem2=new LinkedList<>(Arrays.asList(sary));







    }

    // **************interview question***************
    // list içerindeki tüm sıfırları listin sonu yazan metotu yazınız
    // giriş: 0,2,3,5,0,4,5      çıkış: 2,3,5,4,5,0,0

    public static List<Integer> zeroAddListEnd(List<Integer> list){

        int originalSize=list.size();
        list.removeAll(Arrays.asList(0));
        int newSize=list.size();
        int totalSize=originalSize-newSize;
        for (int i=0;i<totalSize;i++){
            list.add(0);
        }
        return list;

    }
    public static List<Integer> zeroAddListListEnd2(List<Integer> list){
        List<Integer> listem=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if (!list.get(i).equals(0)){
                listem.add(list.get(i));

            }
        }
        int toplamSize=list.size()- listem.size();
        for (int i=0;i<toplamSize;i++){
            listem.add(0);

        }
        return listem;

    }
    //*********************interwiew question
    //List icerisinde ismi Mehmet olanları sil.
    public static List<String > removeName(List<String> liste,String data){

        Iterator<String > iter=liste.iterator();
        while (iter.hasNext()){
            if (iter.next().equalsIgnoreCase(data)){
                iter.remove();
            }

        }
        return liste;

    }





    }









