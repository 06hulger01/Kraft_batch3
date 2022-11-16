package day_13_control_flow_statements_Loops;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
//        task1
//Bir program yazın ve 0-100 arasındaki tüm sayıları yan yana yazdırsın.
        for (int i = 0; i <= 100; i++) {
            System.out.print(i+" ");
        }
 //        task2
//Bir program yazın ve 0-100 arasındaki tüm çift sayıları yazdırsın.
        System.out.println("------task2");
        for (int i = 0; i <=100; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
//        task3
//Bir program yazın ve 50-10 arasındaki tüm tek sayıları yazdırsın.
        System.out.println("\n------task3");
        for (int i = 50; i > 10; i--) {
            if (i%2==1){
                System.out.print(i+" ");
            }
        }
//        task4
//Bir program yazın ve 0-100 arasındaki tüm tek sayıları yazdırsın.
        System.out.println("\n------task4");
        for (int i = 0; i < 100; i++) {
            if (i%2==1){
                System.out.print(i+" ");
            }
        }
//        task5
//Bir program yazın ve 1-100 arasındaki sayıların toplamını konsola yazdırın
        System.out.println("\n------task5");
        int sum = 0;
        for(int i = 1; i<=100; i++){
//            sum=sum+i;
            sum+=i;
//            if (sum>2000 && sum<3000){
//                System.out.println("sum = " + sum);
//            }
//            System.out.println("i "+i+ " iken sum = "+sum);
        }
//        System.out.println("------");
        System.out.println("sum = "+sum);//5050

//        Task6
//        Bir program yazın ve 1-20 ye kadar olan sayıları 3 ile çarpın.
        System.out.println("\n------task6");
        for (int i = 1; i <=20; i++) {
            System.out.println(i + " X " + 3 + " = " + (i * 3));
//            System.out.println(i + " X 3 = " + (i * 3));
        }
// 1 alternatif çüzüm:
        int x = 0;
        for (int i = 1; i <=20; i++) {
            x = i * 3;
            System.out.println(x);
        }
//        task7
//Bir program yazın ve 0-30 arasındaki sayılardan tek olanlara 3
//ekleyin ve çift olanları 2 ile çarpın.
        System.out.println("\n------task7");
        for (int i = 0; i <= 30; i++) {
            if (i%2==1){
                System.out.println(i + "+3 = "+(i+3));
            }else{
                System.out.println("\t"+i + "X2 = "+ i*2);
            }
        }
//        task8
//        Bir program yazın ve 30-70 arasındaki 3 ün katlarını yazdırın
        System.out.println("\n------task8");
        for (int i = 30; i < 70; i++) {
            if (i%3==0){
                System.out.print(i+" ");
            }
        }
//        task9
//        Bir program yazın ve 0-1000 arası sonu 11 ile biten tüm sayıları
//        yazdırın
        System.out.println("\n------task9");
        for (int i = 0; i < 1000; i++) {
            if (i%100==11){
                System.out.print(i+" ");
            }
        }
//        task10
//        Bir program yazın kullanıcıdan sayı aralığı alın ve aralıktaki
//        sayıların hepsini çarpın.
        System.out.println("\n------task9");
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen 2 sayı giriniz");
        int i = sc.nextInt();
        int i2 = sc.nextInt();
//        kullanıcıın girdiği sayıların buyuk
//        kucuk denetimi yapılmalı ve kucuk olan
//        j ye başlangıc degeri olarak atanmalı
        int multiplication = 1;
        for (int j = i; j < i2; j++) {
            System.out.println("j = " + j);
            multiplication*=j;
        }
        System.out.println("multiplication = " + multiplication);


    }











}
