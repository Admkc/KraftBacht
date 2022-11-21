package agustos_04_ControlFlowStatements.switch_;

import java.util.Scanner;

public class Switch_Lesson {
    /**
     Switch yapısı bir variable ın değerini case olarak adlandırılmış durumlardan matchetmeye(eşlemeye) çalışır.

     Switch yapısı eşleşme bulduğu anda break ile code bloğundan çıkar geri kalanı kontrol etmez.
     switch if yapılarına göre daha hızlı yapar.
     */
    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
        System.out.println("kacinci ay");
        int numOfMonth=sc.nextInt();
        switch (numOfMonth){
            case 1:
                System.out.println("ocak");
                break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5 :
                System.out.println("Mayıs");
                break;
            case 6 :
                System.out.println("Haziran");
                break;
            case 7 :
               System.out.println("Temmuz");
                break;
            case 8 :
                System.out.println("Ağustos");
               break;
            case 9 :
                System.out.println("Eylül");
                break;
            case 10 :
                System.out.println("Ekim");
                break;
            case 11:
              System.out.println("Kasım");
                break;
           case 12:
                System.out.println("Aralık");
               break;
            default:
                System.out.println("girdiginiz ay ile eslesmiyor");
        }

//         Bir program yazın switch yapısını kullanın. Şu beden
//        numaralarını : small(38-40-42),
//                       medium(44-46-48),
//                       large(50-52-54) yakalasın.
//        Aşağıdaki şekilde çıktı alın.Example output: 50 numara bir large bedendir.



        int beden=45;
        switch (beden){
            case 38,40,42:
                System.out.println("small beden");
                break;
            case 44,46,48:
                System.out.println("medium");
                break;
            case 50,52,54:
                System.out.println("large");
                break;
            default:
            System.out.println("boyle bir beden yok");
        }


// ***********hesap makinesi******************

        System.out.println("hesap makinesi hazır");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        scan.nextLine();          // sor******niye konmus
        String aritmetik=scan.nextLine();
        int b=scan.nextInt();


        int sonuc=0;
        switch (aritmetik){

            case "+":
                sonuc=a+b;
                System.out.println(sonuc);
               break;
            case "-":
                sonuc=a-b;
                System.out.println(sonuc);
                break;
            case "*":
                sonuc=a*b;
                System.out.println(sonuc);
                break;
            case "/":
                sonuc=a/b;
                    System.out.println(sonuc);
                    break;
            default:
                System.out.println("boyle bir islem yok");
        }






    }


}
