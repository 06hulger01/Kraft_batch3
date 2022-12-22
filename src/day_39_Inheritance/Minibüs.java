package day_39_Inheritance;

public class Minibüs extends Vehicle{

    int seat;

    public void using(){
        System.out.println(color + " " + type + " "+seat+ " yolcu taşır");
    }


    public String toString() {
        return "Minibüs{" +
                "seat=" + seat +
                ", type='" + type + '\'' +
                ", price=" + (int)price +
                ", color='" + color + '\'' +
                '}';
    }
}
