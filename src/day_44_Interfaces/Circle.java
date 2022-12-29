package day_44_Interfaces;

public class Circle extends Square implements Geometry{
    public Circle(double a) {
        super(a);
//        System.out.println(getArea());
//        System.out.println(getPrimeter(a));
    }

    @Override
    public double getArea(double d) {
        return Math.PI*Math.pow(a,2);
    }

    @Override
    public double getPrimeter(double... sides) {
//        double side = sides[0];
        return 2*Math.PI*sides[0];
    }
}
