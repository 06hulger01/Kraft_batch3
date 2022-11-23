package day_18_MethodsCont;

import java.time.LocalDate;
import java.util.Scanner;

public class Methods_Cont_2 {

    public static void main(String[] args) {
        //        kiloToOkka();
//        converter();
//        message(5);    //arguman insertion is mandotory/arguman girmek zorunlu
//        message(10);
        int c = 20;
        String str = "salih";
//        message(c);
//        message(str);//data type aynı olmalı
//        calculateAge(1980);
//        kuvvet(3,2);//2³
//        sum(5, 10);
        calculater(20,10,"/");

    }

    public static void converter() {
        kiloToOkka();
        converter();
    }

    public static void kiloToOkka() {
        Scanner sc = new Scanner(System.in);
        System.out.println("okka ya cevirmek istediğiniz kilogram değeri girin");
        double kl = sc.nextDouble();
        System.out.println(kl / 1.283 + " okkadır");
    }

    //    parametreli methodlar
    public static void message(int a) {//parametrezid method
        System.out.println(a + " is here");
        System.out.println(a + " + 10 " + (a + 10) + " eder");
    }

    //    Task
//    Bir method yazın doğum yılınızı girdiğinizde yaşınızı versin.
    public static void calculateAge(int born) {
//        LocalDate currentYear = LocalDate.now();
//        System.out.println(currentYear.getYear() - born);
        System.out.println(2022 - born);
    }

    //    task
//    Bir method yazın 2 sayı kabul etsin ve ilk sayıyı ikinci
//    sayının üslü kuvveti yapıp sonuç versin.Math.pow(a,b)
    public static void kuvvet(int a, int b) {
//            double pow = Math.pow(b, a);
//            System.out.println((int)pow);
        System.out.println(Math.pow(b, a));
    }
//Bir method yazın 2 sayı kabul etsin çağırdığımızda konsola
//işlemin matematiksel görünümünü yazdırsın.
//Exmp: 5 + 6 = 11

    public static void sum(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
//    task
//    Bir method yazın 3 parametre li olsun ilk ikisi işleme sokulacak
//      sayıları üçüncü ise yapılacak işlemi belirlesin. Sonucu versin.

    public static void calculater(double a, double b, String art) {
        if (art.equals("+")) {
//            System.out.println(a + b);
            sum((int) a, (int) b);
        } else if (art.equals("-")) {
            System.out.println(a - b);
        } else if (art.equals("*")) {
            System.out.println(a * b);
        } else if (art.equals("/")) {
            System.out.println(a / b);
        } else {
            System.out.println("aritmethic operator is not valid");
        }
    }

}
