package day_38_Static.staticVariables;

public class BirthDay_Test {
    public static void main(String[] args) {
        BirthDay aFm = new BirthDay();
        BirthDay Hacı = new BirthDay();
        BirthDay Yunus = new BirthDay();
        BirthDay Mustafa = new BirthDay();
        BirthDay Büşra = new BirthDay();
        BirthDay Özlem = new BirthDay();


        aFm.takeSlice();
        Hacı.takeSlice();
//        System.out.println(aFm.cakeSlice);
        Yunus.takeSlice();
        Mustafa.takeSlice(2);
        Büşra.takeSlice(3);
//        System.out.println(Büşra.cakeSlice);
        Özlem.takeSlice();

        System.out.println(BirthDay.cakeSlice);


    }
}
