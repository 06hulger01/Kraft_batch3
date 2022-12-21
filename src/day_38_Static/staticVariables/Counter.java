package day_38_Static.staticVariables;

public class Counter {

    static int counter;

    public Counter() {
        counter++;
        System.out.println(counter);
    }
}
