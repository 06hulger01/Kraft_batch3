package day_29_ArraysCont;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArraysMethods {
    public static void main(String[] args) {
//        split()
        String str = "Merhaba java insaları";

        String[] sArr = str.split(" ");

        System.out.println(Arrays.toString(sArr));

        System.out.println(sArr[1]);
        System.out.println("-----------");
        for (  String st : sArr   ){
            System.out.println(st);
        }

//        copyOfRange()
        System.out.println("-------copyOfRange");


        String[] str2 = {"yunus","ahmet","Büşra","Nur","Emre","Emre"};
        String[] strings = Arrays.copyOfRange(str2, 1, 4);
        System.out.println(Arrays.toString(strings));

//        sort()
        System.out.println("-------sort");

        Random rd = new Random();
        int[] nums = new int[10];
        for (int i = 0; i <nums.length ; i++) {
            nums[i] = rd.nextInt(100);
        }
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        int max = nums[nums.length-1];
        int min = nums[0];

        System.out.println("min = "+min+ " max = "+max);

//      fill()
        System.out.println("-------fill");
        int[] ints = new int[5];
        ints[0]=8;
        ints[1]=18;
        ints[2]=80;
        ints[3]=28;
        ints[4]=800;
        System.out.println(Arrays.toString(ints));

        Arrays.fill(ints,10);
        System.out.println(Arrays.toString(ints));

        Arrays.fill(ints,1,4,20);
        System.out.println(Arrays.toString(ints));

    }
}
