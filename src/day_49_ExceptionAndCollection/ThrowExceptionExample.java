package day_49_ExceptionAndCollection;

public class ThrowExceptionExample {
    public static void main(String[] args) {
        //kullanıcıdan boy olcusu alan bir metod yazalım
        //170 den daha kısa deger girerse
        //exception atalım
        //giriş yapanada bir mesaj verelim.

        length(169);
    }

    public static void length(int len) {

        try {
            if (len < 170) {
                throw new ArithmeticException("Length is not suitable");//eger checked bir exception cassından hata attırırsam
//            method imzasına throws Exceptionı ekleme gerekiyor
            } else {
                System.out.println("approvel");
            }
        }
        catch (ArithmeticException e){
            e.printStackTrace();
//            System.out.println(e);
//            System.out.println(e.toString());
//            System.out.println(e.getMessage());
            System.out.println("selam");
        }

    }
}
