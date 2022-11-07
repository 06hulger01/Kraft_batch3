package day_6_type_casting_aritmetic_operators;

public class TypeCasting {
    public static void main(String[] args){
      /*  byte x=5;  //8 bit
        int y=10;  //32 bit
       // y=x;      //32 bitlik bir alana 8 bit lik bir veriyi genişleme widenning
       x=(byte)y;

      //  System.out.println(x);

        int z=130;
        byte t;
        t=(byte)130;
        System.out.println(t);

        double x=100;
        int y=50;
       // y=(int)x;
        x=y;
        System.out.println(x);


        //byte,short ve int türündeki veriler ile işlem yapıldığında sonuç devamlı int'dir.
        byte x=2;
        byte y=2;
        int z;
        z=x+y;


        short a=5;
        short b=10;
        int c=a+b;
        //int,double,string,float, char
        */

        int a=5,b=10,c=a+b;
        System.out.println(c);

        short d= (short) c;
        System.out.println(d);


    }
}
