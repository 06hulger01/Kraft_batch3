package day_12_Control_Flow_Statement_Switch;

import java.util.Scanner;

public class Control_Flow_Statements_Switch {
    public static void main(String[] args) {
/*
        int x=6;

        switch (x){
            case 5:
                System.out.println("x beşe eşittir");
            break;
            case 6:
                System.out.println("x 6 ya eşittir");
            break;
            case 7:                            //else if gibi düşünülebilir
                System.out.println("x 7 ye eşittir");
            break;
            default:                             //else gibi düşünülebilir
                System.out.println("x 5 ve 6 ya eşit değildir");

        }

        //  bir gün sayısı alın ve kullanıcının girmiş olduğu
        //.....gün sonra haftanın hangi günü olduğunu bulan programı
        // switch case kullanarak yazınız yazınız

        //kullanıcı 3 cuma
        //14 salı
        //15 çarşamba

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen gün sayısını giriniz: ");
        int x=scan.nextInt();
        int y=x%7;

        switch (y){
            case 0:
                System.out.println("salı");
                break;
            case 1:
                System.out.println("çarşamba");
                break;
            case 2:
                System.out.println("perşembe");
                break;
            case 3:
                System.out.println("cuma");
                break;
            case 4:
                System.out.println("cumartesi");
                break;
            case 5:
                System.out.println("pazar");
                break;
            default:
                System.out.println("pazartesi");
        }

        System.out.println("switch bloğunun dışı program sonlandı");


        //hesap makinesi yapalım
        //kullanıcıdan 2 tane değer alın ve kullanıcıya yapmak isteği işlemi
        // sorun 1-toplama/2-çıkarma/3-çarpma/4-bölme
        //buna göre ekrana sonuç döndüren programı yazınız

        Scanner scan=new Scanner(System.in);
        System.out.print("1.sayi: ");
        double x= scan.nextDouble();
        System.out.print("2.sayi: ");
        double y= scan.nextDouble();

        System.out.println("lütfen yapmak istediğiniz işlemi sayı ile belirtiniz? ");
        System.out.println("1-toplama/2-çıkarma/3-çarpma/4-bölme");
        System.out.print("islem: ");
        int z= scan.nextInt();

        switch (z){
            case 1:
                System.out.println("sonuc: "+(x+y));
                break;
            case 2:
                System.out.println("sonuc: "+(x-y));
                break;
            case 3:
                System.out.println("sonuc: "+(x*y));
                break;
            case 4:
                         if(y==0){
                             System.out.println("bölen sayı sıfır olamaz");
                                 }else {
                             System.out.println("sonuc: "+(x/y));
                            }
                break;
            default:
                System.out.println("yanlış işlem seçtiniz");

        }

*/



        Scanner scan=new Scanner(System.in);
        System.out.print("1.sayi: ");
        double x= scan.nextDouble();
        System.out.print("2.sayi: ");
        double y= scan.nextDouble();

        System.out.println("lütfen yapmak istediğiniz işlemi sayı ile belirtiniz? ");
        System.out.println("1-toplama/2-çıkarma/3-çarpma/4-bölme");
        System.out.print("islem: ");
        int z= scan.nextInt();

        switch (z){
            case 1:
                System.out.println("sonuc: "+(x+y));
                break;
            case 2:
                System.out.println("sonuc: "+(x-y));
                break;
            case 3:
                System.out.println("sonuc: "+(x*y));
                break;
            case 4:
                              switch ((int)y){
                                   case 0:
                                   System.out.println("bölen sayı sıfıra eşit olamaz");
                                   break;
                                   default: System.out.println("sonuc: "+(x/y));

                                  }
                break;
            default:
                System.out.println("yanlış işlem seçtiniz");

        }

    }
}
