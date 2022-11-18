package day_15_CFS_review;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
//        task1
        int x = 10;
        int y;
        if (x == 10) {
            y = 20;
            System.out.println(y);
        }
//        System.out.println(y);// if blogu compile time da
//                                  yurumediği için y bir deger
//                                  alamdı o yuzden hata veriyor

//        task2
        System.out.println("---task2-----");
        int temp = 20;
        String message;
        if (temp >= 20) {
            message = "kelebekler uçar";
            System.out.println("message = " + message);
        }
//  task3
        int pocketMoney = 4;
        if (pocketMoney < 5) {
            pocketMoney = pocketMoney + 10;
//            pocketMoney+=10;
        }
        System.out.println("ayşenin güncel parası :" + pocketMoney);
//        task 4
        double blance = 3000;
        double priceOfSuit = 2000;
        if (priceOfSuit <= blance) {
//            System.out.println("suiti satın alabilirim");
            System.out.println("kalan bakiye : " + (blance - priceOfSuit));
        } else {
            System.out.println("yetersiz bakiye");
        }
//        task 5
//        write a program; 2 numara kabul etsin numaraların eşit
//        olup olmadığını döndürsün. Eşitse concat yapsın.eşit değilse kücük sayı kadar
//        buyuk sayıyı yazdırsın
        Scanner sc = new Scanner(System.in);
        System.out.println("2 sayı giriniz");
        int i = sc.nextInt();//5
        int i2 = sc.nextInt();//10

        if (i == i2) {//false
            System.out.println("numbersConcat : " + i + i2);
        } else {
            int cond;
            int bigNumber;

            if (i > i2) {
                cond = i2;
                bigNumber = i;
            } else {
                cond = i;
                bigNumber = i2;
            }
            for (int j = 0; j < cond; j++) {
                System.out.print(bigNumber + " ");
            }
        }
//        task6
        /*
        Not aralığı Harf karşılığı
            85-100  A
            70-85   B
            55-70   C
            40-55   D
            0-40    F
         */

        int not = sc.nextInt();

        if (not<=100 && not>85){
            System.out.println("your grade is A");
        } else if (not <= 85 && not>70) {
            System.out.println("your grade is B");

        } else if (not <= 70 && not > 55) {
            System.out.println("your grade is C");

        }else if(not<=55 && not>40){
            System.out.println("your grade is D");

        }else if(not<=40 && not>0) {
            System.out.println("your grade is F");

        }else {
            System.out.println("boyle bir not giremezsiniz.");
        }

        /*
        Bir ışık devresini kontrol eden bir program yazın. Kullanıcıyı
        «for lighting, use switch»
        mesajı ile karşılasın. Işığın başlangıç durumu kapalı veya açık olabilir.
        Örneğin «Light is off. To on, turn button to 1» başlangıç da kullanıcıya bildirsin.

        1. Işık 1 komutunu aldığında sistem «for lighting, use
        switch» «Light is on, to off turn button to 0» bildiriminde
        bulunsun.

        2. maddeyi sonsuz bir döngüde çalışacak şekilde
        tasarlayınlayın.

        • Reminder: 0 ve 1 için switch yapısı, sürekli kullanıcıya
        sormak için while yapısı kullanılabilir.
         */

    }
}
