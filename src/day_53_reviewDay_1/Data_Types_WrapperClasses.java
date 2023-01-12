package day_53_reviewDay_1;

import java.util.ArrayList;

public class Data_Types_WrapperClasses {
    public static void main(String[] args) {
//        primitive
//        byte<short<int<long
//        float<double   floating point number----0.0
//        char : single character represent
//        boolean : true-false represent

//        Casting - primitive -
//        implicit casting : automatically -->smaller to large type
        int a = 100;
        double b = a;//kapalı casting

//        explicit casting : **coder must do** --->larger to smaller type
        double d = 100.0;
        int i = (int) d;//açık casting

//        ***Wrapper class***
//        **object of primitive**
//        why do you need wrapper classes?
//        Arrays work with both types(primitive and non-primitive)
//        Collection/map can not work with primitive types
//        for that we need wrapper calasses to take advantage of flexibility of collection/map
//        every primitive type has a wrapper class

//        Neden wrapper class lara ihtiyacımız var?
//        Çünkü primitive tipler collection ve map yapılarında kullanılamıyor
//        Bu yapılarda kullnabilmek ve esnekliğe erişebilmek için wrapper class lar var
//        her primitive tipe ait bir wrapper calss vardır

        double db = 10;
        Double dbW = db; //outo boxing

        Integer numW = 10;
        int num = numW;// unboxing

        int i1 = num + numW;
        Integer iW = num + numW; //outo boxing
        ArrayList<Integer> arrL = new ArrayList<>();
        arrL.add(i1);//boxing
        arrL.add(iW);
        System.out.println("arrL = " + arrL);
        System.out.println(num + numW);

//        long x = 2147483648L;

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        System.out.println("Integer.sum(i1,iW) = " + Integer.sum(i1, iW));

        System.out.println("Integer.max(Integer.sum(i1, iW),iW) = "
                + Integer.max(Integer.sum(i1, iW), iW));
        System.out.println("Integer.min(Integer.sum(i1, iW),iW) = "
                + Integer.min(Integer.sum(i1, iW), iW));

//       **parseInt() -Converts "a string consist of dijit"  to primitive
        System.out.println(Integer.parseInt("7") + 5);
//        System.out.println(Integer.parseInt("sa7"));//runtimeException atar

//        **valuOf() -Converts "a string consist of dijit" to wrapper class object
        Integer iger = Integer.valueOf("7");
//        int i3 = (Integer.valueOf("7")).intValue();//typevalue kullnıldı
        System.out.println(Integer.valueOf("7") + 5);

        //typeValue methodları wrapper type ları primitive dondurur.
        int i2 = iger.intValue();

        System.out.println(Character.isDigit('5'));//true
        System.out.println(Character.isDigit('a'));//false

        System.out.println(Character.isLetter('a'));//true
        System.out.println(Character.isLetter('5'));//false

        System.out.println(Character.isLetterOrDigit('a'));//true
        System.out.println(Character.isLetterOrDigit('5'));//true

//        "//|*1-=%&&&!__+/*^#2-? M)))'*_+++|||!!'''a>>y//%-/((&^'*ı^^^^---+/s %%%*(&&2||||0-2>>£2"
//        yukarıdaki string ifade içindeki tarih damgasını çıkartın


        String encryp = "//|*1-=%&&&!__+/*^#2-? M)))'*_+++|||!!'''a>>y//%-/((&^'*ı^^^^---+/s %%%*(&&2||||0-2>>£2";
//        String class da char değerleri getirebileceğim bir method var --->charAt()
//        neye ihtiyacım var : String in tüm char larını gezebileceğim bir yapya ihtiyacım var --->for i
//        Character classında isLetterOrDijit() methodu lazım
        String decrypDate = "";
        for (int j = 0; j < encryp.length(); j++) {
            if (Character.isLetterOrDigit(encryp.charAt(j))){
                decrypDate+=encryp.charAt(j); //decrypDate = decrypDate + encryp.charAt(j)
            }
        }
        System.out.println("decrypDate = " + decrypDate);


    }
}
