package day_14_control_flow_statements_LoopsCont;

public class NestedForLoop {
    public static void main(String[] args){
        for(int i = 1; i<=3; i++){
            System.out.println("Outer loop " + i + ". kez döndü");
            for (int j = 1; j < 5; j++) {
                System.out.println("\tinner loop " + j + ". kez döndü");

            }
        }
        //    task 13
//    * * *
//    * * *
//    * * *
//    * * *
//    * * *
        System.out.println("----task 13");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//        task 14
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *

        System.out.println("----task 14");
        for (int i = 0; i <=5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//        task15
//        1
//        2 2
//        3 3 3
//        4 4 4 4
//        5 5 5 5 5
        System.out.println("----task 15");
        for (int i = 0; i <=5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
//        task16
//        * * * * * * * * *
//        * * * * * * * *
//        * * * * * * *
//        * * * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

        System.out.println("----task 16");
        for (int i = 9; i > 0; i--) {
            for (int j = 0; j < i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//        task17
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
        System.out.println("----task 17");
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
//        task17
//           *
//          * *
//         * * *
//        * * * *
//       * * * * *
        System.out.println("----task 18");
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j < i ; j++) {
                System.out.print(" ");
            }
            for (int t = 6-i; t > 0; t--) {
                System.out.print("* ");
            }
            System.out.println();
        }
//        ödev
//        1
//        2 3
//        4 5 6
//        7 8 9 10
    }




}
