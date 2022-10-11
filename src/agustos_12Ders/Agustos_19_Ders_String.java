package agustos_12Ders;

public class Agustos_19_Ders_String {
    public static void main(String[] args){


 // task 1:       System.out.println(countY("javayı Seviyor muyum"));
 // task 2:       System.out.println(sesliHarf("javayı Seviyor muyum"));
 // task 3:       searcWord("dünya sevgi dilidir");

// tesk 4: last3Char("adem");
 // task 5       System.out.println(middleChar("kelebekler"));
// task 6;        System.out.println(simulateNames("adem", "koc"));
  //task:7      withoutFirst("talip","tiras");
        System.out.println(nickName("talip","tiras"));

    }

/*    task 1  ***
            "javayı Seviyor muyum?" ifadesindeki y harfinin sayısını veren
        bir program yazın.


    public static int countY(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='y'  ||  str.charAt(i)=='Y'){
                count++;
            }
        }
        return count;

        task 2;***
        Aldığınız mesajın sesli harflerini a,e,i formatında konsola
yazdırın.

    public static String sesliHarf(String str){
        String holder="";

        for(int i=0;i<str.length();i++){
            switch(str.charAt(i)){
                case 'a','e','i','u','o':
                    holder+=str.charAt(i);
                break;
                default:
            }
        }
        return holder;
    }
    task :3
     Kullanıcıdan çocuk bayramı ile ilgili bir cümle söylemesini
    isteyin cümle içinde "sev" köküne sahip bir kelime var ise bir
    method what a lovely person(ne hoş bir insan) mesajı
    döndürsün.

    public static void searcWord(String str){
        if(str.contains("sev")){
            System.out.println("what a lovely person");
        }else{
            System.out.println("okey");
        }
    }
    test 4:
    İsminizin son 3 harfini 3 kez yazdıran bir method oluşturun.

    public static void last3Char(String str){
        String holder="";
        for(int i=0;i<3;i++){
            holder+=str.substring(str.length()-3);
        }
        System.out.println(holder);
    }
    task 5-İsminizin ortadaki 3 harfini veren bir method yazın.

    public static String middleChar(String str){
        return str.substring(str.length()/2-1,str.length()/2+2);
    }
    task 6-İsminizi ve soyadınız hangisi kısa ise diğerine onun boyuna
kısaltın yani fazla karakterleri atın. Ve isminizle soy adınızı
birleştirin.

    public static String simulateNames(String str1,String str2){
        if(str1.length()>str2.length()){
            return str1.substring(0,str2.length()).concat(str2);

        }else if(str2.length()>str1.length()){
            return str1.concat(str2.substring(0,str1.length()));

        }else{
            return str1.concat(str2);
        }

    }
    task 7:İsminizin baş harfi soy adınızda varsa soy adınızı isminizin
    baş harfinden arındırıp yazdıran bir method oluşturun.

    public static void withoutFirst(String str1,String str2){
        String emty="";
        char birincininIlkHarfi=str1.charAt(0);
        for(int i=0;i<str2.length();i++){
            if(str2.charAt(i)!=birincininIlkHarfi){
                emty+=str2.charAt(i);
            }

        }
        System.out.println(emty);
    }
    task:8
    İsminizin ilk 3 harfi ve soy isminizin son 3 harfi ile nickname
    oluşturan bir method yazın.
    */
    public static String nickName(String name,String surname){
        String nick=name.substring(0,3).concat(surname.substring(surname.length()-3));
        return nick;


    }

 //     galatasaray kelimesindeki a harfinin toplam sayisini bul

    public static int harfSa(String str,char hedef){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==hedef){
                count++;
            }
        }
        return count;

    }

}




