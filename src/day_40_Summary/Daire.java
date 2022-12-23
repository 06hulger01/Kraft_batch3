package day_40_Summary;

public class Daire {

    public static final double PI=3.14;
     int  yariCap;

    public Daire(int yariCap){
        this.yariCap=yariCap;
    }

    public double getCevre(){
        return 2*PI*this.yariCap;
    }

    public static double cevreHesapla(int yariCap){
        return 2*PI*yariCap;
    }





}
