package day_8_operatorsCont;

public class equal_relationalOpe {
    public static void main(String[] args){
        //all relational operators represent a boolean condition--true or false
        // tüm ilişkisel yada eşitliksel operatorler bir şart durumu yani boolean değeri döndürür.
        // == equals to // eşittir
        // != not equal to // eşit değildir
        // > greater than // buyuktur
        // >= greater than or equal // buyuktur yada eşittir
        // < less than // küçüktür
        // <= less than or equal // küşüktür yada eşittir.

        int x = 10;
        int y = 20;

        boolean bl;
        bl = x==y;//false
        System.out.println("bl = " + bl);
        bl = x!=y;//true
        System.out.println("bl = " + bl);
        bl = x>y;//false
        System.out.println("bl = " + bl);
        bl = x>=y;//false
        System.out.println("bl = " + bl);
        bl = x<y;//true
        System.out.println("bl = " + bl);
        bl = x<=y;//true
        System.out.println("bl = " + bl);

        int z = 20;
        bl = z>=y;
        System.out.println("bl = " + bl);
        bl = z<=y;
        System.out.println("bl = " + bl);
        bl = z!=y;
        System.out.println("bl = " + bl);

    }
}
