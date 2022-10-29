package repeat_Lesson;

public class Object_Class_ {

    String name;

    void action(){
        System.out.println("nesne action");
    }

}
class Test13 {
    public static void main(String[] args) {
        Object_Class_ nesne=new Object_Class_();
        nesne.name="harika";
        System.out.println(nesne.name);
        nesne.action();

    }
}
