package eylul_08_StaticMethods;

public class Student {
    static  String name;

      public Student(String name){

          this.name=name;
    }
    public void printName(){

          System.out.println("name= " +name);
    }

}
class main5{
    public static void main(String[] args) {
        Student std1=new Student("can");
        Student  std2=new Student("canan");

        std1.printName();
        std2.printName();    //variable i static yaparsak classa ait bir deger oldugu icin staticle olusturulmus
                            // tum nesneler etkilenecek ve son degeri alacaktır.



    }
}
