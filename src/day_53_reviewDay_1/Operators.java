package day_53_reviewDay_1;

public class Operators {
    public static void main(String[] args) {
        //Arithmetic operators
        //* / + -
        int i = 5+3/2+2-1;//7
        System.out.println(i);
        i=5+3*2+2-1;//12
        System.out.println(i);
        i=5+(int)3.1+2-1;//9
        System.out.println(i);
        System.out.println("------");
        i=(int)(3.4+6.6);//10
        System.out.println(i);
        i=(int)3.4+(int)6.6;//9
        System.out.println(i);

        i=(int)4.5+5/2;//6
        System.out.println(i);
        i=(int)(4.5+5/2);//6
        System.out.println(i);
        i=(int)(4.5+(double)5/2);//7
        System.out.println(i);
        i=(int)(4.5+(double)(5/2));//6
        System.out.println(i);

        //unary operators
        //+ - ++ --
        int value = 0;
        value++;//postfix increment
        System.out.println("value = " + value);
        ++value;//prefix increment
        System.out.println("value = " + value);


        int value2 = 5;
        value2--;//postfix decrement
        System.out.println("value = " + value2);//4
        --value2;//prefix decrement
        System.out.println("value = " + value2);//3

        int n =10;
//          10  +  10 -   9 + 9
        n = n++ + --n - --n + n++;//20
        System.out.println("n = " + n);
//          20                0
//                    -1    /  22
//         20  - 21   /  21     22
        n= n++ - n++ / --n / ++n;//20
        System.out.println("n = " + n);

        //assignment operators
        //the equality and relational operators
        //the conditional/logical operators

    }
}
