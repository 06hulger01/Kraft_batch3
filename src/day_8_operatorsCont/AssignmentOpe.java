package day_8_operatorsCont;

public class AssignmentOpe {
    public static void main(String[] args) {
        //Assignment (atama) oerators

        int x = 10;
        int y = 20;

        x = x+y;
        System.out.println("x = " + x);//30
        x+=y;
        System.out.println("x = " + x);//50

        x = x/y;
        System.out.println("x = " + x);//2
        x/=y;
        System.out.println("x = " + x);//0

        x=10;
        y=20;

        x = x%y;
        System.out.println("x = " + x);//10

        y%=x; //y=y%x;
        System.out.println("y = " + y);

        x=y;
        System.out.println("x = " + x);

    }
}
