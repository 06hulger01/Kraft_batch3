package day_19_MethodsCont2;

import java.util.Scanner;

public class Method_Cont_4 {


    public static void main(String[] args) {
//        System.out.println(lastDijitCheck(723, 1009));//false
//        System.out.println(lastDijitCheck(723, 1003));//true
//        System.out.println(primeNumber(5));//true
//        System.out.println(primeNumber(6));//false

//        if (primeNumber(6)){
//            System.out.println("bu bir prime numberdır");
//        }else{
//            System.out.println("prime değil");
//        }

//        System.out.println(convertPozitif(-5));

//        System.out.println(grade(55.5, 30, 97.4));

//        System.out.println(bigOfThree());
        bigOfThree2();

    }


// task
    // Bir method yazın boolean değer dondursun ve 2 sayı
//kabul etsin sayıların son rakamı aynı ise true farklı ise
//false döndürsün.
    public static boolean lastDijitCheck(int a, int b) {

//        if (a%10==b%10){
//            return true;
//        }else{
//            return false;
//        }

        return a % 10 == b % 10;

    }

//    Task
//    Bir method yazın boolean değer döndürsün 1 sayı kabul
//    etsin asal sayı ise true versin
//    Asal sayılar, sadece iki pozitif tam sayı böleni olan doğal sayılardır.
//    Sadece kendisine ve 1 sayısına kalansız bölünebilen 1'den büyük tam sayılardır.
//    En küçük asal sayı 2'dir

    public static boolean primeNumber(int a){

        if (a==0 || a==1){
            return false;
        }else{
            for (int i = 2; i < a; i++) {
                if (a%i==0){
                    return false;
                }
            }
        }

        return true;
    }

//    Bir method yazın ve verdiğiniz sayıyı negatifse pozitif e
//    pozitifse pozitif olarak versin.
    public static int convertPozitif(int a){

       return Math.abs(a);                  //1. way

//        return a<0 ? -a :a;               //2.way

//        if (a<0){                         //3.way
//            return -a;
//        }
//        else{
//            return a;
//        }

//        return a;
    }

//    Bir method yazın dönüş tipi char olsun. 3 ders notu kabul
//etsin ve ortalamayı harf cinsinden döndürsün .
//    Not aralığı Harf karşılığı
//      76-100          A
//      51-75           B
//      0-50            C

    public static char grade(double not1, double not2, double not3){
        int avarage = (int) (  (not1+not2+not3)/3  );
//        System.out.println(avarage);
        if (avarage>=76 && avarage<=100){return 'A';}
        else if (avarage>=51 && avarage<=75){return 'B';}
        else if (avarage>=0 && avarage<=50){return 'C';}
        else{return 'X';}
    }

//kullanıcıdan 3 adet sayı alan ve buyuk olanı veren bir method yazın.

    public static int bigOfThree(){
        Scanner sc = new Scanner(System.in);
        System.out.println("3 sayı girin");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        return a>b ?    ( a>c ? a : c )       :  (b>c ? b : c );
    }

    public static void bigOfThree2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("3 sayı girin");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a > b ? (a > c ? a : c) : (b > c ? b : c));
    }




//kullanıcıya istediği sayıda harf veren bir method oluşturun(ödev)




}
