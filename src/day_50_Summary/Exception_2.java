package day_50_Summary;

import java.io.IOException;

public class Exception_2 {
    public static void main(String[] args)  {
        System.out.print("Yükleniyor");
        try {
            for (int i = 0; i <10 ; i++) {
                Thread.sleep(1000);
                System.out.print(" .");
            }
        }catch (java.lang.Exception e){
            System.out.println("hata");
        }




    }

    void metotB() {
        metotA();
    }

    void metotA()  {
        try {
            tehlikeliMetot();
        }catch (java.lang.Exception e){
            System.out.println("kontrol edildi");
        }

    }
    void metotC() {
        tehlikeliMetot();
    }

    void tehlikeliMetot()  {
        int x=5;
        if(x<10){
            throw new IndexOutOfBoundsException();
        }
    }
}
