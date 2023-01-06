package day_50_Summary;

public class B extends A {
    int b;

    @Override
    void metotA() {
        System.out.println("B sınınıfının metodu çalıştı");
    }

    void metodB(){
        System.out.println("Override edilmeyen metod");
    }
}
