package eylul_08_StaticMethods;

public class Student_ {
    int number;
    String name;

  static String schoolName="KRAFT";

    public Student_(int number, String name) {
        this.number = number;
        this.name = name;
    }


    public String getInfo() {
        return "Student_{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

}
class main9{
    public static void main(String[] args) {



        Student_ student_1=new Student_(150,"Talip");
        Student_ student_2=new Student_(150,"Bahar");
        Student_ student_3=new Student_(150,"Hatice");
        Student_ student_4=new Student_(150,"Ibrahim");

       student_1.schoolName="Kraft";


        System.out.println(student_1.getInfo());
        System.out.println(student_2.getInfo());
        System.out.println(student_3.getInfo());
        System.out.println(student_4.getInfo());

    }
}
















