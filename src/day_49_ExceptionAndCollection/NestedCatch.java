package day_49_ExceptionAndCollection;

public class NestedCatch {

    public static void main(String[] args) {


        try {

            try {
                int[] arr = {1, 3, 5};
                int i = arr[3] / 0;// int i = arr[2] / 0   ------> artimetik exception için
            } catch (ArithmeticException e) {
                System.out.println("inner 1");
            }

            System.out.println("innerların arasından selam");
            try {
                int[] arry = {1,2,3};
                int t = arry[3];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("inner 2");
            }


        } catch (Exception e) {
            System.out.println("outer");
        }


        System.out.println("method işlemlri devam ediyor");

    }
}
