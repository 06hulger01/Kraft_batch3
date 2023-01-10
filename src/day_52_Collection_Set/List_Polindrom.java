package day_52_Collection_Set;

import java.util.*;

public class List_Polindrom {

    public static void main(String[] args) {
        //list içerisinde bulunan polindrom (terside kendisine
        // eşit olan kelimeler) kelimeleri ekrana yazdıran metodu yazınız.
        //kaşık,adanada,kazak,radar,ses,harun
        //adanada,kazak,radar,ses

        //list içerisinde bulunan polindrom (terside kendisine
        // eşit olan kelimeler) kelimeleri ekrana yazdıran metodu yazınız.(aynı kelimeleri ekrana yazma-sın)


        List<String> list=Arrays.asList("kaşık","adanada","kazak","radar","ses","harun","ses");
        polindromKelimeBul4(list);

    }

//removeAll metodunu kullanın containns kullanmayın 15 dk ara
    public static void polindromKelimeBul5(List<String> list){

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String reverse = "";
            for (int j = str.length()-1; j >=0;  j--) {
                reverse+=str.charAt(j);
            }
            if(str.equalsIgnoreCase(reverse)){
                System.out.println(str+" ");
                //removeAll-remove ikisinden biri
            }
        }

    }

    public static void polindromKelimeBul4(List<String> list){
        List<String> newList=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String reverse = "";
            for (int j = str.length()-1; j >=0;  j--) {
                reverse+=str.charAt(j);
            }
            if(str.equalsIgnoreCase(reverse) && !newList.contains(str)){
                newList.add(str);
                System.out.println(str+" ");
            }
        }

    }

    public static void polindromKelimeBul1(List<String> list){
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String reverse = "";
            for (int j = str.length()-1; j >=0;  j--) {
                reverse+=str.charAt(j);
            }
            if(str.equalsIgnoreCase(reverse)){
                System.out.println(str+" ");
            }
        }


    }

    public static void polindromKelimeBul(List<String> list){

        for (int i = 0; i < list.size() ; i++) {
           if(list.get(i).equalsIgnoreCase(reverse(list.get(i)))){
               System.out.print(list.get(i)+" ");
           }
        }
    }

    public static String reverse(String str){
        String reverse="";
        for (int j = str.length()-1; j >=0 ; j--) {
            reverse+=str.charAt(j);
        }
        return reverse;

    }

}
