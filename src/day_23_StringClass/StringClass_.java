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


    }

}
