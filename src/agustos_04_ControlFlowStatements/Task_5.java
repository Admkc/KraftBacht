package agustos_04_ControlFlowStatements;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int a;
        int b;
        System.out.println("sayilari giriniz");
        a=sc.nextInt();
        b=sc.nextInt();
        if (a==b){
            System.out.println("sayilar esit");

        }else{
            System.out.println("esit degil");
        }

    }


}
