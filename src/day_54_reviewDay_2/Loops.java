package day_54_reviewDay_2;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //fori
        //iteration number is fixed
        //track index
        //for(initialization; condition; iterator){}

        //while
        //iteration is not fixed
        //do not track if index
        //while(condition){}

        //do While
        //one time execute even condition is false
        //do{}while();

        String message = "elveda java dersleri";
        //how t reverse last word of message?
        //1-tersen çalışan bir ndex loop yapısına ihtiyacım var
        //2-ilk boşlukta kodum kesilmeli
        String reverse = "";
        int i = message.length() - 1;

        for (i = i; i >= 0; i--) {
            if (message.charAt(i) == ' ') {
                break;
            }
            if (message.charAt(i) != ' ') {
                reverse += message.charAt(i);
            }
        }
        System.out.println("reverse = " + reverse);
//        ---
        reverse = "";
        for (i = i; i >= 0; i--) {

            if (message.charAt(i) != ' ') {
                reverse += message.charAt(i);
            }else{
                break;
            }
        }
        System.out.println("reverse = " + reverse);
//        ---
        reverse = "";
        for (i = i; i >= 0; i--) {

            if (message.charAt(i) == ' ') {
                break;
            }else{
                reverse += message.charAt(i);
            }
        }
        System.out.println("reverse = " + reverse);

//        while
        message = "elveda java dersleri";
        reverse = "";

        i = message.length() - 1;
        while (message.charAt(i)!=' ') {
            reverse += message.charAt(i);
            i--;
        }

//        using array
        String[] s = message.split(" ");
        System.out.println("s.length = " + s.length);
        System.out.println("s[s.length-1] = " + s[s.length - 1]);

        //karmaşık okuması zor
        for (int j = s[s.length-1].length()-1; j >=0 ; j--) {
            reverse += s[s.length-1].charAt(j);
        }

        String s1 = s[s.length - 1];
        //daha sade daha okunur daha guzel
        for (int j = s1.length()-1; j >=0 ; j--) {
            reverse += s1.charAt(j);
        }
        System.out.println("reverse = " + reverse);


//        ------------
//        do while
        String color = "blue";
        int count = 0;
        do{
            count++;
            System.out.println("do it");
        }while (color.equals("red") && count<10);

//        break an continue

//        kullancıdan bir sayı aralığı alın
//        1- 7 ye tam bolunen sayıya kadar azalan şekilde yazdırın
//        2- 7 ye tam bolunenleri azalan şekilde yazdırın

        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        //1
        for (int j = Integer.max(i1,i2); j >=Math.min(i1,i2) ; j--) {
            if (j%7==0)break;
            System.out.println(" "+j);
        }
        //2
        System.out.println("------");
        for (int j = Integer.max(i1,i2); j >=Math.min(i1,i2); j--) {
            if (j%7!=0)continue;
                System.out.println(" "+j);
        }

//        label works with break and continue
//        verilen aralıktaki prime numberları bulalım

//        1-prime number sadece kendine ve 1 e bolunebilen sayıalar
//        2-hersayı saı 1 e bolunebilir o halde loop 2 den başlamalı
//        3-iç içe 2 adet loop yapısı lazım. dıştaki aralıktan sayları getirecek
//                içdeki loop ise gelen sayıyı 2 dahil  kendine
//                kadar olan sayılara tam bolunup bolunmediğinin denetimini yapacak

        System.out.println("------prime number");
       label: for (int j = Integer.min(i1,i2); j <=Math.max(i1,i2); j++){
            for (int k = 2; k < j; k++) {
                if (j%k==0){
                    continue label;
                }
            }
           System.out.println(j+ " ");
        }

    }
}
