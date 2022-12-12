package day_31_Arrays_Lab;

import java.util.Arrays;

public class Arrays_Lab {

    //Arrayin içerisindeki tüm sayıları toplayan
    // bir metot yazınız (for-each metodunu kullanın)
 /*   public static void main(String[] args) {

       /* String [] arr=new String[10];
        System.out.println(arr.length);
        arr[5]="harun";
        System.out.println(Arrays.toString(arr));
        int[] arrayInt=new int[5];
        System.out.println(Arrays.toString(arrayInt));
        boolean[] arrayBoolean=new boolean[5];
        arrayYazdir(arrayInt);


    }
*/

    //Arrayin içerisindeki tüm sayıları toplayan
    // bir metot yazınız (for-each metodunu kullanın)

    public static int arraySum(int[] arr){
        int result=0;
        for(int sayi:arr){
            result=result+sayi;
        }
        return result;

    }
    public static double arraySum(double [] arr){   //5
       double result=0;
        for (int i = 0; i < arr.length; i++) { // 0 1 2 3 4
            result+=arr[i];
        }
        return result;

    }



    //Arrayin içerisindeki tüm sayıları toplayan
    // bir metot yazınız (for-each metodunu kullanın)

   // Array’in içerisindeki en büyük ve en küçük sayıyı bulan ve bu sayıları array içerisinde veren
    // metodu yazınız.
    // (Arrays.sort kullanılmayacak)

    public static int[]  minAndMaxArray(int[] arr){
        int[] result={arr[0],arr[0]};
        for (int param:arr){
            if(param<=result[0]){
                result[0]=param;
            }
            if(param>=result[1]){
                result[1]=param;
            }
        }
        return result;
    }

    public static int[]  minAndMaxArray2(int[] arr){

        int min=arr[0];
        int max=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>=max){
                max=arr[i];
            }
            if(arr[i]<=min){
                min=arr[i];
            }
        }
        int[] result={min,max};
        return result;
    }

    public static int[]  minAndMaxArray3(int[] arr){

      int[] arr2=Arrays.copyOf(arr,arr.length);
//yeni bir array oluşturup orjinal array ile işlem yapmamak daha uygundur.

        Arrays.sort(arr2);    // 5,2,1,4,3      1 2 3 4 5

        int [] arrNew={arr2[0],arr2[arr2.length-1]};
        return arrNew;
    }


   // Array’in içerisindeki tüm 3 sayılarının toplamını veren metodu yazınız.
   public  static  int sumThree(int[] arr){
       int result=0;
       for(int param:arr){
           if(param==3){
               result+=param;
           }
       }
       return result;
   }


    // Array’in içerisindeki tüm çift sayıların toplamını veren metodu yazınız.

  public  static  int sumEven(int[] arr){
        int result=0;
        for(int param:arr){
            if(param%2==0){
                result+=param;
            }
        }
        return result;
  }
    public  static  double sumEven(double[] arr){
       double result=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]%2==0){
                result+=arr[i];
            }
        }
        return result;
    }




    public static void arrayYazdir(String[] arr){

        for (String param: arr) {
            System.out.print(param+" ");
        }
    }

    public static void arrayYazdir(int[] arr){

        for (int param: arr) {
            System.out.print(param+" ");
        }
    }
    public static void arrayYazdir(double[] arr){

        for (double param: arr) {
            System.out.print(param+" ");
        }
    }

    public  static int minArray(int[] arr){
        int min=arr[0];
        for (int param:arr){
            if(param<=min){
                min=param;
            }
        }
        return min;
    }
    public  static int maxArray(int[] arr){
        int max=arr[0];
        for (int param:arr){
            if(param>=max){
                max=param;
            }
        }
        return max;
    }

    //Array’in içerisindeki en küçük sayıyı tüm
    // indekslere atayan bir metod yazınız.(Arrays.sort ve Arrays.fill kullanılmayacak)

public static int[] fillMinNumber(int [] arr){
        int min=minArray(arr);
      int [] newArray=new int[arr.length];
   // int [] newArray=Arrays.copyOf(arr,arr.length);

         for (int i = 0; i <arr.length ; i++) {
        newArray[i]=min;
         }
    return newArray;
}

    public static int[] fillMinNumber2(int [] arr){
        int min=minArray(arr);
        int [] newArray=new int[arr.length];
        // int [] newArray=Arrays.copyOf(arr,arr.length);
        Arrays.fill(newArray,min);

        return newArray;
    }

    //arrayimizi tersten yazdıralım

    public static int[] testCevir(int[] arr){  // 5    0 1 2 3 4 i=4 3 2 1 0  j=0 1 2 3 4
        int[] newArray=new int[arr.length];
        for (int i = arr.length-1,j=0; i >=0 ; i--,j++) {
            newArray[j]=arr[i];
        }
        return newArray;
    }
    //String kelimenin polindrom olup olmadığını kontro edin
    public static boolean ispolinrom(String str){
        String[] arr=str.trim().split("");
        String[] newArray=new  String[arr.length];

        for (int i = arr.length-1,j=0; i >=0;  i--,j++) {
            newArray[j]=arr[i];
        }
    String a="";

        for(String param:newArray){
        a+=param;
        }
        return str.trim().equals(a);
    }

    public static boolean ispolinrom2(String str){
        String[] arr=str.trim().split("");
        String[] newArray=new  String[arr.length];

        for (int i = arr.length-1,j=0; i >=0;  i--,j++) {
            newArray[j]=arr[i];
        }

        return Arrays.equals(arr,newArray);
    }







    //String türünde array içerisinde kaç adet masa geçiyor.
    public  static int findParametreCount(String[] array,String param){
        int count=0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i].equals(param)){
                count++;
            }
        }
        return count;

    }
// içerisinde masa var ise true yok ise false döndüren metodu yazınız?

    public static boolean isContainParametre(String[] array,String param){

        for(String str:array){
            if(str.equals(param)){
                return true;
            }
        }
        return false;


    }


    // içerisinde 2 adet veya daha fazla masa var ise true yok ise false döndüren metodu yazınız?
    public  static boolean isTwoParameters(String [] arr,String param){
        int count=0;
        for (String str:arr){
            if(str.equals(param)){
                count++;
            }
        }
        return count>=2;
    }

    public static void main(String[] args) {
        String [] array={"sandalye","masa","masa","koltuk","abajur"};
        System.out.println(isContainParametre(array, "masa"));
    }







}
