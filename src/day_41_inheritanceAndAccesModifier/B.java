package day_41_inheritanceAndAccesModifier;

public class B extends A {

    String strA;
    int intB;

    public B(String strA) {
      super(strA);
    }
    public B(String strA, String strB,int intB) {
      super(strA);
        this.strA=strB;
        this.intB=intB;

    }

    public void metotB(){

    }
}
