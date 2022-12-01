package day_23_StringClass;

import java.util.Scanner;

public class StringTasks {
    public static void main(String[] args) {
//        System.out.println(countOfChar());
//        System.out.println(countOfChar("iyi dersler batch 3"));
//        System.out.println(lengthOfFullName("salih", "hoca"));
//        toUpperOfFullName("salih","Hoca");
//        lastCharOfMessage("cengiz");
//        charInClomn("Ferid");
        oruntu("Bulent");
    }

//  Task1
//    Konsoldan kullanıcıdan bir mesaj alın
//    ve method onun karakter sayısını versin/dondursun.

    public static int countOfChar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String str = sc.nextLine();
        return str.length();
    }

    //    way2
    public static int countOfChar(String str) {
        return str.length();
    }
//  task2
//    Adınızın ve soyadınızın kaç karakterden
//    oluştuğunu konsola yazdırın.

    public static int lengthOfFullName(String name, String lastName) {
        return name.length() + lastName.length();
    }

//      Task3
//    Adınızın ve soyadınızı büyük harfle yazdıran bir method yazın.
    public static void toUpperOfFullName(String name, String lastName) {
        System.out.println(name.toUpperCase() + " " + lastName.toUpperCase());
    }

//    Task4
//    Aldığınız mesajın son index ini yazdırın.
    public static void lastCharOfMessage(String message){
        System.out.println(message.charAt(message.length() - 1));
    }



//    Task5
//    Aldığınız mesajın her karakterini konsola alt alta yazdırın.
//    +
//    terden alt lata yazdırın
    public static void charInClomn(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
//    +
//    terden alt lata yazdırın
        System.out.println("---------");
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.println(str.charAt(i));

        }
    }
//    Task6
//    Kullanıcıdan bir kelime alın ve harflerini büyük küçük
//    büyük … örüntü şeklinde yazdırın.
        public static void oruntu(String str){
                String oruntu = "";
            for (int i = 0; i < str.length(); i++) {
                if (i%2==0){
                    oruntu+=str.toUpperCase().charAt(i);
                }else{
                    oruntu+=str.toLowerCase().charAt(i);
                }
            }
            System.out.println(oruntu);
        }

//        Kullanıcıdan 3 kelime alın ve length i uzun olandan kısa
//          olana hepsini birleştirin. Concat() kullanın. (Ödev)




}
