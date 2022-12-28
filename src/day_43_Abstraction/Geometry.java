package day_43_Abstraction;

public abstract class Geometry {

    String nameOfShape;

    public Geometry(String nameOfShape) {
        this.nameOfShape = nameOfShape;
    }

    abstract double calculateArea();

    //    abstract String info();

    String getNameOfShape(){
        return nameOfShape;
    }
     String info(){
         return "Name of shape is "+getNameOfShape()+ ", area is "
                 + calculateArea() ;
     }

}
class run{
    public static void main(String[] args) {
        Circle circle = new Circle("circle",3);
        System.out.println(circle.info());

//        Polygon square = new Polygon("square",4);
//        System.out.println(square.info());

        Square aSuquare = new Square("square",4);
//        System.out.println(aSuquare.info());
        aSuquare.getInfo();


    }
}
