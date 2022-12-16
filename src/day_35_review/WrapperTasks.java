package day_35_review;

import java.util.Arrays;

public class WrapperTasks {

    public static void main(String[] args) {
        String str = "A number is a mathematical object used to count, measure, and label.\n" +
                "//        The original examples are the natural numbers 1, 2, 3, 4, and so forth.";
        String str2 = " A number is a mathematical object used to count, measure, and label.\n" +
                "        The original examples are the natural numbers 1, 2, 3, 4, and so forth.[1]\n" +
                "        Numbers can be represented in language with number words. More universally,\n" +
                "        individual numbers can be represented by symbols, called numerals; for example,\n" +
                "        \"5\" is a numeral that represents the number five. As only a relatively small\n" +
                "        number of symbols can be memorized,\n" +
                "        basic numerals are commonly organized in a numeral system,\n" +
                "        which is an organized way to represent any number.";

        System.out.println(Arrays.toString(intMiner(str)));
        result(str2);

    }

//        A number is a mathematical object used to count, measure, and label.
//        The original examples are the natural numbers 1, 2, 3, 4, and so forth.

//        task1 -- string içindeki sayıların toplamını alan bir method oluşturnuz.



//        task2 -- string içindeki sayıları bir aray içinde döndüren bir method yazın

    public static int[] intMiner(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                count++;
            }
        }
        int[] ints = new int[count];
        for (int i = 0,j = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                ints[j]=Integer.parseInt(str.charAt(i)+"");
                j++;
            }
        }
        return ints;
    }



//        A number is a mathematical object used to count, measure, and label.
//        The original examples are the natural numbers 1, 2, 3, 4, and so forth.[1]
//        Numbers can be represented in language with number words. More universally,
//        individual numbers can be represented by symbols, called numerals; for example,
//        "5" is a numeral that represents the number five. As only a relatively small
//        number of symbols can be memorized,
//        basic numerals are commonly organized in a numeral system,
//        which is an organized way to represent any number.

//        Task3 -- String içindeki toplam character/dijit character/alphabethic character/letter
//        character sayılarını yazdıran bir method oluşturun

    public static void result(String str){
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetterOrDigit(str.charAt(i))){
                count1++;
            }
            if (Character.isDigit(str.charAt(i))){
                count2++;
            }
            if(Character.isLetter(str.charAt(i))){
                count3++;
            }
        }

        System.out.println("Character.isLetterOrDigit :" + count1);
        System.out.println("Character.isDigit :" + count2);
        System.out.println("Character.isLetter :" + count3);
    }

//    Task(odev) buyuk harfleri kucuk harfe kucuk harfleri buyuk harfe ceviren bir method yazın
//    input : AhMEt
//    output : aHmeT


}
