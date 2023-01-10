package day_52_Collection_Set;

import java.util.*;

public class List_Polindrom {

    public static void main(String[] args) {
        //list içerisinde bulunan polindrom (terside kendisine
        // eşit olan kelimeler) kelimeleri ekrana yazdıran metodu yazınız.
        //kaşık,adanada,kazak,radar,ses,harun
        //adanada,kazak,radar,ses
        List<String> list=Arrays.asList("kaşık","adanada","kazak","radar","ses","harun");
        polindromKelimeBul1(list);
        //list içerisinde bulunan polindrom (terside kendisine
        // eşit olan kelimeler) kelimeleri ekrana yazdıran metodu yazınız.(aynı kelimeleri ekrana yazma-sın)




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
