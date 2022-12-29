package day_44_Interfaces;

public interface Geometry {

    int exponetial = 2;
    double getArea(double d);

    default double getPrimeter(double... sides){
        double primeter = 0;
        for (double side : sides){
            primeter+=side;
        }
        return primeter;
    }


    static double getExponential(double d){
        return exponetial+d;

    }
}
class Square implements Geometry{
    double a;
    public Square(double a) {
        this.a = a;
//        System.out.println(Geometry.getExponential(this.a));
//        System.out.println("Alan : "+getArea(Geometry.getExponential(this.a)));
        System.out.println("Alan : "+getArea(this.a));
        System.out.println("Çevre : "+
                getPrimeter(this.a, this.a, this.a, this.a));
    }

    @Override
    public double getArea(double d) {
        return Math.pow(a,Geometry.exponetial);
    }
}

