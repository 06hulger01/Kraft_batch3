package day_12_Control_Flow_Statement_Switch;

import java.util.Scanner;

public class Summary {

    public static void main(String[] args) {
        /*
        int x=9;
        System.out.println("program başladı");


        if(x>6){
            System.out.println("sayımız 6 dan büyüktür");
        } else if (x==6) {
            System.out.println("sayımız 6 ya eşittir");
        } else{
            System.out.println("sayımız 6 dan küçüktür");
        }

        System.out.println("program sonlandı");

// kullanıcıdan bir sayı alın bu sayı 2 ve 5 e tam bölünebiliyor ise
        // ekrana "bölünebilir" diğer durumda bölünemez yazdırın





        if((x%2==0)&&(x%5==0)){
            System.out.println("bölünebilir");
        }else{
            System.out.println("bölünemez");
        }

        Scanner scan=new Scanner(System.in);
        System.out.print("Sayı");
        int x=scan.nextInt();
      //2.çözüm
        if(x%10==0){
            System.out.println("bölünebilir");
        }else{
            System.out.println("bölünemez");
        }

// kullanıcının girmiş olduğu sayının negatif mi pozitif
// mi olduğunu ekrana yazan programı yazınız?

        Scanner scan=new Scanner(System.in);
        System.out.print("Sayı: ");
        int x=scan.nextInt();
        if(x>0){
            System.out.println("pozitif");
        }else if(x<0){
            System.out.println("negatif");
        }else{
            System.out.println("sayı sıfıra eşittir");
        }

kullanıcıdan 3 sayı
alın ve en büyük sayıyı ekrana yazdıran programı yazınız

        Scanner scan=new Scanner(System.in);
        System.out.print("1.Sayı : ");
        int x=scan.nextInt();
        System.out.print("2.Sayı : ");
        int y=scan.nextInt();
        System.out.print("3.Sayı : ");
        int z=scan.nextInt();


        if(x>=y && x>=z){
            System.out.println("en büyük sayı "+x);
        }else if(y>=x && y>=z){
            System.out.println("en büyük sayı "+y);
        } else {
            System.out.println("en büyük sayı "+z);
        }



        int enBuyukSayi=x;

        if(y>enBuyukSayi){
            enBuyukSayi=y;
        }

        if(z>enBuyukSayi){
            enBuyukSayi=z;
        }
        System.out.println("en buyuk sayi: "+enBuyukSayi);



        // öğrencinin vize sınavından alıdığı notun %40
        //final sınavından aldığı notun %60'ı alınarak öğrencinin yıl
        // sonu notu hesaplanıyor
        //metemetik sınavından yılsınu notu 50 nin altında ise ekrana kaldınız
        //50 ve üzeri ise ekrana geçtiniz yazsın

        Scanner scan=new Scanner(System.in);
        System.out.print("vize : ");
       double vize=scan.nextInt();
        System.out.print("final : ");
        double finalNotu=scan.nextInt();

       double ortalama=  ((vize*0.4)+(finalNotu*0.6));

        if(ortalama>=50){
            System.out.println("tebrikler geçtiniz");
        }
        else {
            System.out.println("kaldınız");
        }


        // öğrencinin vize sınavından alıdığı notun %40
        //final sınavından aldığı notun %60'ı alınarak öğrencinin yıl
        // sonu notu hesaplanıyor
        //metemetik sınavından yılsınu notu 50 nin altında ise
        // kullanıcıdan bütünleme sınav notunu isteyiniz
        // ortalama ile bütünleme sınavının ortalaması 50 nin
        // üzerinde ise öğrenciye geçtiniz
        //kaldınız yazsın
        //50 ve üzeri ise ekrana geçtiniz yazsın

        Scanner scan=new Scanner(System.in);
        System.out.print("vize : ");
        double vize=scan.nextDouble();
        System.out.print("final : ");
        double finalNotu=scan.nextDouble();

        double ortalama=  ((vize*0.4)+(finalNotu*0.6));

        if(ortalama>=50){
            System.out.println("tebrikler geçtiniz");
        }
        else {
            System.out.print("Bütünleme notunuz :");
            double butunleme=scan.nextDouble();
            double yilSonuNotu=(butunleme+ortalama)/2;
            if(yilSonuNotu>=50){
                System.out.println("Tebrikler zor da olsa geçtiniz");
            }
            else {
                System.out.println("Kaldınız, seneye tekrar aynı sınıftan devam");
            }



        }

        //  bir gün sayısı alın ve kullanıcının girmiş olduğu
        //.....gün sonra haftanın hangi günü olduğunu bulan programı yazınız

        //kullanıcı 3 cuma
        //14 salı
        //15 çarşamba

       */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen gün sayısını giriniz: ");
        int x=scan.nextInt();
        int y=x%7;

        if(y==0){
            System.out.println("salı");
        }else if(y==1){
            System.out.println("çarşamba");
        }else if(y==2){
            System.out.println("perşembe");
        }else if(y==3){
        System.out.println("cuma");
        }else if(y==4){
        System.out.println("cumartesi");
        }else if(y==5){
        System.out.println("pazar");
        }else {
        System.out.println("pazartesi");
    }


    }
}
