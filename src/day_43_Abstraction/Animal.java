package day_43_Abstraction;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void move();
}
class main{
    public static void main(String[] args) {
        Fish aFish = new Fish("nemo");
        aFish.eat();
        aFish.move();
        Kanarya aKanarya = new Kanarya("Sarı");

        aKanarya.fly();

//Animal aAnimal = new Animal("Fast");// The abstract class in java connot be instantiated





    }
}
