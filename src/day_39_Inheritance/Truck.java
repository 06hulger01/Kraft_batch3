package day_39_Inheritance;

public class Truck extends Vehicle{


    int carryingCapacity;

    public void carrying(){
        System.out.println(color+ " "+type+ " "+carryingCapacity+ " yük taşır");
    }


    public String toString() {
        return "Truck{" +
                "carryingCapacity=" + carryingCapacity +
                ", type='" + type + '\'' +
                ", price=" + (int)price +
                ", color='" + color + '\'' +
                '}';
    }
}
