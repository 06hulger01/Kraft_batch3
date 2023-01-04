package day_48_Exception;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            new String((String) null).length();
            int[] arr = {1, 3, 5};
            int i = arr[2] / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("first");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("second");

        }
        catch (Exception e) {
            System.out.println("third");
            e.printStackTrace();

        }
        System.out.println("kod buradan devam eder");
//        multi catch yapısında sadece bir hata yakalanır
//        ozelden genele bir class sıralaması yapılmalıdır yoksa compile hatısı alınır.


    }


}
