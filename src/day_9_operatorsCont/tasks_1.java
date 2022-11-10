package day_9_operatorsCont;

import java.util.Scanner;

public class tasks_1 {
    public static void main(String[] args) {
        //task1-ödev

        /*
        task 2
        Askere alım şartları 20 yaşından küçük olmamak ve sağlıklı
        olmaktır.
        isSoldier boolean değişkenine askerlik şartlarını kontrol
        ettiriniz. İnt age ve boolean healty değişkenlerini kullanınız.
        */
        int age = 20;
        boolean healty = true;

        boolean isSoldier = age>=20 && healty==true;
        System.out.println("isSoldier :"+isSoldier);

        /*task 3
        kullanıcıdan bir sayı alın sayı hem 3 hem 5 bölünüyorsa veya
        her ikisini de bölünmüyorsa false veren bir boolean kontrolü
        sağlayın.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int i = sc.nextInt();
        //15 için     true     true  ----> false
        //17 için     false    false ----> false
        //25 için     false    true  ----> true
        //9 için      true     false ---->true
        boolean b1 =  i%3==0 ^ i%5==0;
        System.out.println("b1 = " + b1);

        /* task 4
        Kullanıcıdan boy ve kilosunu sorun. Boyun son 2 rakamının
        ifade ettiği değer kilosunun 5 fazlası ve 10 eksiği aralığında
        ise true döndüren bir boolean kontrolü sağlayın.
         */
        System.out.println("lütfen boyunuzu giriniz");
        int boy = sc.nextInt();
        System.out.println("lütfen kilonuzu giriniz");
        int kilo = sc.nextInt();

        int lengthPram = boy%100;
        System.out.println("lengthPram = " + lengthPram);
        // 180 boy için         70                     85
        boolean status = kilo>=lengthPram-10 && kilo<=lengthPram+5;
        System.out.println("status = " + status);

        /*
        task 5-6-7 ödev
        */

    }
}
