package agustos_12Ders;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class agustos_18_Ders_String {
    public static void main(String[] args) {

// task 2        System.out.println("fullNameLenght " +fullNameLenght());
 //  task 3     buyukHarf();
 //  2,yol     System.out.println(fullNameUpper());
 //       System.out.println(lastIndex());

 // task 5       charaltAlta();

 //       String str8="merhaba arkadaslar";
 //       System.out.println(str8.contains("daş"));    //***CONTAİNS true veya false

 //       String str8="   merhaba       arkadaslar         ";

 //       System.out.println(str8.trim());            // ***trim boslugu alır sag ve sol sadece

//        String str9="galatasarayi seviyorum";
//        System.out.println(str9.replace("galatasarayi","besiktasi"));  //   ****replace

//        String str9="galatasarayi seviyorum        ";
 //       System.out.println(str9.trim().replace("galatasarayi","besiktasi"));

 //       String str10="anne baba betul";
 //       System.out.println(str10.indexOf("betul"));
 //       System.out.println(str10.indexOf("e"));

//        System.out.println(boslukAlma("   ser   gen           "));

// task 6:        System.out.println(boslukAlma("     ali            "));

// task 7:        System.out.println(dateStamp("18/10/2022 20:50:55"));

 //       System.out.println(dateStamp2("18/10/2022", "20:50:55"));

// task 8        System.out.println(findCharİnSecond("talip", "satir"));

    }


/*        String str="persembe";
         System.out.println(str.length());
         String str2="";
        System.out.println(str2.length());
         int i=str.length();
        System.out.println(i);

        String str3="persembe ve CuMA gunLEri";
        System.out.println(str3.toLowerCase());
        System.out.println(str3.toUpperCase());

        String str4="persembe";
        System.out.println("str4.charAt(7)" +str4.charAt(7));
        System.out.println(str4.charAt(0));
        System.out.println(str4.charAt(str4.length()-1));
        System.out.println(str4.charAt(str4.length()-2));


        String str5="classpath C:\\Users\\esc\\IdeaProjects\\KraftBacht\\out\\production\\KraftBacht agustos_12Ders.agustos_18_Ders_String";
        System.out.println(str5.length());
        System.out.println(str5.charAt(109));
        System.out.println(str5.charAt(str5.length()-1));


        String str6="merhaba arkadaslar ";
        String str7="nasilsiniz";
        System.out.println(str6.concat(str7));
        String concat=str6.concat(str7);
        System.out.println("concat :" +concat);

        Task 1:
        Konsoldan kullanıcıdan bir mesaj alın ve method onun karakter sayısını versin.

        Scanner scan=new Scanner(System.in);
        String mesaj=scan.nextLine();
        System.out.println("karakter sayisi :" +karakterSayisi(mesaj));
    }
    public static int karakterSayisi(String str){
        return str.length();
    }
     task:2
        Adınızın ve soyadınızın kaç karakterden oluştuğunu konsola yazdırın.

        public static int fullNameLenght(){
            Scanner scan=new Scanner(System.in);
              String ad=scan.nextLine();
              String soyad=scan.nextLine();
              return ad.length()+soyad.length();
        }
        Task3
        Adınızın ve soyadınızı büyük harfle yazdıran bir method yazın.

    public static void buyukHarf(){
        Scanner scan=new Scanner(System.in);
        String ad=scan.nextLine();
        String soyad=scan.nextLine();
        System.out.println(ad.toUpperCase()+ " " +soyad.toUpperCase());
}
        2.yol:

    public static String fullNameUpper(){
        Scanner scan=new Scanner(System.in);
        String ad=scan.nextLine();
        String soyad=scan.nextLine();
        return ad.toUpperCase().concat("\n" +soyad.toUpperCase());

    }
    task 4
    Aldığınız mesajın son index ini yazdırın.

    public static char lastIndex(){
        Scanner scan=new Scanner(System.in);
        String message=scan.nextLine();
        return message.charAt(message.length()-1);
    }
    task 5
    Aldığınız mesajın her karakterini konsola alt alta yazdırın.

    public static void charaltAlta(){
        Scanner scan=new Scanner(System.in);
        String karakter=scan.nextLine();
        for(int i=0;i<karakter.length();i++){
            System.out.println(karakter.charAt(i));
}
 }

    odev
    Kullanıcıdan 3 kelime alın ve length i uzun olandan kısa
    olana hepsini birleştirin. Concat() kullanın. (Ödev)

    task:6:
     Bir method yazın ve verilen string in önünde ve arkasında
    boşluk varsa boşlukları alıp geri döndürsün.


        public static String boslukAlma(String str){
            return str.trim();

        }
       task7:
            18/10/2022 20:50:55 tarih bildirimini tarih damgasına
    döndürün 18102019145055

    public static String dateStamp(String str){
        String replace=str.replace("/","");
        String replace1=replace.replace(" ","");

        return replace1.replace(":","");

    }
    2.yol:


    public static String dateStamp2(String date,String time){
        return date.replace("/","").concat(time.replace(":",""));
    }

    task 8: Kullanıcıdan 2 kelime yazmasını isteyin ilk kelimenin baş harfi
    2. kelimede varsa index ini alın.

 */
    public static int findCharİnSecond(String str1,String str2){

        return str2.indexOf(str1.charAt(0));


    }

    }
