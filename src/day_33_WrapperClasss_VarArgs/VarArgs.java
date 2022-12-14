package day_33_WrapperClasss_VarArgs;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println(sum(5, 10));
        System.out.println(sum(5, 10, 15));
        System.out.println(sum(3, 6, 9, 12, 15, 20));

        System.out.println(concat("ja", "va", " ", "insanları"));
        System.out.println(concat2("JAVA", "PYHTHON", "C++", "PHP", "FORTRAN"));
        System.out.println(
                //"bu bir üçgendir : 15"

                Arrays.deepToString(intellijPrimeterCalculater(5, 10, 15))
                        .replace('[',' ')
                        .replace(']',' ')
                        .replace(',',':')


        );


    }
//    public static int sum(int a,int b){
//        return a+b;
//    }
//    public static int sum(int a,int b,int c){
//        return a+b+c;
//    }
//    public static int sum(int a,int b,int c,int d,int e){
//        return a+b+c+d+e;
//    }
    public static int sum(int... sayılar){
        int sum = 0;

        for (int i = 0; i < sayılar.length; i++) {
            if (sayılar[i]%2==0){
                sum+=sayılar[i];
            }
        }
//        for (int i : sayılar) {
//            sum+=i;
//        }
        return sum;
    }

    public static String concat(String... kelimeler){
        String str = "";
        for (String s : kelimeler){
            str+=s;
        }
        return str;
    }

// JAVA PYHTHON C++ PHP FORTRAN
    public static String concat2(String... words){
        String empty ="";
        for (int i = 0; i < words.length; i++) {
            empty+=words[i].charAt(0);
        }
        return empty;
    }

//    geometrik yüzeylerin cevre hesaplamasını yapan bir method oluturun
//    geometrik sekli çevre sayısna gore tanımlayan ve cevrsini veren bir method olsun
//    "bu bir üçgendir : 15"
//    "bu bir dörtgendir : 25"
//    "bu bir beşgendir : 55"
//    "bu bir altıgendir : 55"
//    "bu bir çokgendir : 45"
//    methodun return type ı two dimensinal array olsun.
        public static String[][] intellijPrimeterCalculater(int... ints){
                    int primeterOfShape = 0;
                    String nameOfShape = "";
                    for (int i:ints){
                        primeterOfShape+=i;
                    }
                    if (ints.length==3){nameOfShape="üçgen";}
                    else if (ints.length==4){nameOfShape="dörtgen";}
                    else if (ints.length==5){nameOfShape="beşgen";}
                    else if (ints.length==6){nameOfShape="altıgen";}
                    else if (ints.length>6){nameOfShape="çokgen";}
                    else{
                        String[][] result = {{"there is no"},{"shape"}};
                    return result;}

                    String[][] result = {{nameOfShape+" in çevresi "},{primeterOfShape+""}};
                    return result;
        }

}
