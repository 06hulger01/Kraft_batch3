package day_55_reviewDay_3;

public class MethodAndConstructor {

    public static void main(String[] args) {
        //method : code fragment which can perform task

        //Access modifier/static/ return type/ name(parameter){implementation/code}

//        method overloading
        //same method name different parameter in same class
        //return type no effect method overloading
        message("s");
        message(5);
        message(5.0);
        message(5,"s");

//        Test_ newTest_ = new Test_();
        Test_ newTest_2 = new Test_(5);

    }
    public static void message(){}
    public static void message(int i){}
    public static void message(double d){}
    public static void message(String s){}
    public static void message(int i,String s){}
    public static void message(double d, String s){}
    public static void message(int i,double d, String s){}


//    constructor
//    special method
//    used for creating object
//    constructor mus be same name class name
//    doesnt have any return type
//    ifwe dont put any constructor, always there is a default constructor as implicit
//    if we put a parametrized, there is no default constructor.
}
class Test_{

    int i = 10;
//    public Test_(){};

    public Test_(int i) {
        this.i = i;
    }


//    method overloading vs overriding
    /*
    aynı class içinde olur                  child class içinde olur
    parametre farklı olmalı                 parametre aynı olmalı
    donus turu etkilemiyor                  donus turu accesible olmalı
    compile polymorhphism time example      runtime polymorhphism example

    **bu ikisi methodlarla alakalı olmasına ragmen tamamen farklı konulardır
    **interview perspektifi acısından bilmemiz gerekiyor
     */

}
