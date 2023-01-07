package day_49_ExceptionAndCollection;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExampleTryCatch {


    public static void main(String[] args) {
        intCome();
    }
    //bir method yazalım int dışında bir değer girişi yapıldıkca
    //execption handle etsin
    //istenen deger girlirse işlem sonlansın.
    public static void intCome(){
        Scanner sc = new Scanner(System.in);

        try {
            sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("lutfen bir tam rakam girniz");
            intCome();
        }
    }
}
