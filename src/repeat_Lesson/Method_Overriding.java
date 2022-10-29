package repeat_Lesson;

public class Method_Overriding {

    //only happen in subclass
    //method name , return type, parameter must be same
    //access modifier must be same or more visible
    //final-private-static methods can not override

    //benefit of overriding : one method different implementation.

    public void method(){
        System.out.println("from parent");
    }
//    static void method(){}//not override
//    private void method(){}//not override
//    final void method(){}///not override


    }


class B extends Method_Overriding {
    @Override
    public void method() {
        System.out.println("from child");
    }
}
class test11{
    public static void main(String[] args) {
        B b=new B();
        b.method();
        Method_Overriding aaa=new Method_Overriding();
        aaa.method();
    }
}


