package day_20_review;

import java.util.Scanner;

public class BreakAndContinue {

    public static void main(String[] args) {


        int a = 10;
        for (int i = 1; i < 30; i++) {
            if (i==a){
//               break;
//                System.out.print("-bugun iş yok-");
                System.out.print(i+" ");
                continue;
            }
            System.out.print(i+10+" ");
        }
//kullanıcıdan bir dongu sayısı alın
//hem 3 hem 5 bolunen bir sayı yakaladığında
//önceki sayıyı yazdırıp doguden çıkın.
//        +
//        hem once ki hem sonraki sayıyı yzdırıp cıkın
    /*    System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int i = sc.nextInt();
        for (int j = 1; j < i; j++) {
            if (j%3==0 && j%5==0){
                System.out.println(--j);
//                System.out.println(j+2);
                break;
            }
        }
*/

//kullanıcıdan bir dongu sayısı alın
//hem 3 hem 5 bolunen sayıları
//yazdırmadan seriyi yazdırın
/*
        System.out.println("bir sayı giriniz");
        int t = sc.nextInt();
        for (int j = 1; j <=t; j++) {
            if (j%3==0 && j%5==0){
                System.out.print("-*-");
               continue;
            }
            System.out.print(j+" ");
        }*/

//        label

//        1 den 10 kadar sayı dongumuz olsun
//        songu sayısı 3 e eşit oldugunda "A3" şeklinde yazsın
//        A degerini bir iç donguden alsın
//        a)donguden çıksın
//        b)donguye devam etsin
        System.out.println();
      outer:  for (int j = 1; j <=10; j++) {
            for (char k = 65; k < 68; k++) {
                if (j==3){
                    System.out.println(k+""+j);
                   continue outer;
                }else{
                    System.out.println(j);
                break ;
//                    continue outer;
                }
            }
        }


        int x;
        x = 65;
        char ch = (char)x;
        System.out.println("ch = " + ch);


    }
}
