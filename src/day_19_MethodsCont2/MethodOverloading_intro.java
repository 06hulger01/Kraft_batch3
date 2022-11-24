package day_19_MethodsCont2;

public class MethodOverloading_intro {


    public static void main(String[] args) {
        /*sum1(5);
        sum2(5,10);
        sum3(5,10,15);*/
//        sum(5);
        sum(5,10);
        sum(5,10,15);
        sum(5.0);
        sum('a',"abc",5);
        sum(5);
        sum((short) 5);

    }
    /* KÖTÜ UYGULAMA METHOD OVERLOADİNG UYGULANMAMIŞ
    public static void sum1(int a){
        System.out.println(a+10);
    }
    public static void sum2(int a , int b){
        System.out.println(a + b+10);
    }
    public static void sum3(int a, int b, int c){
        System.out.println(a+b+c+10);
    }
    */

    public static void sum(double a){}
    public static void sum(short a){}
    public static void sum(int a){
        System.out.println(a+10);
    }
    public static void sum(int a , int b){
        System.out.println(a + b+10);
    }
    public static void sum(int a, int b, int c){
        System.out.println(a+b+c+10);
    }
    public static void sum(){}
    public static void sum(int a, double b){}
    public static void sum(double a, int b){}
    public static void sum(String s){}
    public static void sum(char c, String s){}
    public static void sum(char c, String s,int a){}
}
