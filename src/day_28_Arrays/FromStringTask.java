package day_28_Arrays;

public class FromStringTask {

    //verilen kelimenn sesli harfalerini verilen parametreye ceviren method yazın.


    public static String game(String str, char ch){
        String restore = "m$r";
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)){
                case 'a','e','i','ı','o','ö','u','ü':
                    restore+=ch;
                    break;
                default:
                    restore+=str.charAt(i);
                    break;
            }
        }
        return restore;
    }

    public static void main(String[] args) {
        System.out.println(game("merhaba", '$'));
    }
}
