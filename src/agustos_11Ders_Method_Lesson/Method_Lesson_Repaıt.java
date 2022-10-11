package agustos_11Ders_Method_Lesson;

public class Method_Lesson_Repaıt {
    public static void main(String[] args) {

 //       message();

 //           aritmetik();
 //       bigOfTwo();
 //       okka();
  //      short s=5;
 //       message4(s);
   //     message5(12,"araba");
  //      message5(13,"kedi");
  //      myAge(1980);
   //     kuvvet(2,5);
   //     kuvvet(2,9);
 //       islem(6,5);
       hesapMakine(3,4,"*");


    }

/*
    public static void message(){
        System.out.println("merhaba dunya");


        Bir method yazın 3 sayının aritmetik ortalamasını versin

        public static void aritmetik(){
            Scanner scan=new Scanner(System.in);
            System.out.println("ortalama icin 3 sayi girin");
            int a= scan.nextInt();
            int b= scan.nextInt();
            int c= scan.nextInt();
            System.out.println("sayinin ortalamasi :" +(a+b+c)/3+ " dur");

            Bir method yazın 2 sayıdan büyük olanı versin


     public static void bigOfTwo(){
    Scanner scan=new Scanner(System.in);
    System.out.println("2 sayi girin");
    int a= scan.nextInt();
    int b= scan.nextInt();

    System.out.println(a>b ? a:b);

    Bir method yazın ve kiloyu okka cinsinden versin.Okka=1.282 kg


    public static void okka(){
    Scanner scan=new Scanner(System.in);
    System.out.println("1 sayi girin");
    double kilo= scan.nextDouble();
        System.out.println(kilo/1.282);

    }


    public static void message4(int num){
        System.out.println(num+  " :kelebek");
        System.out.println(num+9);

    }



          public static void message5(int i,String str){
              System.out.println("Ayin " +i+ "i" +str+ " dir");

    }
    Bir method yazın doğum yılınızı girdiğinizde yaşınızı
versin

    public static void myAge(int dogum){

        System.out.println(2022-dogum);
    }


    Bir method yazın 2 sayı kabul etsin ve ilk sayıyı ikinci +
    sayının üslü kuvveti yapıp sonuç versin.



    public static void kuvvet(int num1,int num2){   +
        double pow=Math.pow(num2,num1);
        System.out.println(pow);

        Bir method yazın 2 sayı kabul etsin çağırdığımızda konsola  +
        işlemin matematiksel görünümünü yazdırsın.
        Exmp: 5 + 6 = 11
    }


    public static void islem(int a,int b){
        System.out.println(a+ "+"  +b+ " ="  +(a+b));

    }

    Bir method yazın 3 parametre li olsun ilk ikisi işleme sokulacak  +
    sayıları üçüncü ise yapılacak işlemi belirlesin. Sonucu versin.
*/
    public static void hesapMakine(double a,double b,String str){
        if(str.equals("+")){
            System.out.println("a+b");
        }else if (str.equals("-")){
            System.out.println("a-b");
        }else if(str.equals("*")){
            System.out.println("a*b");
        }else if(str.equals("/")){
            System.out.println("a/b");

        }else{
            System.out.println("boyle bir islem yoktur");
        }
    }


    }




