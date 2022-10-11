package eylul_09_Inheridance;

public class Minibus extends Vehicle {
    int seat;

    public void using(){
        System.out.println(color+" "+type+" "+seat+" yolcu tasir");
    }


    public String toString() {
        return "Minibus{" +
                "seat=" + seat +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
