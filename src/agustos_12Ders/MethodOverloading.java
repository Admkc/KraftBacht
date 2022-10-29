package agustos_12Ders;

import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args) {
 //       calculateArea(65,45);
 //       calculateArea(25);
 //       concat(5,"adem",true);
 //      startProcess();
        startProcess(" davetiye icim isim giriniz");

    }
    /*
      ornek
       CalculateArea isminde 2 method yazın ve overload
olsunlar. Birincisi kare-dikdörtgen alanını hesaplasın.
İkincisi dairenin alanını hesaplasın. PI: 3,14

    public static void calculateArea(int a,int b){
        System.out.println(" alan :" +(a*b));

    }

    public static void calculateArea(int b){
        int r;
        double PI = 3.14;
        r=b;

        System.out.println(PI*r*r);

        ornek:
        Bir method yazın 3 parametreli olsun. İnt ve String type
        ve birde boolean. Boolean true ise int ve String değeri
        concat yapsın. False ise başka bir methodu çağırsın ve
        String değeri int kadar yazdırsın.
    }

    public static void concat(int i,String str,boolean bl){
        if(bl){
            System.out.println(str+i);
        }else {
            concat(str,i);
        }
    }
        public static void concat(String kelime,int c){
            for(int t=0; t<c;t++){
                System.out.println(kelime);
            }
            Konsoldan kullanıcıdan 2 sayı almanızı sağlayan bir
metodu çağırın. İkinci sayı 3 ün katı olan bir sayı değilse,
başka bir metodtan geçirin ve 3 un katı olacak şekilde size
döndürsün. Sonra bu sayıları kabul eden başka bir
metotla da sayıları toplayın.
        }
    public static void startProcess(){
        Scanner scan=new Scanner(System.in);
        System.out.println(" 2 sayi giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        if(sayi2%3!=0){
            sum(sayi1,makeMultiOfThree(sayi2));
        }else{
            sum(sayi1,sayi2);
        }
    }
    public static int makeMultiOfThree( int a){
        int multiple3;
        if(a%3>1){
            multiple3=a+1;
        }else{
            multiple3=a-a%3;
        }

        return multiple3;
    }
    public static void sum(int a,int b){
        System.out.println(a+b);
    }
    ornek    :  Düğün kartı bastıran bir program yazın.
Kullanıcıdan 2 adet kelime isteyen bir metodunuz olsun. Bu metot
kullanıcıya ileteceğiniz mesajı size belirleme opsiyonu sunsun. Eğer
kullanıcı cümleleri yanlışlıkla aynı girerse. Başka bir metot çağrılsın ve
kullanıcıya kelimeler farklı olmalıydı mesajı ile tekrar ondan 2 kelime
istesin. Kelimeler farklı gelirse bir başka metot çağrılsın ve kelimeleri
bağlayıp(concat) önünü ve arkasını yıldızlarla süsleyip versin.
*/

    public static void startProcess(String message){
        Scanner scan=new Scanner(System.in);
        System.out.println(message);
        String name1=scan.nextLine();
        String name2=scan.nextLine();
        if(name1.equals(name2)){
            goingProcess();
        }else{
            goingProcess(name1,name2);
        }

        }
        public static void goingProcess(){
        String message=" girmis oldugunuz isimler ayni,degistirin";
        startProcess(message);
        }
        public static void goingProcess(String str1,String str2){
            System.out.println(" iyi kalin her daim");
            System.out.println(" *** " +str1+ " " +str2+ "  ***");

        }





    }


