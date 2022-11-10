package day_9_operatorsCont;

public class Conditional_logical_Opr {
    public static void main(String[] args){

        boolean bl;

        System.out.println("---&& logical AND.....");
        //&& logical AND
        bl = true && true; //-----true
        System.out.println("bl = " + bl);
        bl = true && false;
        bl = false && true;
        bl = false && false;
        System.out.println("bl = " + bl);

        System.out.println("---|| logical Or.....");
        //|| logical OR
        bl = true || false;
        bl = false || true;
        bl = false || false;//----false
        System.out.println("bl = " + bl);
        bl = true || true;

        System.out.println("---^ bitwise.....");
        //^ bitwise axclusive OR
        //taraflar farklı ise true döndürür.
        bl = true ^ true;//false
        System.out.println("bl = " + bl);
        bl = true ^ false;//----true
        System.out.println("bl = " + bl);
        bl = false ^ true;//----true
        System.out.println("bl = " + bl);
        bl = false ^ false;//false
        System.out.println("bl = " + bl);

        System.out.println("----example 1------");
        //Example 1
        //Aşağıdakilerin aldığı degerleri soyleyiniz
        int a = 5;
        int b = 7;
        bl = true;

        bl = (a>b) && (b==7);//false
        System.out.println("bl = " + bl);
        bl= a/b>0 || (b>a);//true
        System.out.println("bl = " + bl);
        bl = a-b>0 && b>a;//false
        System.out.println("bl = " + bl);

        System.out.println("----example2------");
        //Example 2
        //z nin nihayi değeri nedir.
        boolean x = false, y = false, z = true;
        x = !y;
        z = !x && x==z;//false
        System.out.println("z = " + z);
    }
}
