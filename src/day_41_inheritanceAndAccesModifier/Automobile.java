package day_41_inheritanceAndAccesModifier;

public class Automobile extends Vehicle {
    String radioBrand;
    int hp;

    public Automobile(String model){
        super(model);
    }

public void start(){
    System.out.println("Automobile çalıştı");

}
}
