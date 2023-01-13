package day_55_review_3;

import java.util.Arrays;

public class Arrays_ {
    public static void main(String[] args) {
        //we can store/hold multiple same type value in single variable
        //fixed size
        //we can reach an element of array by index number

        int i = 5;
        int[] arry = new int[i];// bellekte 5 size lik yer acıldı
        int[] arry2 = {2,7,4,11,20};
        int[] arry3 = new int[]{5,6,8,10,11};

        Integer[] arrI = new Integer[5];//arrayler object tipleride alabilir

        String_Classes[] arrC = new String_Classes[3];//array ın tipi bir class, class ın ornekleride store edilebilir

        System.out.println("arry.length = " + arry.length);

        int[] ints = Arrays.copyOfRange(arry2, 2, arry2.length);//[4, 11, 20]
        System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));

//        multi dimensional arrays

        int[][] nums = new int[2][];

        nums[0] = new int[3];
        nums[1] = new int[2];
        System.out.println(nums.length);

        nums[0][0] = 11;
        nums[0][1] = 12;
        nums[0][2] = 13;
        System.out.println(nums[0].length);

        nums[1][0] = 14;
        nums[1][1] = 15;
        System.out.println(nums[1].length);

        System.out.println(Arrays.deepToString(nums));

        for (int j = 0; j < nums.length; j++) {
            for (int k = 0; k < nums[j].length; k++) {
                System.out.print(" " + nums[j][k]);
            }
        }
        System.out.println("\n------");
//        literal way

        int[][] arrydinal = {{11,12,13},{14,15}};
        System.out.println(Arrays.deepToString(arrydinal));

        for (int j = 0; j < arrydinal.length; j++) {
            for (int k = 0; k < arrydinal[j].length; k++) {
                System.out.print(" " + arrydinal[j][k]);
            }
        }

    }
}
