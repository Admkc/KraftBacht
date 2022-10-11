package eylul_09_Inheridance;

public class ParentChildTest {
    public static void main(String[] args) {

        ChildClass childClass=new ChildClass();

        childClass.print_message_P();
        childClass.print_message_C();

        ParentClass parentClass=new ParentClass();
        parentClass.print_message_P();
 //       parentClass.print_message_C();   ***parent clas child clasın field ve metodlarına erişemez.

    }
}
