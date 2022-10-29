package repeat_Lesson;

public class String_ {
    public static void main(String[] args) {
        //String is******

        //String immutable

        String str="Big";

       str.concat("Man");

        System.out.println(str);//Big

        str=str.concat("Man");
        System.out.println("str = " + str);//BigMan

        //we can create string by two way
        String literal="Kraft";

        //2-By new keyword
        String bynew=new String("Kraft");

        //String builder and String buffer mutable/degişken
        StringBuilder strBld=new StringBuilder("Boot");//is not immutable
        //concat()---append()
        strBld.append("Camp");
        System.out.println("strBld = " + strBld);//BootCamp

    }



}
