package day_45_review.inheritance;

public class SubClass extends SuperClass{
    public SubClass() {

        System.out.println("SubClass " +
                "parametresiz constructor");
    }

    public SubClass(int x) {
        super(x);
        System.out.println("SubClass " +
                "parametreli constructor");
    }
}
