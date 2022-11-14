package day_11_Control_Flow_Statements_If;

import java.util.Scanner;

public class Control_Flow_Statemens_If {
    public static void main(String[] args) {
        /*
        System.out.println("program başladı");
        int x=4;
       // boolean y=true;
   //      false && true  =true
        if(true){
            x=x+20;
        }
        System.out.println("x = " + x);

        System.out.println("program sonlandı");



        //kullanıcıdan 1 ila 100 arasında bir sayı alın bu sayı 50 den
        //büyük ise sayıyı 10 ile çarparak ekrana getirin?
        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen 1 ila 100 arasında bir rakam giriniz: ");
        int x= scan.nextInt();
        if(x>50){
            x=x*10;
            System.out.println("Sonuc: "+x);

        }
        System.out.println("program sonlandı");


        //kullanıcıdan 1 ila 100 arasında bir sayı alın bu sayı 50 den
        //büyük ve 80 den küçük ise ekrana "Ortama bir not" yazdırın?
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen 1 ila 100 arasında bir rakam giriniz: ");
        int x= scan.nextInt();
        boolean y=(x>50&&x<80);
        if(y){
            System.out.println("ortalama bir not");

        }
        System.out.println("program sonlandı");

        //kullanıcıdan bir sayı alın bu
        // sayı tek ise ekrana bu sayı tekdir şeklinde yazdırın?
        System.out.println("program başladı");
        Scanner scan=new Scanner(System.in);
        System.out.print("lütfen bir sayı giriniz: ");
        int x= scan.nextInt();
        if(x%2==1){
            System.out.println("bu sayı tekdir.");
        }
        System.out.println("program sonlandı");

        //kullanıcıdan bir sayı alın bu
        // sayı çift ise ise ekrana bu sayı çift dir şeklinde yazdırarak
        // bu sayıyı 20 ile çarp ve 1 arttır ekrana sonucu yazdır.


        System.out.println("program başladı");
        Scanner scan=new Scanner(System.in);
        System.out.print("lütfen bir sayı giriniz: ");
        int x= scan.nextInt();
        if(x%2==0){
            System.out.println("bu sayı çiftir");
            x=x*20+1;
            System.out.println("Sonuc = " + x);
        }
        System.out.println("program sonlandı");

int x=6;
        System.out.println("program başladı");

        if(x>5){
            System.out.println("sayım 5 den büyüktür");
        }else {
            System.out.println("sayım 5 den küçüktür");
        }

        System.out.println("program sonlandı");




        //kullanıcıdan bir sayı alın bu
        // sayı çift ise ise ekrana bu sayı çift dir çift değil
        //ise bu sayı tekdir yazan programı yazınız.

        System.out.println("program başladı");
        Scanner scan=new Scanner(System.in);
        System.out.print("lütfen bir sayı giriniz: ");
        int x= scan.nextInt();
        if(x%2==0){
            System.out.println(" sayı çiftir");

        }else{
            System.out.println("sayı tekdir");
        }

        System.out.println("program sonlandı");




// kullanıcıdan 2 sayı alın ve büyük sayıyı ekrana yazdırın

Scanner scan=new Scanner(System.in);
        System.out.print("sayi1: ");
        int sayi1= scan.nextInt();
        System.out.print("sayi2: ");
        int sayi2= scan.nextInt();

        if(sayi1>sayi2){
            System.out.println("en buyuk sayi: "+sayi1);
        }else {
            System.out.println("en buyuk sayi: "+sayi2);
        }


        //kullanıcıdan 2 sayı alın ilk sayı ikinci sayıya tam olarak bölünebiliyor ise (ilk sayı büyük olsun)
        // ekrana sayı1 sayı2 ye tam bölünebiliyor
        // tam bölünemiyor ise ekrana tam bölünme sağlanamadı kalan (bölümden kalan sayı)
        //yazdıran programı yazınız

        Scanner scan=new Scanner(System.in);

        System.out.print("sayi1: ");
        int sayi1= scan.nextInt();
        System.out.print("sayi2: ");
        int sayi2= scan.nextInt();

        if(sayi1%sayi2==0){
            System.out.println("tam bölünebiliyor");
        }else {
            System.out.println("sayı tam olarak bölünemiyor, bölümden kalan sayı: "+ (sayi1%sayi2));
        }


             // kullanıcdan üçgenin iç açılarını isteyin (ücgenin iç açıları toplamı 180)
            // aldığınız değerleri karşılaştırarak dik üçgen olup olmadığını kontrol ediniz.
         // dik üçgen ise girilen bu değerler ile dik üçgen oluşturulabilir
        // dik üçgen değil ise bu bir dik üçgen değildir yazdırın.


        Scanner scan=new Scanner(System.in);
        System.out.print("1.açı: ");
        int x=scan.nextInt();
        System.out.print("2.açı: ");
        int y=scan.nextInt();
        System.out.print("3.açı: ");
        int z=scan.nextInt();
        if((x+y+z==180)&&(x==90||y==90||z==90)){
            System.out.println("girilen değerler ile dik üçgen oluşturulabilir");

        }else{
            System.out.println("girilen değerler ile dik üçgen oluşturulamaz");
        }



        Scanner scan=new Scanner(System.in);
        System.out.print("1.açı: ");
        int x=scan.nextInt();
        System.out.print("2.açı: ");
        int y=scan.nextInt();
        System.out.print("3.açı: ");
        int z=scan.nextInt();
        int icAcilariToplami=x+y+z;
        if(icAcilariToplami==180){
            if(x==90||y==90||z==90){
                System.out.println("bu üçgen dik üçgendir");
            }else{
                System.out.println("bu üçgen dik üçgen değildir");
            }

        }else{
            System.out.println("girdiğiniz değerler ile üçgen bile oluşturlamaz girilen değerleri kontrol ediniz");
        }



        // kullanıcıdan  vize ve final notunu alınız. not ortalaması 50  üzerinde ise
        //ekrana geçtiniz yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.print("vize: ");
        int vize=scan.nextInt();
        System.out.print("final: ");
        int finalNotu=scan.nextInt();
        if(((vize+finalNotu)/2)>50){
            System.out.println("geçtiniz");
        }
        else {
            System.out.println("kaldınız");
        }

        //kullanıcıdan vide +final not ortalamasını alın ve ortalama 50 ve üzeri 70'in altında ise
        //orta ile geçtiniz
        //70 ve üzeri 85 altı ise iyi ile geçtiniz
        //85 üzeri ise pekiyi ile geçtiniz
        //50nin altında ise kaldınız yazdıran programı yazınız.

        Scanner scan=new Scanner(System.in);
        System.out.print("vize: ");
        int vize=scan.nextInt();
        System.out.print("final: ");
        int finalNotu=scan.nextInt();
        int ortalama=(vize+finalNotu)/2;

        if(ortalama<50){
            System.out.println("kaldınız");
        }else if(ortalama>=50&&ortalama<70){
            System.out.println("orta ile geçtiniz");
        }else if(ortalama>=70&&ortalama<85){
            System.out.println("iyi ile geçtiniz");
        }else {
            System.out.println("pek iyi ile geçtiniz");
        }
        System.out.println("program sonlandı");
    */

       // kullanıcıdan aracın hızını alınız
       //aracın hızı 90'ın altında ise hızınız gayet iyi
       // aracın hızı 90 ve 140 arasında ise aracınız çok hızlı
       // aracın hızı 140 km ve üzerinde ise hız limitlerini aştınız şeklinde ekrana yazın
        Scanner scan=new Scanner(System.in);
        System.out.print("hız: ");
        int hiz= scan.nextInt();

        if(hiz<90){
            System.out.println("hızınız gayet iyi");
        }else if(hiz>=90&&hiz<140){
            System.out.println("aracınız çok hızlı");
        }else {
            System.out.println("hız limitlerini aştınız");
        }

        System.out.println("hertürlü kod buradan devam edecek");
    }


}
