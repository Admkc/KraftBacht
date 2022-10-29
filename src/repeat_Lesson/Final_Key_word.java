package repeat_Lesson;

public class Final_Key_word {
    //final keyword : ıt means constant/değiştirilemez

    //final variable :
    //we initialize in same statements
    //we initialize in constructor
    //we initialize in init block

    final double PI = 3.14;
    final double PI2;
    final double PI3;
    final static double PI4;
    final static double PI5 =3.14;

    Final_Key_word(){
        PI2=3.14;
        //    PI4=3.14;//do not assign
    }

    {
        PI3 = 3.14;
//        PI4=3.14;//do not assign
    }

    static {
        PI4=3.14;
    }

//    ------------

    //method :
    //can not be overridden

    //class :
    //can not be inherited
    //for immutable concept : for example string class, being final class is needed

}
