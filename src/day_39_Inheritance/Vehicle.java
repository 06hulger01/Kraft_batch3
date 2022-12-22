package day_39_Inheritance;

public class Vehicle {
    String type;
    double price;
    String color;

    public void sellPrice(double price){
        this.price += price * 1.1;
        System.out.println("price = " + price);
    }


}
