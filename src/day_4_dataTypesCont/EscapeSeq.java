package day_4_dataTypesCont;

public class EscapeSeq {

    public static void main(String[] args){

        /*
        \t tab
        \b konuldugu yerden backspace
        \n yeni satıra gecer--alt satıra gecer
        \r satırbası yaptırır
        \' 'ekler
        \" "ekler
        \\ \ekler
         */

        System.out.println("\tHello world");//  Hello world
        System.out.println("Hello \bworld");//Helloworld
        System.out.println("\nHello world");//
                                            //Hello world
        System.out.println("Hello\rHello world");//Hello world
        System.out.println("\"Hello\" world");//"Hello" world
        System.out.println("\\Hello\\ world");//\Hello\ world
        System.out.println("-----------------------------");

        System.out.print("Merhaba\t dostlar\n");
        System.out.print("Hoşgeldiniz\n dostlar");
        System.out.println("\n---------------------");

        //Concatenation
        String str = "hello";
        String str2 = "World";
        String str3 = str+" "+str2;//otomosyon frameworklerde buradaki gibi birçok string manuplation yapacaksınız.
        System.out.println("str3 = " + str3);

        System.out.println(str+100);//hello100

        System.out.println("hello"+"100");

        String str4 = str+100;
        System.out.println("str4 = " + str4);//hello100

        int i = 50;
        String str5 = str+i;//"hello"+50
        System.out.println("str5 = " + str5);

        //--------

        int y = 75;
        System.out.println(str+i+y);//hello5075
        System.out.println(i+y+str);//125hello
        String str6 = i+y+str;
        System.out.println("str6 = " + str6);//125hello

        System.out.println(""+i+y+str);
        int sum = i+y;
        System.out.println(str+sum);

        //empty string vs null string

        String s = "";//empty
        String s1;//null
        s1=null;




    }
}
