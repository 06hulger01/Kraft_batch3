package day_55_review_3;

public class String_Classes {
    public static void main(String[] args) {

//        String is sequences of char value

        String str = "Little";
        //String is immutable.// değiştirilemez.

        str.concat(" child"); //Little hild-----heap memeory de refaransız bir sekilde oluşturuldu

        String boy = str.concat(" boy");//referans boy oldu

        System.out.println("str = " + str);//Little----> if it doesnt reassign to str. str always have orijinal value

        str = str.concat(" girl");//8. satırdaki değer garbage atılacak

        System.out.println("str = " + str);

        System.out.println("str.equals(Little girl) = " + str.equals("Little girl"));//value check yapar
        System.out.println( str == "Little girl");//false == referans checek yapar

//        -----

//        we can create a string by two way
//        String literal
        String literal = "LasDay";
//        by new keyword
        String byNew = new String("Of Java");

//        ---------

//        String Builder and String buffer are mutable/değişken
        StringBuffer strBffr = new StringBuffer("Java");//syncronized---thread safe
        // concat()---append()
        strBffr.append(" p language");

        System.out.println("strBffr = " + strBffr);
//        ---------

//        method of string class
//        length()---charAt()---substring()---concat()---replace()---contains()---equals()---indexOf()---.........
//        split()---> we use split method for converting string to array.




    }
}
