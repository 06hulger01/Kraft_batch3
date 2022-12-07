package day_28_Arrays;

import java.util.Arrays;

public class ArraysTasks {

    public static void main(String[] args) {
        int[] arry1 = {1,2,3,4,5,6};
        int[] arry2 = {1,2,3,4,5};

//        System.out.println(  Arrays.toString(  newArrayWithFirstElements(arry1, arry2)  )  );
        System.out.println(sumOfArrayElement(arry2));
//        System.out.println(sumOfArrayElement(arry1));

//        System.out.println(arrLengthCheck(arry1));
//        System.out.println(arrLengthCheck(arry2));
//        System.out.println(find5InArray(arry1));
//        System.out.println(checkFirstMember(arry1, arry2));

    }
//    Bir method yazın ve int[] kabul etsin.
//    length i 5 den büyükse true döndürsün.
    public static boolean arrLengthCheck(int[] arry){
        return arry.length>5;
    }
//    Bir method yazın int array kabul etsin,
//    array in içinde 5 olup olmadığını kontrol etsin.
    public static boolean find5InArray(int[] arry){
        int param = 5;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i]==param){
                return true;
            }
        }
        return false;

    }
//    Bir method yazın ve 2 array kabul etsin
//    ilk elemanları eşitse true döndürsün.
    public static boolean checkFirstMember(int[] arry, int arry2[]){
        return arry[0]==arry2[0];
    }
//    2 array kabul eden bir method yazın ve arraylerin
//    ilk elemanları ile yeni bir array döndürsün.
    public static int[] newArrayWithFirstElements(int[] arr1,int[] arr2){
        int[] newArr = new int[2];
        newArr[0]=arr1[0];
        newArr[1]=arr2[0];
        return newArr;
        //second way
//        int[] newArr2 = {arr1[0],arr2[0]};
//        return newArr2;


    }
//    Int array in elemanlarının toplamını veren bir method yazın.
    public static int sumOfArrayElement(int[] arr){

        int sum = 0;
        for (int j = 2; j < arr.length; j++) {
            if (j%2==1){
                sum+=arr[j];
            }

        }
        //foreach loop way
//        for (int i : arr){
//            if (i%2==0){
//                sum+=i;
//            }
//        }
        return sum;
    }

}
