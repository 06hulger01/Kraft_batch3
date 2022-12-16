package day_35_review;

public class VarArgs {

    public static void main(String[] args) {
        System.out.println(sum(2));
        System.out.println(sum(2, -10));
        System.out.println(sum(2, -10, 4));
        System.out.println(sum(sum(2, 4), 5));
    }


    public static int sum(int... ints) {
        int sum = 0;

//        for (int i = 0; i < ints.length; i++) {
//            sum+=ints[i];
//        }

        for (int i : ints) {
            sum += i;
        }

        return sum;
    }
}
