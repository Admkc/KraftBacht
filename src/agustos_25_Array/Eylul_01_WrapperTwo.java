package agustos_25_Array;

public class Eylul_01_WrapperTwo {
    public static void main(String[] args) {




        Integer I=10;
        int sayi=I.intValue();
        System.out.println("i : "+sayi);

        Byte B=20;
        byte b=B.byteValue();
        System.out.println("b: " +b);

        Boolean BL=true;
        boolean bl=BL.booleanValue();
        System.out.println(bl);

        System.out.println("Integer.MAX_VALUE : " +Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.sum(15,25));
        System.out.println(Double.max(4,5));
        System.out.println(Double.min(9,4));

        char a='a';

        System.out.println(Character.isDigit(a));
        System.out.println(Character.isDigit(9));
        System.out.println(Character.isLetter('a'));
        System.out.println(Character.isLetter(4));
        System.out.println(Character.isAlphabetic('a'));
        System.out.println(Character.isAlphabetic('8'));
        System.out.println(Character.isUpperCase('G'));
        System.out.println(Character.isLowerCase('b'));

//        **************soru***************

        String str = "^+!j4546*/-a_|v-:!a ???()&+";
        String result="";
        for(int i=0;i<str.length();i++){

          if(Character.isLetter(str.charAt(i))){
              result+=str.charAt(i);
          }


        }
        System.out.println(result);

        //        *********soru********

        String str1 = "\"|''11'*>>///M++>,,_//*e%%&/'-~~&&r//%<>/)h*>%//'9a+%^^^((b*><###a678* +%&&/))<+J>>>\"+\n" +
                "\">**56a##v**||;;;~~a~>>> 4500001||<<İ**##n**--//+%^^s>><<|*478a12%%n*\"+\n" +
                "\"*-<<|||>>012345679--a**//##++34r``~~((ı[234]+||\";";
        String result1="";
        for(int i=0;i<str1.length();i++){
            if(Character.isLetter(str1.charAt(i)) || str1.charAt(i)==' '){
                result1+=str1.charAt(i);
            }
        }
        System.out.println("result1 :" +result1);


        //       *************soru***************


        String str3 = "A number is a mathematical object used to count, " +
                "measure, and label. The original examples are the natural " +
                "numbers 1, 2, 3, 4, and so forth";
        int sayi1=0;
        for(int i=0;i<str3.length();i++){
            if(Character.isDigit(str3.charAt(i))){
                sayi1+=Integer.parseInt(str3.charAt(i)+"");// sadece sayilari nasıl alabilirim
            }
        }
        System.out.print("sayi1 :" +sayi1);






    }
}
