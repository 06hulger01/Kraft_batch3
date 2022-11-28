package day_21_Methods_Summary_And_Class_Object;

public class Methods_Summary {


  /*  public static void main(String[] args) {
        //f(5)-->15
        System.out.println(m(5));

    }
    // f(x)=2x+5

    public static int f(int x){

       return 2*x+5;
    }

    public static int m(int x){

        return f(x)+25;
    }



    public static void main(String[] args) {

        System.out.println(daireCevre(5));
    }


    public static double daireCevre(int r){
        return 2*Math.PI*r;
    }
*/


  //kullanıcıdan bir sayı alan ve bu sayının faktoriyelini
    // döndüren bir metot yazınız

    //6!=6*5*4*3*2*1
/*
    public  static double faktoriyel(int a){
      double result=1;
        for (int i=2; i<=a; i++){
            result=result*i;
        }
      return result;
    }



    //Math.pow(3,2)   3 taban 2 üs  metodunu biz yazalım


    public static double mathPow(int taban,int us){
        double result=1;
        if(us==0) return result;
        for (int i=0; i<us; i++){
            result=result * taban;
        }

        return result;
    }



    //kullanıcıdan aldığınız bir sayının kaç basamaklı olduğunu bulan metodu yazınız..


    public static int basamakSayisi(int x){
        //123/10  12
        //12/10   1
        //1/10    0

        int sayac=0;

        while(x>0){
            x=x/10;
            sayac++;

        }
        return sayac;
    }

*/

    // kullanıcının girdiği sayının mükemmel bir sayı olup olmadığını döndüren metodu yazınız
    // 6   6,   3,2,1   true
    //18   18   ,9,6,3,2,1  false
    //kendisi hariç bölenlerinin toplamı kendisine eşit olan sayı
/*
    public static boolean isPerfect(int x){

 int result=0;
        for (int i = 1; i <x ; i++) {
            if(x%i==0){
                result+=i; //result=result+i;
            }
        }

      return x==result;

    }
*/
/*
    //verilen iki sayının ebob ini döndüren metodu yazınız?
    //
    public static int ebob(int x,int y){
        int z=Math.min(x,y);
        int ebob=1;
        for (int i = 1; i <=z ; i++) {
            if(x%i==0&&y%i==0){
                ebob=i;
            }
        }
        return ebob;

    }

    public static int ebob2(int x,int y){
        int z=Math.min(x,y);

        for (int i = z; i >0 ; i--) {
            if(x%i==0&&y%i==0){
                return i;
            }
        }
        return 1;

    }

*/
    //ekok metodunu ebopb metodu kullanmadan yapalım

    public static int ekok(int x,int y){
        int result=1;
        int i=2;
        while (x>1||y>1){
            if(x%i==0||y%i==0){
                result=result*i;
            }
            if(x%i==0){
                x=x/i;
            }
            if(y%i==0){
                y=y/i;
            }
            if(x%i==0||y%i==0){
               continue;
            }else{
                i++;
            }

        }
        return result;

    }

 //kullanıcının girdiği bir sayının binary olup olmadığını döndüren bir metod yazın
 // 1011100  true   10112011 false



    public static void main(String[] args) {

        System.out.println(ekok(18, 30));


    }


}
