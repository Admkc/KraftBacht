package eylul_09_Inheridance;

public class  ChildClass  extends ParentClass{

    public void print_message_C(){

       System.out.println(" world");

       print_message_P();


    }
    public static void run(){
        System.out.println("child kosuyor");

    }
}

