package day_36_Class_Object_Constructor;

public class CarMain {
    public static void main(String[] args) {
       Car car1=new Car("12545HRM3654J789");
       // System.out.println("car1.saseNo = " + car1.saseNo);
        car1.hiz=360;
        Car car2=new Car();
        car2.hiz=240;
        Car car3=new Car("2536987dd45","Honda");
        car3.hiz=80;

        Car car4=new Car(250);
        Car car5=new Car("25456332aa225","Mercedes",125);
        car5.hiz=800;
        System.out.println("car5.hiz = " + car5.hiz);

    }
}
