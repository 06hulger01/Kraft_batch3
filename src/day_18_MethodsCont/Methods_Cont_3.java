package day_18_MethodsCont;

public class Methods_Cont_3 {

    public static void main(String[] args) {
        //sum methodu çağrıları
        sum();//konsolda bir sonuc veremez
        System.out.println(sum());
        int i = sum();
        System.out.println("i = " + i);
        System.out.println(sum() + 10);

        //sum 2 methodu çağrıları
        System.out.println("sum2 = "+sum2(5, 10));

        System.out.println(sum2(5, 20) + sum());//30
        System.out.println("---------");

        System.out.println(    sum2(sum(),5)                );

        int x = sum2(sum(),5);
        System.out.println("x = " + x);
    }
    //return type methods

    public static int sum(){
        return 5;
    }

    public static  int sum2(int a,int b){
        int i = a+b;
        return i;
//        return a+b;
    }
}
