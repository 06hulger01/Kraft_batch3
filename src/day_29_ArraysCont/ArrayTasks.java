package day_29_ArraysCont;

import java.util.Arrays;

public class ArrayTasks {



//    «merhaba java insanları bugün nasılsınız» gibi bir cümleyi her kelime bir
//element olacak şekilde bir array a dönüştüren bir method yazın.
    public static String[] stringToArray(String str){
        return str.split(" ");
    }

//    «kayısı, armut, üzüm, çilek, nar» cümlesinde ki meyve isimlerini her biri bir
//element olacak şekilde bir array a atın. Elementlerden 5 den az harfi olan
//varsa onun yerine armut atayın.

    public static String[] stringToArray2(String str){
        String[] split = str.split("- ");
        for (int i = 0; i < split.length; i++) {
            if (split[i].length()<5){
                split[i]="armut";
            }
        }
        return split;
    }
//    «merhaba java insanları bugün nasılsınız» cümlesini [merhaba, java,
//insanları] ve [bugün, nasılsınız] şeklinde 2 ayrı array a convert edin.
    public static String[][] splitArray(String str){
        String[] split = str.split(" ");
        String[] strArr1 = Arrays.copyOfRange(split, 0, 3);
        String[] strArr2 = Arrays.copyOfRange(split, 3, 5);

        String[][] split2 = {strArr1,strArr2};
        return split2;

    }

    public static void main(String[] args) {
        String str = "merhaba java insanları bugün nasılsınız";
        String str2 = "kayısı- armut- üzüm- çilek- nar";
        System.out.println(Arrays.deepToString(splitArray(str)));

//        String[][] twoDemArr = splitArray(str);

        for (  String[] row : splitArray(str) ){
            for (  String s  : row  ){
                System.out.print(s+" ");
            }
        }


//        System.out.println(Arrays.toString(stringToArray(str)));
//        System.out.println(stringToArray(str).length);

//        System.out.println(Arrays.toString(stringToArray2(str2)));

    }
}
