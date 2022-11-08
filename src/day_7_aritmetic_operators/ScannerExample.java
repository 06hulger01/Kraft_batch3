package day_7_aritmetic_operators;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args){

        /*
        System.out.print("lütfen isminizi yazınız: ");
        String ad=scan.nextLine();
        System.out.println("isminiz "+ad+"'dur");

        System.out.print("lütfen bir sayı giriniz: ");
        double x=scan.nextDouble();
      //  System.out.print(x*10);

        System.out.print("lütfen bir sayı daha giriniz: ");
        int y= scan.nextInt();
        System.out.print(x+y);


        //Örnek: Ali’nin doğum yılını kullanıcıdan
        // alarak yaşını ekrana getiren programı yazınız?


        System.out.print("Ali'nin doğum yılı: ");
        int yil= scan.nextInt();
        int yas=2022-yil;
        System.out.print("Alinin yası: "+yas);
            */

        //Örnek: Ali fizik dersinden 92, kimya dersinden 55,
        // matematik dersinden 89 almıştır.
        // Konsoldan bu değerleri kullanıcıya girdirerek
        // ekrana Ali’nin not ortalamasını yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.print("Fiz: ");
        double fiz= scan.nextDouble();
        System.out.print("kim: ");
        double kim= scan.nextDouble();
        System.out.print("mat: ");
        double mat= scan.nextDouble();
        System.out.print("ortalama: "+((fiz+kim+mat)/3));

    }
}
