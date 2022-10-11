package agustos_12Ders;

public class Agustos_23_MrHarun {
    public static void main(String[] args) {
//        System.out.println(sesliHarf("galatasaray"));
//        System.out.println(kelimeBirlestir("salatalik"));
//        System.out.println(yeniKelimeSondan("karanfil"));
 //       System.out.println(sevKardesim("seni seve seve cok seviyorum","sev"));
 //       System.out.println(acakCheck("kalatasanacak", "acak"));
       System.out.println(enCokHarf("umutlamdiklarimiz"));
//       System.out.println(ayniHarfliKelime("iftar", "tarik"));
//        System.out.println(terstenAyniKelime("nalan"));
//        System.out.println(findBenzersizHarf("ankara"));
 //       System.out.println(tekrarEdenHarf("amannsiz"));
 //       System.out.println(ayniSayidaKelime("Ankara ile Bursa arası 500 km"));
 //       System.out.println(findBenzersizHarf("harika"));

    }
    // ozel soru : sadece harfleri yazdiran metodu yaz
    public static String harfBul(String str){
        String result="";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>96 && str.charAt(i)<123 || str.charAt(i)>64 && str.charAt(i)<91){
                result+=str.charAt(i);
            }

        }
        return result;
    }

//        soru 15
//        Kullanıcıdan bir kelime alın ve bu kelimenin içerisindeki ünlü ve ünsüz harfleri
//   ayrı ayrı ekrana yazan programı yazınız.
//       Ankara ünlü harfler=Aa
//        Ünsüz harfler=nkr

    public static String sesliHarf(String str){
        String holder="";
        String holder1="";

        for(int i=0;i<str.length();i++){
            switch(str.charAt(i)){
                case 'a','e','i','u','o':
                    holder+=str.charAt(i);
                    break;
                default:holder1+=str.charAt(i);
            }
        }
        return holder+holder1;
    }

//    soru 16
//    Kullanıcıdan minumum 3 harf olacak şekilde bir kelime alın ve bu kelimenin ilk 3
//    harfini kelimeden keserek sonuna ekleyin.
//            Merhaba habaMer    Ali Ali

    public static String kelimeBirlestir(String str){

          return str.substring(3).concat(str.substring(0,3));

//          **********2.yol*********
//        String str1=str.substring(0,3);
//        String str2=str.substring(str1.length());
//        return str2.concat(str1);
    }
//     ***********soru17********
//    Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin son 3
//    harfini kelimeden keserek kelimenin başına ekleyin.
//    Merhaba abaMerh
//    Ali Ali
    public static String yeniKelimeSondan(String str){
        if(str.length()<3){
            return str;
        }
        return str.substring(str.length()-3).concat(str.substring(0,str.length()-3));

    }
// *************soru 25***********
//    Kullanıcıdan bir input alın ve bu inputun içerisinde kaç adet sev bulunduğunu
//    ekrana yazdırın.
//    Seni seviyorum 1
//    Sevmek veya sevmemek 2
//    Sev seni seveni , sevmek güzeldir. 3
    public static int sevKardesim(String kelime,String hedef){
        int count=0;
        for(int i=0;i<kelime.length()-hedef.length()-1;i++){       // burayı  sor*****
            String result=kelime.substring(i,i+hedef.length());
            if(kelime.substring(i,i+hedef.length()).equalsIgnoreCase(hedef)){
                count++;

            }
        }
        return count;
    }
//     ****************soru 27**************/
//
//    Kullanıcıdan bir kelime alın ve sonu acak ile bitiyorsa true bitmiyorsa false
//    döndüren metodu yazdırın.
//            Kullanacak true
//    Zamlanacak true
//    Farkındalık false
//    Farkında fals
    public static boolean acakCheck(String kelime,String target){
        if(kelime.substring(kelime.length()-4).equals(target)){
            return true;
        }
        return false;
    }
//    soru 29
//    Kullanıcıdan bir dize sözcük alın ve en çok harfi döndüren metodu yazınız.
//    Merhaba a
//    aaaaaaabbcccc a
//    eeemmmsssssssssshhhhhhhhhsss s
    public static char  enCokHarf(String kelime){            //kod calismiyor tekrar et
        String holder ="";
        int max=0;

       loop1: for(int i=0;i<kelime.length();i++){
           int count=0;
           loop2:     for(int k=0;k<kelime.length();i++){
                if(kelime.charAt(i)==kelime.charAt(k)){
                    count++;
                }if(count>max){
                  max=count;
                  holder+=kelime.charAt(i);
                    continue loop1;

                }
            }

        }
        return holder.charAt(holder.length()-1);
    }

    public static char  enCokHarf2(String kelime){
        kelime = kelime.toLowerCase();
        kelime = kelime.replace(" ", "");
        int max = 0;
        String nullString = "";
        loop1:
        for (int i = 0; i < kelime.length(); i++) {
            int count = 0;
            loop2:
            for (int j = 0; j < kelime.length(); j++) {
                if (kelime.charAt(i) == kelime.charAt(j)) {
                    count++;
                }
                if (max < count) {
                    max = count;
                    nullString += kelime.charAt(i);
                    continue loop1;
                }
            }

        }
        return nullString.charAt(nullString.length() - 1);
    }

