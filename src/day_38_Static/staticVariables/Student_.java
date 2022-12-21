package day_38_Static.staticVariables;

public class Student_ {

//    String name;           //instance variable
    static String name;     //static variable

    public Student_(String name){
        this.name=name;

    }

    void printName(){
        System.out.println("name : "+name);
    }


}
