package day_23_StringClass;

public class StringIntro {
    public static void main(String[] args) {
        String say = "hello"; //literal way ile //String pool da
        String sayMe = "hello";

        String sayNew = new String("hello");//new keyword ile//heap de

        boolean bl;
        bl = say.equals(sayMe);//true
        bl = say==sayMe;//true

        bl = say.equals(sayNew);//true
        bl=say==sayNew;//false

        System.out.println(bl);
    }
}