//    soru 19
//Kullanıcıdan iki kelime alın ve bu kelimeler aynı harflerden oluşuyorsa(her harf
//eşit sayıda içerecek,büyük küçük harf göz ardı edilecek) true oluşmuyorsa false
//            yazdırın. (anagram kelime ise)
//    İftar – Tarif true
//    Zehra – Ezhar true
//    Nefes – Enfes true
//    Selcuk-Elyase false

    public static boolean ayniHarfliKelime(String str1,String str2){
        String holder = "";

        firstLoop: for(int i=0; i<str1.length(); i++){
            secondLoop: for(int k=0; k<str2.length(); k++){
                if(str1.charAt(i)==str2.charAt(k)){
                    continue firstLoop;
                }
                continue secondLoop;
            }
            return false;
        }
        return true;

}
//                 soru 23
//    Kullanıcıdan bir kelime alın ve bu kelimenin tersten okunuşu kelime ile aynı ise
//    true değil ise false döndüren metot yazınız.
//            Kabak true
//    Nalan true
//    Ara true
//    talat true
//    Kasaba false
//    ahmet false
     public static boolean terstenAyniKelime(String str1){
    String holder = "";

    for(int i=str1.length()-1; i>=0;  i--){
        holder+= str1.charAt(i);
    }
    if(holder.equals(str1)) {
        return true;
    }else{
        return false;
    }
     }
//              ****************soru 18*******
//    Kullanıcıdan bir kelime alın ve bu kelimenin ilk benzersiz harfini bulun. (Büyük
//    küçük harf gözardı edilecek.) Hiçbir harf benzersiz değil ise benzersiz harf yoktur
//    ikazı versin.
//    Merhaba M
//    Araba r
//    Karkas rotası o
    public static String findBenzersizHarf(String str){

        str = str.replace(" ", "");
        String emptyString = "";
        for (int i = 0; i < str.length(); ) {
            if (!str.substring(1).contains(str.substring(0, 1))) {
                emptyString += str.substring(0, 1);
                return emptyString;
            }
            str = str.replace(str.substring(0, 1), "");
        }
        return emptyString;
    }


//    soru 20
//    Kullanıcıdan bir kelime alın ve ardı ardına tekrar eden harfleri döndüren metodu
//    yazın.
//            aabccccseeeeeefff acef
//    abaccb c
//    Arsız ardı ardına tekrar eden harf yoktur
//    amannsız n
      public static char tekrarEdenHarf(String str){
      String str1=str.toLowerCase();
      char sonuc=' ';
      for(int i=0;i<str1.length();i++){
        if(str1.charAt(i)==str1.charAt(i+1)){
            return str1.charAt(i);
        }
      }
    return sonuc;
}


//    Bursa ile Ankara kelimeli cümlenin içerinde aynı sayıda dönüyorsa true farklı
//    sayılarda dönüyorsa false yazdıran metodu yazınız.
//    Ankara ile Bursa arası 500 km. True
//    Ankara Bursa kadar yeşil değil. Bursa bir başka. False
//    İstanbul çok uzak false
    public static boolean ayniSayidaKelime(String str){
        int uzunluk=str.length();
        int ankUzunluk="Ankara".length();
        int bursaUzunluk="Bursa".length();

        int toplamAnkara=str.toLowerCase().replace("ankara".toLowerCase(),"").length();
        int toplamBursa=str.toLowerCase().replace("bursa".toLowerCase(),"").length();
        int sayiAnkara=(uzunluk-toplamAnkara)/ankUzunluk;
        int sayiBursa=(uzunluk-toplamBursa)/bursaUzunluk;
        return sayiAnkara==sayiBursa;
    }
//    Kullanıcıdan 1 ila 4 harf olacak şekilde 2 kelime alın, 1. veya 2. kelimeyi
//    girdiğinde hatalı giriş yaparsa uyarı verin ve kullanıcıya düzeltme imkanı verin.
//    Her kelime için 3 kere hatalı giriş yaparsa programı sonlandırın. Kullanıcı doğru
//    giriş yaparsa 2 kelimeyi arada boşluk olacak şekilde sadece concat() metodu ile
//    birleştirerek yazdırın.
//    Slm
//            Ali
//    Slm Ali

//    Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki harf sayılarını başına
//    yazarak ekrana döndürün.(büyük küçük harfler göz ardı edilecek)
//    Merhaba 1m1e1r1h2a1b
//    Seni seviyorum 2s2e1n2i1v1y1o1r1u1m

    }





