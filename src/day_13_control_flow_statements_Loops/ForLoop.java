package day_13_control_flow_statements_Loops;

public class ForLoop {
    public static void main(String[] args) {
//      keyword   bşalngıç/initialization       şart/condition   increment/decrement
        for(         int i = 0;                     i<=5;                i++){
//            the code which is here be excuted as long as condition is true
//            burada ki kod condition tru oldukça yürütülecek
                            System.out.println(i);
        }
//        this code will executed, if loop condition turn to false
//        loop un conditionu false olduğunda code buradan devam eder
        System.out.println("hey compiler başın döndümü");

//        example
        for(int i = 10; i>0; i--){
            System.out.print(i+" ");
        }
//        example
        System.out.println();
        for(int i = 0; i<4; i++){
            System.out.print("he");
        }
        System.out.println(":-)");

    }
}
