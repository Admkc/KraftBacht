package eylul_16_interface;

public interface Geometric {
    int exponential=2;
    double PI=3.14;


    double getArea(double expo);

    default double getPrimeter(double...sides){
        double primeter=0;
        for (double side:sides){
            primeter+=side;
        }
        return primeter;

    }
//    static double getExponential(){
//        return exponential+2;
//
//    }
}
class Square implements Geometric{

    double a;

    public Square(double a) {
        this.a = a;
//        System.out.println("alan: " +getArea(Geometric.exponential));  constructor dada run layabilirim.
//        System.out.println("cevre :" +getPrimeter(4*this.a));
    }

    @Override
    public double getArea(double expo) {
        return Math.pow(a,2);
    }
}
class Run{
    public static void main(String[] args) {
        Square karem=new Square(8);
        System.out.println("alan : "+karem.getArea(Geometric.exponential));

        double primeter=karem.getPrimeter(2,2,2,2);

        System.out.println("cevre "+primeter);
        Circle dairem=new Circle(3);
        System.out.println(dairem.getArea(5));


    }
}
