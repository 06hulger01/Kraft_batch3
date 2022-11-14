package day_10_Summary;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("yasınız: ");
        int x= scan.nextInt();
        scan.nextLine();

        System.out.print("isminiz nedir: ");
        String name=scan.nextLine();
        System.out.println("isminiz:"+name+" \n yasiniz: "+x);
    }
}
