package day_14_control_flow_statements_LoopsCont;

import java.util.Scanner;

public class DowhileLoop {
    public static void main(String[] args) {
        int speed = 99;
        do{
            System.out.println("say hello");
        }while (speed>=100);

//        example
        System.out.println("----example");
        int i = 0;
        i=30;

        do {
            System.out.println("Merhaba");
            i++;
        }while(i<3);

        System.out.println("----example2");
//        example
        Scanner sc = new Scanner(System.in);
        int i1;
        int number = 5;

        do{
            System.out.println("sayıyı tahmin et");
            i1 = sc.nextInt();
        }while (i1!=number);

        if (i1==number){
            System.out.println("Congrats");
        }

    }
}
