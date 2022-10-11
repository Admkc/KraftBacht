package eylul_09_Inheridance;

public class GarageMinubus {

    public static void main(String[] args) {
        Minibus minibus=new Minibus();

        minibus.type="Minubus";
        minibus.color="Mavi";
        minibus.seat=14;
        minibus.sellPriceWithTax(50000);
        minibus.using();
        minibus.toString();
    }
}
