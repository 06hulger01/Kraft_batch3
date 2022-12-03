package day_25_review;

public class Class1 {
    public static void main(String[] args) {

        MyString my = new MyString();

        String str = "Ferid";

        System.out.println(my.reverse(str));

        System.out.println("salih" + my.space + "Hoca");

        String str2 = "     salih    emre    cengiz     ";

        System.out.println(my.allTrim(str2));

        my.allTrim(str2);



        String str3 = new String("     salih    emre    cengiz     ");

        str3.trim();







    }
}
