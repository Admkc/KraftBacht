package eylul_08_StaticMethods;

public class Candidate {
    String name;    //ınstance variable,static olursa static variable
    int schoolID;

    static String branch;   //static variable
    static int counter;     //static variable

    public Candidate(String name) {
        this.name = name;
        this.schoolID = setNumber();
    }
    public static int setNumber(){
        counter++;
        return counter;

    }
    public static void setBranch(String str){

        branch=str;
    }
    public void getInfo(){
        System.out.println(name);
        System.out.println(schoolID);
        System.out.println(branch);
    }
}
class main3{
    public static void main(String[] args) {
        Candidate cd1=new Candidate("Beytullah");
        Candidate cd2=new Candidate("Alparslan");
        Candidate cd3=new Candidate("Hasan");

        Candidate.setBranch("java");
        cd1.getInfo();
        cd2.getInfo();
        cd3.getInfo();
    }
}








