package agustos_04_ControlFlowStatements;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int number;
        number=sc.nextInt();

        if (number%2==0){
            System.out.println("cift sayidir");
        }else {
            System.out.println("tek sayidir");
        }
    }
}
