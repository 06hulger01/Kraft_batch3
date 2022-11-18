package day_15_CFS_review;

import java.util.Random;
import java.util.Scanner;

public class SwitcWhileLight {
    public static void main(String[] args) {
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

        Scanner sc = new Scanner(System.in);

        while (true) {

            int button = 0;

            while (button != 1 && button == 0) {
                System.out.println("for lighting, use switch\n" +
                        "Light is off. To on, turn button to 1");

                button = sc.nextInt();
            }

            switch (button) {
                case 0:
                    System.out.println("light is off");
                    break;
                case 1:
                    System.out.println("light is on");
                    break;
            }

            while (button == 1 && button != 0) {
                System.out.println("for lighting, use switch\n" +
                        "Light is on. To off, turn button to 0");
                button = sc.nextInt();

            }


//            Random rd = new Random();
//            int i = rd.nextInt(10);
//            System.out.println(i);


        }
    }
}
