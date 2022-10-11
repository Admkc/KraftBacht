package eylul_09_Inheridance;

public class Truck extends Vehicle {
    int carryingCapasity;

    public void carrying(){
        System.out.println(color+" "+type+" "+carryingCapasity+" yuk tasir");
    }


    public String toString() {
        return "Truck{" +
                "carryingCapasity=" + carryingCapasity +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
class GarageTruck{
    public static void main(String[] args) {

        Truck truck=new Truck();

        truck.carryingCapasity=16000;
        truck.type="Truck";
        truck.color="kirmizi";

        truck.sellPriceWithTax(120000);

        truck.carrying();
        truck.toString();
    }

}
