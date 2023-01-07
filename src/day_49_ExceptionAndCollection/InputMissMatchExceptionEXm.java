package day_49_ExceptionAndCollection;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMissMatchExceptionEXm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();

        try {
            sc.nextInt();
        } catch (InputMismatchException | IllegalStateException e) {
            e.printStackTrace();
            System.out.println("wrong input or scanner is closed");
        }
    }
}
