package agustos_04_ControlFlowStatements;

import java.util.Scanner;

public class Task_7 {

    public static void main(String[] args){

        //Task13
        /*
        * • Bir sayı için 5 den 25 den ve 50 den büyük olup olmadığını
            denetimini yapın. Eğer sayı 5 den büyükse 5 den büyük
            olduğunu konsola yazdırın. Sayı 25 den de büyükse hem 5
            hem 25 den büyük olduğunu konsola yazdırın. Sayı 50 den
            buyukse sayının hem 5 den hem 25 den hem de 50 den
            buyuk oldugunu konsola yazırın..
          */
        Scanner scan=new Scanner(System.in);
        int number;
        number=scan.nextInt();
        if (number>5){
            System.out.println("besten buyuk");
            if (number>25){
                System.out.println("25 ten buyuk");
                if (number>50){
                    System.out.println("50 den buyuk");
                }else{
                    System.out.println("elliden kucuk");
                }
            } else{
                    System.out.println("25 ve 50 den kocuk");

                }
            } else{
                    System.out.println("besten kucuk");
                }

                }
            }





