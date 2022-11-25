package day_20_review;

import java.util.Random;

public class MethodReviewTask1 {


//    kullanıcıya istediği miktarda
//    random olarak harf veren bir method yazınız.
//    65-90  arası alfabetik char değerler için
public static void main(String[] args) {
    System.out.println(generateLetter(10));
}
    public static String generateLetter(int a){
            Random rd = new Random();
            char ch;
            String str = "GH";

            for (int i = 0; i < a; i++) {
             ch =  (char) (rd.nextInt(26)+65);
//             str = str+ch+" ";
             str+=ch+" ";
            }
            return str;
        }


}
