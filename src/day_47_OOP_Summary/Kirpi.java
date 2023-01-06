package day_47_OOP_Summary;

public class Kirpi extends  Etcil{
    int dikenSayisi;

   Kirpi() {

    }
    Kirpi(String name) {
        super(name);
    }
    public void sleep(){
        System.out.println(name+" uyuyor");
    }
}
