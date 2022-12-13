package day_32_Arrays_Lab_Cont;

import day_31_Arrays_Lab.Arrays_Lab;

import java.util.Arrays;

public class Arrays_Lab_Cont {


    //2 adet integer sayı alan ve arasındaki sayıları indekslere atayan metodu yazınız.

    public static int[] newArrayCreate(int x,int y){ // 5 8   3   5 6 7 8
        //int[] newArray=new int[(int)(Math.max(x,y)-Math.min(x,y))+1];
        int[] newArray=new int[Math.abs((x-y))+1];
        if(x>=y){
            for (int i = 0,j=y; i <newArray.length ; i++,j++) {
                newArray[i]=j;
            }
        }else{
            for (int i = 0,j=x; i < newArray.length ; i++,j++) {
                newArray[i]=j;
            }
        }
       return newArray;
    }

//2 boyutlu bir array içerisinden int sayıların
// arasındaki sayılarıda dahil ederek yeni bir array oluşturan metodu yazınız
    // [5,8]    [5,6,7,8]

public static int[] newArrayCreate(int[] arr){  // 5  8    5 , 6 ,7, 8
        if(arr.length!=2){
            return arr;
        }
       int[] arr2=Arrays.copyOf(arr,2);
        Arrays.sort(arr2);              // -5    -  +5=10+1=11
        int[] newArray=new int[Math.abs((arr2[1]-arr2[0]))+1];
   int min=arr2[0];
    for (int i = 0,j=arr2[0]; i <newArray.length ; i++,j++) {
        newArray[i]=min;   // newArray[i]=j;
        min++;

    }

     return newArray;

}


//2 adet array kabul eden ve sonucunda bu 2
// array’in verileri ile birlikte tersden sıralı tek bir array oluşturan metodu yazınız.
// [1,5,4]  [3,2,6]    çıktı: [6,5,4,3,2,1]

    public static int[] twoInOne(int[] arr1,int[] arr2){
        int[] newArray=Arrays.copyOf(concatArrays(arr1,arr2),arr1.length+arr2.length);
        return reverseArray(sortArray(newArray));
    }

    public static int[] concatArrays(int[] arr1,int[] arr2){
        int[] newArray=new int[arr1.length+arr2.length];

        for (int i = 0,j=0; i < newArray.length ; i++) {
            if(i<arr1.length){
                newArray[i]=arr1[i];
            }else {
                newArray[i]=arr2[j];
                j++;
            }
        }
        return newArray;
    }
    public static int[] sortArray(int[] arr){
        int[] newArray=Arrays.copyOf(arr,arr.length);
         Arrays.sort(newArray);
         return newArray;
    }

    public static int[] reverseArray(int[] arr){
        int [] newArray=new int[arr.length];
        for (int i = arr.length-1,j=0; i>=0 ; i--,j++) {
            newArray[j]=arr[i];
        }
        return newArray;

    }


    public static int[] twoInOne3(int[] arr1, int[] arr2) {  //metodsuz çözüm
        int[] newArray = new int[arr1.length + arr2.length];
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if(i>=arr1.length){
                newArray[i]=arr2[j];
                j++;
            }else{
                newArray[i] = arr1[i];
            }
        }
        Arrays.sort(newArray);
        int[] newArray2 = new int[newArray.length];
        for (int i = newArray.length-1, j=0; i >= 0; i--, j++) {
            newArray2[j]= newArray[i];
        }
        return newArray2;
    }

    public static void main(String[] args) {

        int[] arr={1,5,4};
        int[] arr2={2,7,16,6};
        Arrays_Lab.arrayYazdir(twoInOne(arr,arr2));


      //  System.out.println(Arrays.toString(arr));
    }


}
