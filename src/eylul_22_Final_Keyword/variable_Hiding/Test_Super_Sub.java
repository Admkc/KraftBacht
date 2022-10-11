package eylul_22_Final_Keyword.variable_Hiding;

public class Test_Super_Sub {
    public static void main(String[] args) {
        Sub sub=new Sub();
        System.out.println("before increment" +sub.i);
        sub.increment();
        System.out.println("after increment " +sub.i);

        System.out.println("**********************");

        Super spr=new Super();
        System.out.println("before increment " +spr.i);
        spr.increment();
        System.out.println("after increment " +spr.i);


    }


}
