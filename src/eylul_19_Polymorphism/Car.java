package eylul_19_Polymorphism;

public class Car implements IVehicle{

    @Override
    public void start() {
        System.out.println("Car start");

    }

    @Override
    public void stop() {
        System.out.println("Car stop");

    }

    @Override
    public int durmaMesafe() {
        return 0;
    }
}
