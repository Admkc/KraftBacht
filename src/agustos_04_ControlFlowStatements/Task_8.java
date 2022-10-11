package agustos_04_ControlFlowStatements;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {

        int a=10;
        int b;
        int c;
        Scanner sc=new Scanner(System.in);
        b=sc.nextInt();
        c=sc.nextInt();
        if (a+b>c){
            c=Math.abs(a-b);
            System.out.println(c);
        }
    }


}
