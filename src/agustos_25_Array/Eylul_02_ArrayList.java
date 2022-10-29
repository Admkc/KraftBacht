package agustos_25_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Eylul_02_ArrayList {
    //    get(),indexOf(),lastIndexOf()

    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();

        names.add("Adem");
        names.add("Mustafa");
        names.add("Talip");
        names.add("Alparslan");
        names.add("İhsan");
        names.add("Talha");
        names.add("Bilge");
        names.add("Bahar");
        names.add("Hatice");
        names.add("Cigdem");
        System.out.println("size :" +names.size());

        for(String str:names){
            System.out.print("isimler "+str);
        }
        System.out.println("******************");
        for(int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }
        System.out.println("*************");
        System.out.println(names.get(5));

        int alparslan=names.indexOf("Alparslan");
        System.out.println(alparslan);

        names.add("Hasan");
        System.out.println("names koy" +names);
        System.out.println("********************");

        names.set(3,"Hasan");
        System.out.println("set names " +names);

        System.out.println("indeks " +names.indexOf("Hasan"));
        System.out.println(" last indeks" +names.lastIndexOf("Hasan"));

        names.remove("Mustafa");
        System.out.println(" remove 2. names :" +names);

        names.remove("Hasan");
        System.out.println(" 2. remove " + names);

        System.out.println("last index bak" +names.lastIndexOf("Adem"));
        System.out.println(names.add("Adem"));

        // **********************   addAll(),removeAll()*************************************

        ArrayList<String> position=new ArrayList<>();

        position.add("QA");
        position.add("DEVELOPER");
        position.add("UXDESIGNER");
        position.add("DEVEPS ENGINEER");
        position.add("SCRUM MASTER");

        ArrayList<String > tools=new ArrayList<>();

        tools.add("SELENIUM");
        tools.add("JAVA");
        tools.add("FIGMA");
        tools.add("AZURE");
        tools.add("JIRA");

        position.addAll(tools);
        System.out.println(" position: " +position);
        System.out.println(" tools: " +tools);

        tools.addAll(position);
        System.out.println("tools :" +tools);

//       ArrayList<String> other = new ArrayList<>();
//        other.add("PRODUCT OWNER");
//
//        System.out.println("tools.removeAll(other) = " + tools.removeAll(other));


        tools.removeAll(position);
        System.out.println(tools);


        //   *************************** copy,contains(),containsAll*******************************

        ArrayList<String> weekDays=new ArrayList<>();

        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");

        ArrayList<String> allDays=new ArrayList<>(weekDays);
        System.out.println(allDays.get(1));

//        ArrayList<String > alterDay=allDays;
//        alterDay.set(0,"Pazartesi");
//        System.out.println(alterDay.set(0,"Pazartesi"));

        allDays.add("Saturday");
        allDays.add("Monday");
        System.out.println(allDays);

        System.out.println(allDays.get(1));
        System.out.println(allDays.indexOf("Tuesday"));
        System.out.println("== : " +allDays.get(1)=="Tuesday");
        System.out.println(" equals :" +allDays.get(1).equals("Tuesday"));

        System.out.println(allDays.containsAll(weekDays));
        System.out.println("weekdays : " +weekDays.containsAll(allDays));

   //******************************************************************************************

        ArrayList<String> fruitInBasket=new ArrayList<>();
        fruitInBasket.add("elma");
        fruitInBasket.add("armut");
        fruitInBasket.add("kayısı");
        fruitInBasket.add("üzüm");
        fruitInBasket.add("erik");

        ArrayList<String> fruitInPlate=new ArrayList<>();
        fruitInPlate.add("armut");
        fruitInPlate.add("kayısı");
        fruitInPlate.add("üzüm");

        fruitInBasket.removeAll(fruitInPlate);
        System.out.println(fruitInBasket);
        System.out.println("Equals :"  +fruitInPlate.equals(fruitInBasket));
        System.out.println(fruitInPlate==fruitInBasket);

 //       *******************************************************************************

        ArrayList<Integer> listOfNums=new ArrayList<>();

        listOfNums.add(5);
        listOfNums.add(10);
        listOfNums.add(15);
        listOfNums.add(20);
        listOfNums.add(25);
        listOfNums.add(100);
        listOfNums.add(100);
        listOfNums.add(500);

        System.out.println(listOfNums);

      System.out.println("\nsum(listOfNums) = " +sum(listOfNums));

        listeSayi(listOfNums);

 //soru 2
        ArrayList<Integer> list=getList(20);
        System.out.println(" list " +list);

        System.out.println(randomYap(20));

        ArrayList<String> stringNUms = new ArrayList<>();
//        "10","100","101","1000"
        stringNUms.add("10");
        stringNUms.add("100");
        stringNUms.add("101");
        stringNUms.add("1000");

        System.out.println(" soru 4: " +toIntListe(stringNUms));
        int i=toIntListe(stringNUms).get(0)+toIntListe(stringNUms).get(1);
        System.out.println("int i : " +i);

        System.out.println(" soru 5 ;" +Arrays.toString(toIntArr(stringNUms)));



    }

