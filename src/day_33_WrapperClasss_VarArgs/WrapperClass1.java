package day_33_WrapperClasss_VarArgs;

public class WrapperClass1 {
    public static void main(String[] args) {

        Byte b1 = new Byte((byte)125);
        Byte b2 = new Byte("125");

        Short s1 = new Short((short)1000);
        Short s2 = new Short("1000");

        Integer i1 = new Integer(100000);
        Integer i2 = new Integer("100000");

        Long l1 = new Long(10000000);
        Long l2 = new Long("10000000");

        Double d1 = new Double(4.5);
        Double d2 = new Double("4.5");

        Boolean bl1 = new Boolean(true);
        Boolean bl2 = new Boolean("true");

        Character c = new Character('a');


        Integer i = new Integer(10);
        int in = 10;

        boolean bln =    i==in;
        System.out.println("bln = " + bln);

        System.out.println("i.equals(in) = " + i.equals(in));


        i = in; //outoboxing
        in = i; //unboxing

        int number = i+in;//unboxing
        Integer num = i+in;//outoboxing
        System.out.println("number = " + number);
        System.out.println("num = " + num);

        int x = 10;
        Integer y = x;//Auto boxed

        Integer n = new Integer(5);
        int t = n;//unboxed

        double dbl = 5.5;
        Double dbl2 = new Double(dbl);

//        valuOf()

        Integer integer = Integer.valueOf("10");
        Integer integer2 = Integer.valueOf(10);

        System.out.println("Integer.valueOf(10).equals(10) = " + Integer.valueOf(10).equals(10));
        //valuOf methodu string yada primitive tipi object tipe konvert eder. dolayısıyla bir değişkene atamadan
        // dat(.) operatoru ile wrapper class dan methodları çağırabildıgımızi gorebilriz.
        //**bir primitive tipe atanabilmesi unboxing olması demektir. **
        int type = Integer.valueOf(10);//unboxing


        Double Doub = Double.valueOf("10");
        Double Doub2 = Double.valueOf(10);
        Boolean aTrue = Boolean.valueOf("true");
        Boolean aBoolean = Boolean.valueOf(true);

//        Integer integer1 = Integer.valueOf("");//NumberFormatException
//        Integer integer3 = Integer.valueOf("10b");//NumberFormatException
//        Integer integer4 = Integer.valueOf("ten");//NumberFormatException

        System.out.println("integer1 = " + integer);

//        parse

        int i3 = Integer.parseInt("101");

        int i4 = Integer.parseInt("-101");
        int i5 = Integer.parseInt("+101");
        System.out.println("i3 = " + i4);

//        int i6 = Integer.parseInt("101+");//NumberFormatException
//        int i7 = Integer.parseInt("101-");//NumberFormatException
//        int i8 = Integer.parseInt("101c");//NumberFormatException

//      typeValue    xxxValue

        Integer I = 10;
        int in1 = I.intValue();

        Double dl = 10.0;
        double v = dl.doubleValue();



    }
}
