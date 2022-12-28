package day_43_Abstraction;

public abstract class Polygon extends Geometry{

    double side;

    public Polygon(String nameOfShape,double side) {
        super(nameOfShape);
        this.side=side;
    }

    abstract double calculateArea();
    abstract void getInfo();

//    @Override
//    String info() {
//        return "Name of shape is "+nameOfShape+ ", area is "
//                + calculateArea() ;
//    }
}
class Square extends Polygon{
    public Square(String nameOfShape, double side) {
        super(nameOfShape, side);
    }

    @Override
    double calculateArea() {
        return Math.pow(side,2);
    }

    @Override
    void getInfo() {
        System.out.println(info());
        System.out.println("merhaba");
    }
}