//    soru:1
//    5,10,15,15,20,25,25,100,100,500 rakamlarını listOfNums isili
//    bir ArrayListe atın ve
//    printListNumbers(listOfNums); methodu ile yazdıralım.
//            sum(listOfNums); methodu ile de toplam değeri döndürelim.
    public static int sum(ArrayList<Integer> nums){
        int toplam=0;
        for(Integer I:nums){
            toplam+=I;
        }
        return toplam;

        }
        public static void listeSayi(ArrayList<Integer> sayiNo){
        for(Integer I:sayiNo){
            System.out.print(I+" ");
        }
        }


//    soru 2
//    ArrayList<Integer> myList = getList(20);//return method
//System.out.println(myList);
//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
    public static ArrayList<Integer> getList(int a){           //recordigten bakk............
        ArrayList<Integer> mylist=new ArrayList<>();
        for(int k=0;k<a;k++){
            mylist.add(k);

        }
        return mylist;
    }

//   soru: 3
//    random(20); bir method oluşturup 20 size li 20 ye kadar random
//    rakamlardan oluşan bir ArrayList döndüren method oluşturalım.
//            Random class using example/Random class kullanım örneği
//            Random rm = new Random();
//    rm.nextInt(20)
   public static ArrayList<Integer> randomYap(int param){
    Random rano=new Random();
    ArrayList<Integer> myliste=new ArrayList<>();
    for (int i = 0; i < param; i++) {
        myliste.add(rano.nextInt(param)+1);
    }
    return myliste;

}

//    soru 4
//            "10","100","101","1000" sayılarını stringNums isimli arrayList e atalım.
//    toIntList(stringNums); methodu Integer bir arrayList e convert edip
//    döndürelim.
    public static ArrayList<Integer> toIntListe(ArrayList<String > stringNums){
        ArrayList<Integer> mylist=new ArrayList<>();
        for(String str:stringNums){
            mylist.add(Integer.valueOf(str));
      //      mylist.add(Integer.parseInt(str));   bu da olur********
        }
        return mylist;

    }

//    soru 5
//    stringNums isimli arrayList i
//    toIntArr(stringNums); methodu ile int bir array e convert edip
//    döndürelim
    public static int[] toIntArr(ArrayList<String> strlist){
        int[] arry=new int[strlist.size()];
        for(int i=0;i<strlist.size();i++){
            arry[i]=Integer.valueOf(strlist.get(i));

        }
        return arry;
    }

    // *********interwiev sorusu********
// kayan sayılar interview sorusu: Girilen sayılar kayma miktarına göre sağa kaydırılması
//        gerekmektedir. Fakat sağa doğru kayan sayılar soldan tekrar giriş yapabilmeli.
//                metod(sayilar,kaymaMiktari)
//
//        0,1,2,3,4,5 girildi kayma miktarı 2 ise 4, 5, 0, 1, 2, 3
//        0,1,2,3,4,5 girildi kayma miktarı 4 ise 2, 3, 4, 5, 0, 1

    public static ArrayList<Integer> sayiKaydir(int[] array, int kaymaMiktari){
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int sayi:array) {
            arrayList.add(sayi);
        }

        for(int i=0; i<kaymaMiktari; i++){
            arrayList.add(0,arrayList.remove(arrayList.size()-1));
        }
        return arrayList;

    }

}







