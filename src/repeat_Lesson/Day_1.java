package repeat_Lesson;

import java.util.Scanner;

public class Day_1 {
    public static void main(String[] args) {

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


        //*******************************************

        Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();

        Integer.max(num1,num2);

        for (int i=Integer.min(num1,num2);i<Integer.max(num1,num2);i++){

            System.out.println(i+" ");

        }

        //**parseInt () convert a string consist of


    }


}
