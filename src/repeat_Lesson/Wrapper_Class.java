package repeat_Lesson;

import java.util.Scanner;

public class Wrapper_Class {
    public static void main(String[] args) {

        //        ***Wrapper class***
//        Why do you need wrapper class for primitive type?
//        Because; For example :
//        Arrays work with both types primitive and non primitive
//        Collection/Map can not work primitive type
//        for that we need wrapper class to utilize flexiblility of collcetion/Map
        //Collection ve Map yapılarından istifade edebilmek için
        // primitive tiplerin wrapper class larına ihtiyac duyarız.

//        every primitive types has a wrapper class

//        int  ---> Integer //
//        double ---> Double
//        char --->Character
//        ....

        double d=10;
        Double d1=d;  //auto boxing

        System.out.println(d+d1);


        Integer num=20;
        int n=num;     //unboxing

        System.out.println(n==num);  //true
        System.out.println(num.equals(n));  //true

        System.out.println(Integer.MAX_VALUE);//2147483647
        System.out.println(Integer.MIN_VALUE);//-2147483648
        System.out.println(Integer.sum(10, 20));  //30
        System.out.println(Integer.sum(n, num));  //40


      //  *******************************************

        Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();

        Integer.max(num1,num2);

        for (int i=Integer.min(num1,num2);i<Integer.max(num1,num2);i++){

            System.out.println(i+" ");

        }
        //        **parseInt()** - Convert "a string consist of dijit" to primitive

        int z=Integer.parseInt("10");
        System.out.println("z = " + z);

        int t=Integer.parseInt("5")+5;
        System.out.println("t = " + t);

        //        **valueOf() - Convert "string consist of dijit" to wrapper class object


        Integer integer=Integer.valueOf("5");


        System.out.println(Integer.valueOf("5")+integer);//10
        System.out.println(Integer.valueOf("5")+5);//10

        System.out.println(Character.isDigit('a'));//false
        System.out.println(Character.isDigit('8'));//true

        System.out.println(Character.isLetter('a')); //true
        System.out.println(Character.isLetter('4'));  //false

        System.out.println(Character.isLetterOrDigit('a'));//true
        System.out.println(Character.isLetterOrDigit('8'));//true

        System.out.println(Character.isAlphabetic('*'));//false

        String dateEncrypted = "//|*1-=%&&&!__+/*^#2-? M)))'*_+++|||!!'''a>>y//%-/((&^'*ı^^^^---+/s " +
                "%%%*(&&2||||0-2>>£2";

        String holder="";
        for (int i=0;i<dateEncrypted.length();i++){
            if (Character.isLetterOrDigit(dateEncrypted.charAt(i))){
                holder+=dateEncrypted.charAt(i);
            }
        }
        System.out.println(holder); //12May�s2022


    }


}

