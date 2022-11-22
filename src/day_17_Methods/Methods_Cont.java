package day_17_Methods;

import java.util.Scanner;

public class Methods_Cont {

    //kullanıcında 2 adet sayı alan ve bu sayıların ortalamasını veren
    //ortalama metodunu yazalım
    public static void ortalama(){
        Scanner scan=new Scanner(System.in);
        System.out.print("sayi1: ");
        int x= scan.nextInt();
        System.out.print("sayi2: ");
        int y= scan.nextInt();
        int ortalama1=(x+y)/2;
        System.out.println("Ortalama: "+ortalama1);
    }
    //kullanıcında 2 adet sayı alan en büyük sayıyı ekrana yazdırın

    public static void main(String[] args) {
        enBuyuk();


    }


    public static void enBuyuk(){
        Scanner scan=new Scanner(System.in);
        System.out.print("sayi1: ");
        int x= scan.nextInt();
        System.out.print("sayi2: ");
        int y= scan.nextInt();
        int result;
       /* if(x>=y){
            result=x;
        }
        else{
            result=y;
        }
*/
        result=(x>=y)?x:y;
        System.out.println("enbuyuk sayi "+result);
    }



}
