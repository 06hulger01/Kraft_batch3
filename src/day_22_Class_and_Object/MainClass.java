package day_22_Class_and_Object;

public class MainClass {
    public static void main(String[] args) {

     /*   Person person=new Person();
       // System.out.println(person.age);
       // System.out.println(person.name);
       // System.out.println(person.isLisans);
       // System.out.println(person.bankAccount);
       // System.out.println(person.size);
        Car car_1=new Car();
        car_1.color="blue";
        System.out.println(car_1.speed);
        System.out.println(car_1.color); */

/*
Daire daire_1=new Daire();
daire_1.yariCap=5;
daire_1.alanHesapla();
daire_1.cevreHesapla();
Daire daire_2=new Daire();
daire_2.yariCap=3;
        System.out.println(daire_2.cevreHesapla()*15);
*/




     Daire daire=new Daire();
      daire=null;



/*
        System.out.println(Daire.pi);
        System.out.println(Daire.alanHesapla(6));
        System.out.println(Math.ceil(3.00));
        System.out.println(Daire.cevreHesapla(5));
   */

        Daire daire1=new Daire();   //daire1   Daire@32345
        daire1.yariCap=5;

        Daire daire2=new Daire();   //daire2    Daire@32345
        daire2.yariCap=10;

        daire1=daire2;

        System.out.println(daire1.yariCap);


    }


}
