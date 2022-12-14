package eylul_15_Abstraction;

public abstract class Geometry {

    String nameOfShape;

    public Geometry(String nameOfShape) {
        this.nameOfShape = nameOfShape;
    }

    abstract double area();
    abstract String info();



}
class Circle extends Geometry{
    double radius;


    public Circle(String nameOfShape,double radius) {
        super(nameOfShape);
        this.radius=radius;
    }

    @Override
    double area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    String info() {
        return "nameof shape " +nameOfShape+" Area is " +area();
    }
}




class Square extends Geometry{
    double lenght;

    public Square(String nameOfShape,double lenght) {
        super(nameOfShape);
        this.lenght=lenght;
    }

    @Override
    double area() {
        return Math.pow(lenght,2);
    }

    @Override
    String info() {
        return "name of shape is "+nameOfShape+ "Area is " +area();
    }
}
