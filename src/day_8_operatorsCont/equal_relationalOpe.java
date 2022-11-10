package day_8_operatorsCont;

import java.util.Scanner;

public class equal_relationalOpe {
    public static void main(String[] args){
        //all relational operators represent a boolean condition--true or false
        // tüm ilişkisel yada eşitliksel operatorler bir şart durumu yani boolean değeri döndürür.
        // == equals to // eşittir
        // != not equal to // eşit değildir
        // > greater than // buyuktur
        // >= greater than or equal // buyuktur yada eşittir
        // < less than // küçüktür
        // <= less than or equal // küşüktür yada eşittir.

        int x = 10;
        int y = 20;

        boolean bl;
        bl = x==y;//false
        System.out.println("bl = " + bl);
        bl = x!=y;//true
        System.out.println("bl = " + bl);
        bl = x>y;//false
        System.out.println("bl = " + bl);
        bl = x>=y;//false
        System.out.println("bl = " + bl);
        bl = x<y;//true
        System.out.println("bl = " + bl);
        bl = x<=y;//true
        System.out.println("bl = " + bl);

        int z = 20;
        bl = z>=y;
        System.out.println("bl = " + bl);
        bl = z<=y;
        System.out.println("bl = " + bl);
        bl = z!=y;
        System.out.println("bl = " + bl);
        System.out.println("----------------");
        //Task 1
        //Yumurtalar 37.8 derece uzerinde ve 55-60 nem arasında
//        çalışması(kuluçkalanması) öngörülmüştür. Aşağıda ki
//        şartlara gore yumurtaların civciv olup olamayacağını
//        boolean bir değerle ifade edin.
//                sıcaklık 37.3 nem 54.
        double actualTemp = 38.3;
        int actualHumdity = 55;

        boolean condition1 = actualTemp>=37.8;
        boolean condition2 = actualHumdity>=55 == actualHumdity<=60;

        System.out.println("sıcaklık ortam şartı " +
                condition1 + " nem ortam şartı "+condition2);

//        Task 2
//        Kullanıcıdan bir sayı alın
//        sayı tek sayı mı olduğunu bir boolean değişkeni ile kontrol edin
        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("lütfen bir sayı giriniz");
        int i = sc.nextInt();
        //boolean b = i%2==1;
        boolean b = !(i%2==0);
        System.out.println(b);

         */

//        Task 3
//        kullanıcıdan gunluk aldıgı kalori sorulsun.
//        aldıgı kalori klosunun 30 katı kadarsa kişinin kilolu oldugunu
//        dogrulayan bir boolean kontrolu sağlayın.
        /*
        System.out.println("Günlük aldıgınız kalori miktarı nedir");
        double kalori = sc.nextDouble();
        System.out.println("lütfen kilonuzu girin");
        int kilo = sc.nextInt();

        boolean status = kalori/kilo >= 30;
        double kaloriKiloIndex = kalori/kilo;
        System.out.println("kalori kilo indexi : "+(int)kaloriKiloIndex+
                " kilolu olma durumu = " + status);

         */

        //task 4
        //Kullanıcıdan 2 sayı alınız ve
        //sayıların farklarının cift olduğunu
        //kontrol eden bir boolean değiken tanımlayınız.
        System.out.println("lütfen 2 sayı girin");
        int i = sc.nextInt();
        int i2 = sc.nextInt();

        boolean bl1 = (i-i2)%2==0;
        System.out.println("bl1 = " + bl1);

        //task5 ödev
        //Kullanıcıdan 3 sayı alınız ve
        //sayıların ortalamalrının tek sayı olup olmadığını
        //bir boolean değişkenle kontrol edin




    }
}
