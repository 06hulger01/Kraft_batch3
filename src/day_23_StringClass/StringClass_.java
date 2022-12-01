package day_23_StringClass;

public class StringClass_ {
    public static void main(String[] args) {
//length()
        String progLang = "java";

        System.out.println(progLang.length());//4

        String progLang2 = "pyTHon";

        System.out.println(progLang2.length());//6

        System.out.println(progLang.length() + progLang2.length());//10

//toUpperCase() and toLowerCase()

        System.out.println(progLang.toUpperCase());//JAVA
        System.out.println(progLang2.toLowerCase());//python

//charAt()

        System.out.println(progLang2.charAt(2));
        String message = "Girilen index numarasındaki char değeri döndürür";
        System.out.println(""+message.charAt(0) +" ve "+ message.charAt(message.length() - 1) + " dir");

//concat()
        System.out.println(message.concat(progLang));

        System.out.println(message.concat(" değil mi?"));

//contains()

        System.out.println(message.contains("index"));
        System.out.println(message.contains(" n"));
        System.out.println(message.contains("x n"));
        System.out.println(message.contains(" ct"));//false
        System.out.println(message.contains(" "));
        System.out.println(message.contains("c"));

//trim()
        String s = "    merhaba dünya     ";
        System.out.println(s);
        System.out.println(s.trim());
        String trim = s.trim();
        System.out.println(trim);

//replace()
        String replace = trim.replace("merhaba", "selam");
        System.out.println(replace);

//indexOf()
        //selam dünya
        int dünya = replace.indexOf("dünya");
        System.out.println(dünya);

        int dünya2 = replace.indexOf("düya");//bulamadığı dizilim için -1 dündürür.
        System.out.println(dünya2);

//equalsIgnoreCase
        System.out.println(" equals-----");
        String st = "hello";
        String st2 = "hello";
        String st3 = "HELLO";

        System.out.println(st.equals(st2));//true
        System.out.println(st.equals(st3));//false
        System.out.println(st.equalsIgnoreCase(st3));//true


        System.out.println(" isEmpty-----");
//        isEmpty()
        String empty = "";
//        empty = " ";
        System.out.println(empty.isEmpty());

        System.out.println(" substring-----");
//        substring()

        String main = "Merhaba java insanları";
        String substring = main.substring(5);
        System.out.println(substring);
        String substring1 = main.substring(5, 10);
        System.out.println(substring1);


    }

}
