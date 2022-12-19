package day_36_Class_Object_Constructor;

public class Math2 {


    public  static int pow(int taban,int kuvvet){
        int result=1;
        if(kuvvet==0){
            return  result;
        }
        for (int i = 1; i <=kuvvet ; i++) {
            result*=taban;
        }
        return result;
    }

    public static int max(int x,int y){
        if (x>=y){return x;}
        return y;
    }

    public static int abs(int x){
        if(x<0) return -1*x;
        return x;

    }


}
