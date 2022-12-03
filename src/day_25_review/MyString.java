package day_25_review;

public class MyString {

    String empty = "";
    String space = " ";

    public String reverse(String str){
        String st = empty;
        for (int i = str.length()-1; i >=0 ; i--) {
            st+=str.charAt(i);
        }
        return st;
    }

    public String allTrim(String str){
        return str.replace(space,empty);
    }
}
