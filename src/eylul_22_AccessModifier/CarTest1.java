package eylul_22_AccessModifier;

public class CarTest1 {
    public static void main(String[] args) {

        Car1 car1=new Car1();
        car1.model="honda";
        car1.year=2020;
//        arabam.door=4;    private oldugu icin erisilmez.
        car1.engine=1.6;
        System.out.println(car1);


    }
}
