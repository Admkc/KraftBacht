package eylul_07_Encapsulation;

public class Dog {
    private String name;
    private String breed;
    private boolean isBlack;
    private int age;


    public Dog() {
    }
   public String getName(){
        return this.name;


    }
    public void setName(String name){

        this.name=name;
    }
    public String getBreed(){
        return this.breed;
    }
    public void setBreed(String breed){

        this.breed=breed;
    }
    public int getAge(){

        return this.age;
    }
    public void setAge(int age){

        this.age=age;
    }

    public boolean getisBlack() {
        return isBlack;
    }

    public void setBlack(boolean black) {
        isBlack = black;
    }
}
class MAİN13{
    public static void main(String[] args) {
        Dog it=new Dog();
        it.setName("kaarbas");
        System.out.println(it.getName());
        it.setAge(15);
        System.out.println(it.getAge());
       it.setBlack(true);
        System.out.println(it.getisBlack());

    }
}


