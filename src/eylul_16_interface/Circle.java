package eylul_16_interface;

public class Circle extends Square implements Geometric{

    public Circle(double a){
        super(a);

    }

    @Override
    public double getArea(double expo) {
        return Geometric.PI*Math.pow(a,expo);
 //       return Math.PI*Math.pow(a,2); ikisi de olur
    }
}
