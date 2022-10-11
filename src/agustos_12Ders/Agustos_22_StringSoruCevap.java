package agustos_12Ders;

public class Agustos_22_StringSoruCevap {
    public static void main(String[] args) {
//        System.out.println(first3Char("ke"));
//       System.out.println(modStamp(""));
//        System.out.println(middleTurn("galatasaray"));
 //       System.out.println(changeChar("sevemediklerimiz","e","a"));
//        System.out.println(everyChar3("cimbombom"));
//        System.out.println(harfSayisi("ankaranınbagları", "a"));
 //       System.out.println(kelimeSayisi("ankaranınankası", "an"));
 //      System.out.println(harfTemizle("ankaranin baglari",""));

 //       System.out.println(checkKelime("kinliyim", "kin"));
 //       System.out.println(bastaOrtadaSonda("harun", "sigarayi birak"));
//       System.out.println(nokta("ade"));
//        System.out.println(harfControl("yaramazliklarincaya","ya"));
 //      System.out.println("soy isminiz " +surName("adem koc")+ " dur");
//        System.out.println(repeatChar("saattakaatlar"));
//        System.out.println(yinelenenKarakter("kelime"));
//        System.out.println(tekrarEdenHarfFind("yediklerimiz"));
 //       System.out.println(rakamBul("kocadem9971"));
        String str="ünlü akşam eve giderken onları görmüştü";
        System.out.println(udenYeniKelime(str));
    }

    //        Girilen kelimeyi tersten yazdıran bir method yazın.
    public static String tersYaz(String metin) {
        String sonuc ="";
        int i;

        for(i=metin.length()-1; i>=0; i--){
            sonuc+=metin.charAt(i);
        }

        return sonuc;

    }


//    Kullanıcıdan bir input alın ve girilen inputun ilk 3 harfini yazin , 3 harften az
//    ise inputu döndüren bir metot yazınız.
//    Merhaba Mer//        Ali Ali

    public static String first3Char(String str){
        if(str.length()<3){
            return str;
        }else{                                          //  else yapmasak ta olur,cunku return cıkartır
            return str.substring(0,3);
        }
    }
//    Kullanıcıdan bir dize sözcük alın ve her boşluğa % ibaresi ekleyin.
 //   Merhaba dünya Merhaba%dünya
    public static String modStamp(String str){
         String dize="anne baba betul";

        return dize.replace(" ","%");
    }
//    Kullanıcın girdiği eşit uzunlukta bir kelimenin 2. yarısını döndüren bir program
 //   yazdırın.    Mutluluk uluk        Sanayagı yagı

    public static String middleTurn(String str){

        return str.substring(str.length()/2);
    }
//    Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri ve yeni harfi/harfleri
//    alan ve buna göre kelimede/dizede sadece ilk bulduğu yeri değiştiren metodu
//        yazınız.        (Merhaba ,a, e) Merheba             (Kasaba , a, i) Kisaba

    public static String changeChar(String str,String old,String yeni){

        return str.replace(old,yeni);
    }

//    Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.
//    Merhaba MMMeeerrrhhhaaabbbaaa Ali AAAllliii
    public static String everyChar3(String str){
        String result="";
        for(int i=0;i<str.length();i++){
            for(int j=0;j<3;j++){
                result+=str.charAt(i);   // result=result+str.charAt(i)
            }
        }
        return result;
    }

 //   Kullanıcıdan bir kelime ve bir karakter alın ve bu kelimenin istenen karakterin
 //   kaç adet olduğunu döndüren metodu yazınız. (büyük küçük harf göz ardı
 //   edilecek)    Ankara,a 3    Edirne,e 2
    public static int harfSayisi(String kelime,String target){
        int count=0;
        for(int i=0;i<kelime.length();i++){
            if(kelime.substring(i,i+1).equalsIgnoreCase(target)){  //if(kelime.charAt(i)==target){
                count ++;
            }
        }
        return count;
    }

//    Kullanıcıdan 2 kelime  alın ve bu kelimenin istenen 2.kelimenin
//    kaç adet olduğunu döndüren metodu yazınız. (büyük küçük harf göz ardı
//    edilecek)    Ankaran,ank 1    sarmalasaksa sa 3
    public static int kelimeSayisi(String kelime,String target){
        int count=0;
        for(int i=0;i<kelime.length()-target.length()-1;i++){
            String result=kelime.substring(i,i+target.length());
                if(kelime.substring(i,i+target.length()).equalsIgnoreCase(target)){
                    count ++;

                }
            }
        return count;

        }

//    Kullanıcıdan bir kelime ve bir harf alın kelimenizin içinde bu harfin hepsi
//    kaldırılmış şekilde string döndüren programı yazınız./
//            (Merhaba, a) Merhb

    public static String harfTemizle(String kelime,String harf){

        return kelime.replace("a","i");
    }

