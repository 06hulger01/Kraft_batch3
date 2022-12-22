package day_39_Inheritance;

public class GarageMinibus {
    public static void main(String[] args) {
        Minibüs minibüs = new Minibüs();
        minibüs.type="Minübus";
        minibüs.color="Mavi";
        minibüs.seat=14;
        minibüs.sellPrice(90000);
        minibüs.using();
        System.out.println(minibüs.toString());

//        Truck truck = new Truck();
//        truck.type="Kamyon";
//        truck.color="Kırmızı";
//        truck.carryingCapacity=16000;
//        truck.sellPrice(220000);
//        truck.carrying();
//        System.out.println(truck.toString());

    }
}

class GaragaTruck  {
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.type="Kamyon";
        truck.color="Kırmızı";
        truck.carryingCapacity=16000;
        truck.sellPrice(220000);
        truck.carrying();
        System.out.println(truck.toString());
    }

}
