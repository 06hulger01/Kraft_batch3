package day_10_Summary;

import java.util.*;

public class AllAritmeticOperators_Summary {

    public static void main(String[] args) {
/*
        double x=10.5;
        int y=(int)x;
        System.out.println(y);

        short a=5,b=10,c;    //byte,short,int işlemlerde sonuç devamlı int
        c=(short) (a+b);



        int x=10;
        double y=4;
        int z=(int)(x/y);
        System.out.println("z = " + z);
//


int x=-35%3;
        System.out.println(x);
         int sonuc = 35 + -12 / ((-3*2) %5);
        System.out.println("sonuc = " + sonuc);
        */
//Örnek: Toplantı salonunda 15 adet sıra ve her sırada 12 adet koltuk vardır.
// Toplantıya 113 katılmıştır.
//1.Toplantı salonun toplam kapasitesi nedir?
//2.Kaç adet boş koltuk vardır ?
//3.Kaç adet sırada oturulmaktadır ?
//4. Kaç sıra tamamen boş kalmıştır.
//5.Oturulan sıralarda kaç adet boş koltuk vardır?

     Scanner scan=new Scanner(System.in);

        System.out.print("Toplantı salonunda kaç adet sıra koltuk vardır: ");
       double sira=scan.nextDouble();
        System.out.print("Toplantı salonundaki her sırada kaç adet koltuk vardır: ");
       double siradakiKoltukSayisi=scan.nextDouble();
        System.out.print("Toplantıkaç kişi katılmıştır: ");
        double toplamKisiSayisi=scan.nextDouble();

        //1.Toplantı salonun toplam kapasitesi nedir?
        double toplamkapasite=sira*siradakiKoltukSayisi;
        System.out.println("toplam kapasite: "+toplamkapasite);

        //2.Kaç adet boş koltuk vardır ?
        double bosKoltukSayisi=toplamkapasite-toplamKisiSayisi;
        System.out.println("bosKoltukSayisi = " + bosKoltukSayisi);

        //3.Kaç adet sırada oturulmaktadır ?
        double toplamOturulanSiraSayisi=Math.ceil(toplamKisiSayisi/siradakiKoltukSayisi);
        System.out.println("toplamOturulanSiraSayisi = " + toplamOturulanSiraSayisi);

        //4. Kaç sıra tamamen boş kalmıştır.
        System.out.println("Tamamen boş sira sayisi:" +(sira-toplamOturulanSiraSayisi));

        //5.Oturulan sıralarda kaç adet boş koltuk vardır?
        System.out.println("oturulan sırada kaç adet boş koltuk vardır: "+(siradakiKoltukSayisi-(toplamKisiSayisi%siradakiKoltukSayisi)));


    }



}
