package day_45_review.inheritance;

public class Test {
    public static void main(String[] args) {
        Derived derived = new Derived(2,"A");

        derived.M1();

        System.out.println(Base.b);
        System.out.println(Derived.b);

    }


}
