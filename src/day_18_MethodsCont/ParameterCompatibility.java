package day_18_MethodsCont;

public class ParameterCompatibility {

    public static void main(String[] args) {
        // 5            //1
        short sh = 5;   //2
        int i = 5;      //3
        double d = 5;   //4
        int i2 = (int)d;//5

        message(5);   //1
        message(sh);    //2
        message(i);     //3
        message((int)d);//4
        message(i2);    //5
    }

    public static void message(int a){
        System.out.println(a+ " is here");
    }
}
