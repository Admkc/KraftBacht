package eylul_22_AccessModifier;

public class Car1 extends Object{//tüm sınıflar object classa baglıdır otamatik olarak

    public int num1;
    protected int num2;
    int num3;
    private int num4;
    String model;
    public int year;

    private int door=4;
    protected double engine;

    void method1(){}
    public void method2(){}
    private void method3(){}
    protected void method4(){}





    @Override//üzerine yazma
    public String toString() {
        return "Car1{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", door=" + door +
                ", engine=" + engine +
                '}';
    }

    public Car1() {
    }

    public Car1(String model, int year, int door, double engine) {
        this.model = model;
        this.year = year;
        this.door = door;
        this.engine = engine;
    }
}
