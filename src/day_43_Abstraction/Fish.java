package day_43_Abstraction;

public class Fish extends Animal{
    public Fish(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Balıklar küçük balıkları yer");
    }

    @Override
    public void move() {
        System.out.println("Balıklar yüzer");
    }
}
