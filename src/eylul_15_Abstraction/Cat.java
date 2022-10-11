package eylul_15_Abstraction;

public class Cat extends Animal{  //concrete


    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Kediler cok yerler");

    }

    @Override
    public void move() {
        System.out.println("Kediler hizli kosarlar");

    }
}
