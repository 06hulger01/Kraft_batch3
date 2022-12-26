package day_41_inheritanceAndAccesModifier;

public class Vehicle {
   private String model;
   private int speed;
   private String color;

    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void start(){
        System.out.println("Araç çalıştı");
    }
   public void stop(){
        System.out.println("Araç durdu");
    }

}
