package eylul_19_Polymorphism;

public class Dog extends Animal{

    int disSayisi;

    @Override
    public void voice() {

        System.out.println("hav hav");
    }
    public void speed(){

        System.out.println("dog runs fast");
    }
    public void sleep(){
        System.out.println("Dog is sleeping");
    }
}
