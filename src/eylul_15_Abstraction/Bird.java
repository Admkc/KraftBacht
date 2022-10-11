package eylul_15_Abstraction;

public class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("kuslar bocek yer");

    }

    @Override
    public void move() {
        System.out.println("kuslar ucarlar");

    }
}
class Parrot extends Bird{

    public Parrot(String name) {
        super(name);
    }
}
