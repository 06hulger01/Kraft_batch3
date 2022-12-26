package day_37_Constructor_Encapsulation;

import day_41_inheritanceAndAccesModifier.Person;

import java.awt.*;

public class Main extends  Person {

    public static void main(String[] args) {
       // A nesne_1=new A(63,76);
       // nesne_1.addX(15);
       // System.out.println(nesne_1.x);
     //   A nesne_2=new A(55);
      //  A nesne_3=new A(63,74);
       // System.out.println("nesne_3.y = " + nesne_3.y);
/*
      KraftBank mehmet=new KraftBank("Mehmet bey",22678914);
        KraftBank harun=new KraftBank("Harun bey",22678915);
      mehmet.paraEkle(50);
      mehmet.paraEkle(100);
      harun.paraEkle(100);
      harun.paraCek(25);
      mehmet.paraCek(50);
      harun.paraCek(80);
        System.out.println("mehmet.bakiye = " + mehmet.bakiye);
        System.out.println("harun.bakiye = " + harun.bakiye);
        System.out.println("faizHesapla(mehmet,20) = " + faizHesapla(mehmet, 20));
        System.out.println("mehmet.bakiye = " + mehmet.bakiye);
        System.out.println("faizAl(mehmet,20).musteriAd = " + faizAl(mehmet, 20).musteriAd);
*/

        Ogrenci ogrenci_1=new Ogrenci("1233445322");
        ogrenci_1.setAd("mehmet");
        System.out.println("ogrenci_1.getAd() = " + ogrenci_1.getAd());
        ogrenci_1.setOkulNo("Ankara83",55);
        System.out.println("ogrenci_1.getOkulNo() = " + ogrenci_1.getOkulNo());

        //Person person=new Person();



    }


    public static double faizHesapla(KraftBank musteri, double faizOranı){
       double result= (musteri.bakiye*faizOranı/100 )+ musteri.bakiye;
        return result;
    }


    public static KraftBank faizAl(KraftBank musteri, double faizOranı){
        musteri.bakiye= (musteri.bakiye*faizOranı/100 )+ musteri.bakiye;
        return musteri;
    }

    public static KraftBank faizAl( String name,int hesapNo,double bakiye,double faizOranı){

        KraftBank musteri=new KraftBank(name,hesapNo,bakiye);
        musteri.bakiye= (musteri.bakiye*faizOranı/100 )+ musteri.bakiye;
        return musteri;

    }
}
