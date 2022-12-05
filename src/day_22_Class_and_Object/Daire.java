package day_22_Class_and_Object;

public class Daire {

    double pi=3.14;
    double yariCap;

    public double alanHesapla(){

     return pi*yariCap*yariCap;
    }

    public double cevreHesapla(){
       // alanHesapla(8);
       return 2*pi*yariCap;
    }

    public static double alanHesapla(int r){

        return Math.PI*r*r;
    }
    public static double cevreHesapla(int r){

        return 2*Math.PI*r;
    }


}
