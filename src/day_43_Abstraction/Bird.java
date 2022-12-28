package day_43_Abstraction;

public abstract class Bird extends Animal{//concrat

    public Bird(String name) {
        super(name);
    }

    //    @Override
//    public void eat() {
//        System.out.println("Kuşlar yem yerler");
//    }
//
    @Override
    public void move() {
        System.out.println("kuşlar uçarlar");

    }
    public abstract void fly();
}
class Kanarya extends Bird{

    public Kanarya(String name) {
        super(name);
    }

    @Override
    public void eat() {

    }

//    @Override
//    public void move() {
//
//    }

    @Override
    public void fly() {

    }
}
