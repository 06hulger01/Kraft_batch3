package day_43_Abstraction;

public class Circle extends Geometry{
    double radius;

    public Circle(String nameOfShape,double radius) {
        super(nameOfShape);
        this.radius=radius;
    }

    @Override
    double calculateArea() {
        return Math.PI*Math.pow(radius,2);
    }

//    info methodu Polygon ve Circlr class ları için genel bir işlemi yapıüında
//    Parent class da genel bir method olarak yeniden tasarladık.

    //    @Override
//    String info() {
//        return "Name of shape is "+nameOfShape+ ", area is "
//                + calculateArea() ;
//    }
}
