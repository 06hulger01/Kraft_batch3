package day_46_Polymorphism;

import java.sql.Driver;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
      /*  Main main=new Main();
        System.out.println("main.sum(5,6) = " + main.sum(5, 6));
        SubClass subClass=new SubClass();
        System.out.println("subClass.sum(5,6) = " + subClass.sum(5, 6)); */

    //  Animal obje1=new Kelebek();

     /* obje1.move();
      obje1.sleep(); */
     //   System.out.println("obje1.x = " + obje1.x);

        Personel personel=new Developer();
        personel.work();
        Personel personel1=new Tester();
        personel1.work();


    }


    public  int sum(int x,int y){
        return x+y;
    }
    public static int sum(int x,int y,int z){
        return x+y+z;
    }
}
