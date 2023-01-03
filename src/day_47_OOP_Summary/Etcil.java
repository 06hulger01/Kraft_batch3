package day_47_OOP_Summary;

public class Etcil extends  Animal{
    int count=10;
    Etcil(String name) {
        super(name);
    }
    Etcil() {

    }
    public void sleep(){
        System.out.println(" Etcil hayvan uyuyor");
    }
    public static void eat(){
        System.out.println("etcil yemek yiyor");
    }
    public void etTuru(){
        System.out.println("Kırmızı et");
    }
}
