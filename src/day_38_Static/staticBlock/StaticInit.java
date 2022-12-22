package day_38_Static.staticBlock;

public class StaticInit {

    static final int age;

    static int counter;//bu değişken staticImport clasından static import ile erişilmek için buaya kondu

    static {
        age=10;
        System.out.println(age);
    }

    private static int one;
    private static final int two;

    private static final int three = 3;
    private static final int four;

    static {
        one = 1;
        two = 2;
//        three = 4; // zaten bir değeri olduğu için değer atayamayız.
        four =4;

    }
    {

    }

}
