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
        int t = 10;
        int j = 20;
        j = t+j;
        System.out.println("j = " + j);
        int m = j+=t;
        System.out.println("j = " + j);

        System.out.println("z = " + m);
        System.out.println( j += t);
        //the equality and relational operators
        //== equals to
        //!= not equas to
        //< less than
        //<= less than equals
        //> greater than
        //>= greater than equals
        //All of above represent boolean condition

        double d = 10;
        if (d==10){}//true
        if (d>=10){}//true
        if (d<=10){}//true
        if (d!=10){}//false
        if (d>10){}//false
        if (d<10){}//false

        //the conditional/logical operators

        int a = 4;
        int b = 7;
        boolean bl;
        // & bitwise AND // her iki tarafıda kontrol ediyor/ check both side
        // && logical AND // doesnt check both side / short circuit // both side should be true to rteturn true
        bl = a<b && a>3;//true && true = true
        System.out.println(bl);
        System.out.println(a<b && a>3);

        // | bitwise OR
        // || logical OR // one side is true, return true
        bl = b-a>0 || b-a%2==0; //true
        System.out.println("bl = " + bl);

        // ^ bitwise exclusive OR // if both sides are same it return false
        bl = b+a>10 ^ b*a>25; //true ^ true = false
        System.out.println("bl = " + bl);
        bl = b+a<10 ^b*a<25; //false ^ false = false
        System.out.println("bl = " + bl);
        bl = b+a>10 ^ b*a<25;//true ^ false = true
        System.out.println("bl = " + bl);

        boolean x = true, y = true, z = false;
        x = !y;

        System.out.println(z = !x && x == z);//true
        System.out.println(z = x && x == z);//false

        //ternary
//        condition ? true :  false
        int r = 100;
        int v = 200;

        int max = v>r ? v : r;
        System.out.println("max = " + max);

        int k = 110;

        int max1 = v>r ? ( v>k ? v : k ):( r>k ? r : k );
        System.out.println("max1 = " + max1);


    }
}
