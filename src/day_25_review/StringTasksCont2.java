package day_25_review;

import java.util.Scanner;

public class StringTasksCont2 {

    public static void main(String[] args) {
//        System.out.println(collectOutOfLetter("merHA+ba 1 1 alabi^^#lirmisin  6 numara"));

        System.out.println(checkWord());
    }

    public static String collectOutOfLetter(String str){
        String aritmethicHolder = "";
       label : for (int i = 0; i < str.length(); i++) {
            for (int j = 97; j < 127; j++) {
                if (str.toLowerCase().charAt(i)==j
                        || str.toLowerCase().charAt(i)==' '){
                    continue label;
                }
            }
            aritmethicHolder+=str.charAt(i);
        }
        return aritmethicHolder;
    }


    public static String checkWord(){
        Scanner sc = new Scanner(System.in);
        System.out.println("iki kelime giriniz");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String message= "";

        if (s1.length()==s2.length()){
            if (!s1.equalsIgnoreCase(s2)){
                message = "girdiğiniz kelimelerin karakter sayısı eşit";
            }else{
                message = "girdiğiniz kelimeler aynı";
            }
        }else{

            checkWord();
        }
        return message;
    }
}
