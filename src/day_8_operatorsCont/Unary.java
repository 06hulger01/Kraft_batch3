package day_8_operatorsCont;

public class Unary {

    public static void main(String[] args){
        //unary operators//tekli
        //+ plus  aritmetik değeri pozitif yapar.
        //- minos  aritmetik değeri negatif yapar.
        //++ increment operator değeri 1 arttırır.
        //-- decrement operator değeri 1 azaltır.
        //! logical not operator boolen dgei tersine çevirir.

        //example
        int x;
//        x++;//variable shold be initialized
        x = 2;
        System.out.println(x++);//2
        System.out.println(x--);//3
        System.out.println("x = " + x);//2

        //prefix and postfix
        //++x---> prefix  x in değerini operratorun uygulandığı yerde değiştirir.
        //  x++---> postfix x in değerini operatorun uygulandığı yerden bir sonraki adımda değiştirir.
        System.out.println("------------------------");
//        Example
        //postfix
        int y = 1;
        y++;//increment uygulandı ancak y in değeri bir sonraki kullanıldığı yerde artıcak.
        System.out.println("y = " + y);//2

        //prefix
        --y;//1
        System.out.println("y = "+ y);//1
        System.out.println("-----------------");
//        Task 1
//        Aşağıdaki işlem akışında value değişkeninin nihayi değeri kaç olur.
        int value = +1;
//            1
        A: value--;//1
//            0
        B: value++;//0
//           1   =    -1
        C: value = -value;
        System.out.println("value = " + value);//-1

        System.out.println("-----------");

//        Task 2
//        Aşağıdaki işlem akışında i değişkeninin A,B,C konumlarında ki değeri ne olur.

        int i = 10;
//            9 +  10 +   9 + 9
        i = --i + ++i + --i + i;//37
        System.out.println("i = " + i);
//          37  + 38  *  -37 *  37
        i = i++ + i-- * -i++ * --i;
        System.out.println("i = " + i);

//        51985 - 51986/51986 * 51986 // 51985
//        -51985 - -51984/ -51984 * -51984 //51985
        i = i++  -   (i++/  --i  *  i++);
        System.out.println(i);//-1
        System.out.println("-------------------");
//        Example
//        logical not
        boolean condition = true;
        System.out.println(!condition);

        int t = 10,k=20;
        boolean bl = !(t>k); // t büyük k değilse durumunda true dondurmek istiyoruz
        System.out.println("bl = " + bl);//true

        boolean bln = !(t<k);
        System.out.println("bln = " + bln);//false

//        Task 3
//        aşağıdaki ifadenin true dönmesi için nereye ogical not konmalı
        int n = 11;
        int m =17;
//                      false == false
        boolean cond = (n==m) == !(n<m);//her nereye logical nort koyarsam koyayım ifade true ya doner.
        System.out.println("cond = " + cond);
        System.out.println("----------------");
//        Task 4
//        Aşağıdaki ifadelerden hangisi
//        yada hangileri true döndürür
            n = 11;
            m = 17;
//                        false == 12  > 12
        boolean cond2 = false==(n+1)>(m-5);//true
        System.out.println("cond2 = " + cond2);
//                      true == false
//                      true == 1 > 17/11
        boolean cond3 = cond2 == 1 > (m/n);
        System.out.println("con3 = " + cond3);//false
//                     false ==false
        boolean con4 = cond3==!cond;
        System.out.println("con4 = " + con4);//true


    }

}
