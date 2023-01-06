package day_50_Summary;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {

        System.out.println("Program başladı");
        try {
            int x=5;
            int y=1;
            int z=x/y;
            System.out.println(z);
            System.out.println("----------sorun yok aferim böyle devam et-----");
        }catch (java.lang.Exception e){
            sum();
            System.out.println("Hatalı işlem ama programa devam ediyorum bir dahakinde yanlış yapma");
        }finally {
            System.out.println("finally bloğu çalıştı");
        }

        System.out.println("program devam ediyor");

        System.out.println("Merhaba Hoş geldiniz");

/*
        System.out.println("Sistemize hoş geldiniz");
        int parola=123;



        for (int i = 0; i <3 ; i++) {
            Scanner scan=new Scanner(System.in);
            System.out.print("Parola : ");

            int parola2=0;

            try {

                 parola2=scan.nextInt();
            }catch (java.lang.Exception e){
                String x=e.toString();
               String [] arr=x.split("\\.");
               System.out.println(arr[2]);
              //  System.out.println(x);
                System.out.println("Lütfen sayısal bir değer giriniz");
                i--;
               // continue;
            }
            if (parola2==parola) {
                System.out.println("Giriş yapıldı");
               break;
            } if (i==2){
                {
                    System.out.println("Şifreniz bloke olmuştur");
                    return;
                }
            }
                System.out.println("Lütfen tekrar deneyin");


        }

        System.out.println("isleme devam ediliyor......");



        System.out.println();
*/





    }

    public static void sum(){
        System.out.println("Bölme işlemi");
    }

}
