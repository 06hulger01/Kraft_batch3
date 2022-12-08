package day_28_Arrays;

import java.util.Arrays;

public class ArraysTasks {

    public static void main(String[] args) {
        int[] arry1 = {10,200,30,4,50,6};
        int[] arry2 = {1,2,3,4,5};

//        System.out.println(  Arrays.toString(  newArrayWithFirstElements(arry1, arry2)  )  );
//        System.out.println(sumOfArrayElement(arry1));
//        System.out.println(sumOfArrayElement(arry1));

//        System.out.println(arrLengthCheck(arry1));
//        System.out.println(arrLengthCheck(arry2));
//        System.out.println(find5InArray(arry1));
//        System.out.println(checkFirstMember(arry1, arry2));
//        System.out.println(Arrays.toString(multAndSum(arry2)));
//        System.out.println(Arrays.toString(concatArray(arry1, arry2)));
//        System.out.println(bigNumOfArr(arry1));
//        System.out.println(Arrays.toString(swapFirstAndlast(arry1)));
//        System.out.println(Arrays.toString(reverseArray(arry2)));
        System.out.println( sumOfArrayElemnts(arry2) );


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
//    Int array in tek sayı indexinde ki elemanlarının toplamını veren bir method yazın.
    public static int sumOfArrayElement(int[] arr){
//      [10,2,30,4,50,6]
        int sum = 0;
        for (int j = 2; j < arr.length; j++) {
            if (j%2==1){
                sum+=arr[j];
            }

        }
        //foreach loop way
//        for (int i : arr){       // for each array ın tek sayı olan elemanlarını toplayabilir.
//            if (i%2==1){
//                sum+=i;
//            }
//        }
        return sum;
    }

//    İnt array ın elemanlarının toplamını ve çarpımını
//    yeni bir array içinde döndüren bir method yazın.

    //day 29 Buradan
    public static int[] multAndSum(int[] arr){
        int[] multAndSumArr = new int[2];
        multAndSumArr[0]=0;
        multAndSumArr[1]=1;
        for (int i = 0; i < arr.length; i++) {
            multAndSumArr[0]+=arr[i];
            multAndSumArr[1]*=arr[i];
        }

        return multAndSumArr;
    }

//    Verilen 2 arrayi birleştirip array döndüren bir method yazın.
    public static int[] concatArray(int[] arry1,int[] arry2){
        int[] newArry = new int[arry1.length + arry2.length];
        for (int i = 0; i < newArry.length; i++) {
            if (i<arry1.length){
                newArry[i]=arry1[i];
            }else{
                newArry[i]=arry2[i-arry1.length];
            }
        }
        return newArry;
    }

//    İnt arry in en büyük elemanını döndüren bir method yazın
    public static int bigNumOfArr(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;

//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (min>arr[i]){
//                min=arr[i];
//            }
//        }
//        return min;
    }

//    Bir array oluşturun ve ilk ve son element leri swap(yer değiştirme) yapın.
    public static int[] swapFirstAndlast(int[] arr){
//        int temp;
        int temp = arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        return arr;
    }
//    Bir method yazın ve verilen arry in elemanlarını
//    tersden sıralayıp yeni bir array döndürsün.
    public static int[] reverseArray(int[] arr){
        int[] ints = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ints[i]=arr[(arr.length-1)-i];
        }
        return ints;
    }

//    Bir methodla verilen array ın teksayı
//    indexinde bulunan elemanların toplamını alın.
    public static int sumOfArrayElemnts(int[] arr){
        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (i%2==1) {
//                sum += arr[i];
//            }
//        }
        for (int i = 1; i < arr.length; i+=2) {

            sum += arr[i];
        }

        return sum;
    }
}