 //   Kullanıcıdan bir kelime alın ve kin kelimesi başından veya ilk karakterden sonra
//    gelip gelmediğini kontrol edin geliyorsa true gelmiyorsa false döndürün;
//  Kinlenmek true    Kin tutmak true    Ekin ektim true    Keskin ilçesinden geçiyorum false
    public static boolean checkKelime(String kelime,String control){
        if(kelime.substring(0,control.length()).equalsIgnoreCase(control)||
          kelime.substring(1,control.length()).equalsIgnoreCase(control)){
            return true;
        }
        return false;
    }
//    Kullanıcıdan 2 kelime alın kısa kelime yi başta 2 defa uzun kelimeyi ortada 30
//    defa kısa kelimeyi tekrar sonda 2 defa yazdıran metodu yazınız.
    public static String bastaOrtadaSonda(String kisa,String uzun){
        String result="";
        for(int i=0;i<2;i++){
           result+=kisa;
        }
        for(int i=0;i<30;i++){
            result+=uzun;
        }
        for(int i=0;i<2;i++){
            result+=kisa;
        }
        return result;
    }
//    Kullanıcıdan bir kelime veya söz alın ve ilk 5 karakterini yazdırın. 5 karakterin
//    altında bir kelime girdiği taktirde  karaktere nokta ile tamamlayın.            Sabun Sabun
//    Merhaba Merha   Ali Ali..    Hey Hey..    Pi Pi…
public static String nokta(String str){
    if(str.length()>=5){
        return str.substring(0,5);
    }else{
        String result="";
        for(int i=0;i<5-str.length();i++){
            result+=".";
        }
        return str.concat(result);
    }
}
 //   Kullanıcıdan bir kelime alın ve bu kelimenin ilk 2 harfi sonunda yer alıyorsa true
//    almıyorsa false yazdırın.            Ankara false
    public static boolean harfControl(String str,String target){
        String str1=str.toLowerCase();
        return str1.substring(0,2).equals(str1.substring(str1.length()-2));
       // return str1.endsWith(str1.substring(0,2));       ikinci yontem,  burayı sor********
    }
//    Kullanıcının konsoldan ad ve soyad bilgilerini konsoldan alın
//    Ekrana "Soy isminiz ..(soyad).. dır." Yazan metodu yazınız.
 //           İnput: "Harun Özsoy "    Output: "Soy isminiz Özsoy dır."

    public static String surName(String str){
        return str.substring(str.lastIndexOf(" ")+1);

    }
//   Kullanıcıdan bir dize sözcük alın ve yinelenen her karakteri kelimenizden   ******tekrar edilecek******
//  çıkartarak sonuç döndüren metodu yazınız. (Büyük küçük duyarlı)
//    Merhaba Merhab    Ananas Anas

    public static String repeatChar(String str){
        String result="";

        while(!str.isEmpty()){
            result+=str.charAt(0);    //***buyayı sor
            str=str.replace(str.substring(0,1),"");
        }
        return result;
    }
//    ************2.yontem*********
     public static String yinelenenKarakter(String str){
    String result="";

    for(int i=0;i<str.length();){                   //buraya niye i++ koymadik***************
        result+=str.charAt(i);
        str=str.replace(str.substring(i,i+1),"");
    }
    return result;
}
//    Kullanıcıdan bir kelime alan ve sonucunda yinelenen kelimeleri string
//    olarak return eden methot yazınız.
//" Java " output:a
//" Javva " output:av
//" Derslerime cok calisiyorum" output:erslimco

    public static String tekrarEdenHarfFind(String str){
        str=str.replace(" ","");
        String result="";
        while(!str.isEmpty()){
            if(str.substring(1).contains(str.substring(0,1))){
                result+=str.substring(0,1);
            }
            str=str.replace(str.substring(0,1),"");

        }
        return result;
    }
//    sayilari yazdiran metodu yaz    merha123ba   123

    public static String rakamBul(String str){
        String result="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>47 && str.charAt(i)<58){
                result+=str.charAt(i);
            }
        }
        return result;



    }
    //Dün akşam eve giderken onları görmüştüm.
// Cümlesindeki ü harfinin önünde
// ve arkasında olan harflerden bir string üreten bir method yazın.
    public static String udenYeniKelime(String kelime){
        String result="";
        if(kelime.substring(0,1).equals("ü")){
            result+=kelime.substring(1,2);
            for (int i = 1; i <kelime.length()-1 ; i++) {
                if(kelime.substring(i,i+1).equals("ü")){
                    result+=kelime.substring(i-1,i);
                    result+=kelime.substring(i-2,i+2);
                }

            }
            if(kelime.substring(kelime.length()-1).equals("ü")){
                result+=kelime.substring(kelime.length()-2,kelime.length()-1);
            }
        }
        return result;
    }


}














