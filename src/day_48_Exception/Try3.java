package day_48_Exception;

public class Try3 {
    public static void main(String[] args) {

//AritmeticException
        try {
            int num = 100/0;
        } catch (Exception e) {
        e.printStackTrace();
        }
//        System.out.println("hello");

//        is handled ?
//        no: print exception description - print stack trace - terminate program
//        yes : rest of code is executed


//        NullPointerException
        String str = null;

        try {
            str.length();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }


//      ArrayOutOfBoundException
        int[] array = new int[4];

        try {
            int i = array[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

//        NUmberFormstEXception

        str = "ts";

        try {
            int i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
//            e.printStackTrace();
//            System.out.println(e.getMessage());
            System.out.println(e);
            System.out.println(e.toString());//ust satırla aynı değerleri yazdırır
        }

        System.out.println("kod buradan devam edecek");

    }
}
