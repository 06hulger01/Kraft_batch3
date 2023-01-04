package day_48_Exception;

import java.util.Scanner;

public class Try4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
while (true) {
    System.out.println("bir sayı giriniz");
    int i = sc.nextInt();

    System.out.println("bir sayı daha giriniz");
    int t = sc.nextInt();

    try {
        System.out.println(i / t);
        break;
    } catch (RuntimeException e) {
        e.printStackTrace();
    }
}

    }


}
