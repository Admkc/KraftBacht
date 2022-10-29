package repeat_Lesson;

public class Method_Constructor {
    public static void main(String[] args) {

        //method : code fragment which can perform task

        //Access modifier return type name(parameter){implementation/body/code}


        //method overloading
        //same method name different parameter in same class
        //return type no effect method overloading
     message(12,"ali",12.5);

        message("hellooo");
        message();
        message("ali",10.5,4);
        Test test=new Test("cbb");
        test.str="gs";
        test.any();

    }
    public static void message(String str){

        System.out.println(str);
    }
    public static void message(){

        System.out.println("merhaba");
    }
    public static void message(int a,String str,double dl){

    }
    public static void message(String str,double dl,int a){

    }
    public static void message(double dl,int a,String str){

    }

    //constructor
    //special method
    //used for creating object
    //constructor name must be same with class name
    //doesn't have any return type
    //if we don't put any constructor, always there is a default constructor as implicit
    //if we put a parameterized constructor there is no default constructor.


}
class Test{

    String str;


    public Test(String str){
        System.out.println(str);

    }
    public Test(String str,int i){
       this.str=str;

        }


    public void any(){
        System.out.println(str);
    }
}

