package day_6_type_casting_aritmetic_operators;

public class AritmeticOperators_2 {
    public static void main(String[] args){

       // int sayi=5+3-2;
       // int sayi=5*3-3;
      //  int sayi=15%4*(3-1);
      //  int sayi=35 + 12 / 3 % 2 ;
        //        35+4 % 2
        //         35+0
        //          35

        int sayi=35 + 15 / 3 % 2 * (3-1);
        //       35+  15/ 3 %2 *2
        //        35+ 5%2*2
        //        35 +1*2
        //        35+2=37
        System.out.print(sayi);
    }

}
