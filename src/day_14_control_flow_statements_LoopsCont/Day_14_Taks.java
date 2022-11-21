package day_14_control_flow_statements_LoopsCont;

import java.util.Scanner;

public class Day_14_Taks {
    public static void main(String[] args) {

        //        ödev
//        1
//        2 3
//        4 5 6
//        7 8 9 10
/*
        for (int i = 0; i <4 ; i++) {

            for (int j = 0,k=1; j <=i ; j++) {
                System.out.print(k+++"  ");

            }
            System.out.println();
        }
*/
/*
        Not aralığı Harf karşılığı
        85-100  A
        70-85   B
        55-70   C
        40-55   D
        0-40    F
                 Scanner sc=new Scanner(System.in);
        int not = sc.nextInt();   */


        /*
        if (not<=100 && not>85){
            System.out.println("your grade is A");
        } else if (not <= 85 && not>70) {
            System.out.println("your grade is B");

        } else if (not <= 70 && not > 55) {
            System.out.println("your grade is C");

        }else if(not<=55 && not>40){
            System.out.println("your grade is D");

        }else if(not<=40 && not>0) {
            System.out.println("your grade is F");

        }else {
            System.out.println("boyle bir not giremezsiniz.");
        }

        */

        /*
        Not aralığı Harf karşılığı
        85-100  A
        70-85   B
        55-70   C
        40-55   D
        0-40    F
                */

        Scanner sc=new Scanner(System.in);
        int not = sc.nextInt();

        if(not<40){
            System.out.println("f");
        }
        else if(not<55){
            System.out.println("d");
        }
        else if(not<70){
            System.out.println("c");
        }
        else if(not<85){
            System.out.println("b");
        }
        else {
            System.out.println("a");
        }


    }


}
