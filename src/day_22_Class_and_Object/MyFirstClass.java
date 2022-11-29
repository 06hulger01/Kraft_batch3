package day_22_Class_and_Object;

public class MyFirstClass {

    public static void main(String[] args) {
/*
        Person kullanici_1=new Person();
        kullanici_1.name="Harun";

        Person kullanici_2=new Person();
        kullanici_2.name="Zafer";

        System.out.println(kullanici_1.name+" ile "+ kullanici_2.name+" saklanbaç oyunuyorlar"); */


        Car car_1=new Car();
        Car car_2=new Car();
        Car car_3=new Car();
        car_1.brand="Honda";
        car_1.color="sarı";
        car_1.model="CRV";
        car_1.speed=360;

        car_2.brand="Mercedes";
        car_2.color="siyah";
        car_2.model="c200d";
        car_2.speed=400;

        car_3.brand="Tofaş";
        car_3.color="beyaz";
        car_3.model="Şahin";
        car_3.speed=180;


        System.out.println(car_3.brand);


    }
}
