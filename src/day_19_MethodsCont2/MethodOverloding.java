package day_19_MethodsCont2;

public class MethodOverloding {


    public static void main(String[] args) {
//        calculateArea(5,4);
//        calculateArea(3,3.14);
//        concat("aFM",5,true);
//        concat("aFM",5,false);
        concat("Ferid",5);
    }

    public static void calculateArea(int a ,int b){
        System.out.println(a * b);
    }
    public static void calculateArea(int r, double PI){
        System.out.println( (int)(PI * r * r));
    }

//    Bir method yazın 3 parametreli olsun. İnt ve String type
//ve birde boolean. Boolean true ise int ve String değeri
//concat yapsın. False ise başka bir methodu çağırsın ve
//String değeri int kadar yazdırsın.

    public static void concat(String str, int i, boolean bl){
        if (bl){
            System.out.println(str + i);
        }else{
            concat(str,i);
        }
    }
    public static void concat(String str, int i){
        for (int j = 0; j < i; j++) {
            System.out.println(str);
        }
    }

}
