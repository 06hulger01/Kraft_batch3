package day_45_review.inheritance;

public class Derived extends Base{

    int a;

    static int i = Base.b;
//    static int i = b;
    public Derived(int a, String s) {
        super(a, s);
        System.out.println("Derived class constructor");
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
        System.out.println(Base.b);
    }

    void M1(){
        System.out.println(Base.b);
        System.out.println(b);
        System.out.println(i);
    }

    @Override
   public void method() {

    }
}
