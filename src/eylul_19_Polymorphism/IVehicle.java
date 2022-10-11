package eylul_19_Polymorphism;

public interface IVehicle {

    int tekerSayisi=4;

    public abstract void start();

    public abstract void stop();

    public abstract int durmaMesafe();

    default int tekerSayisi(){
        return tekerSayisi;
    }




}
