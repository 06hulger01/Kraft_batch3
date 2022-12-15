package day_34_ArrayList;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {

//        remove()
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(100);
        nums.add(101);
        nums.add(190);
        nums.add(5);
        nums.add(55);

        System.out.println("nums = " + nums);

        nums.remove(1);
        System.out.println("nums = " + nums);

//        ArrayList<Integer> nums1 = nums;
       ArrayList<Integer> nums1 = new ArrayList<>(nums);
        System.out.println("nums1 = " + nums1);
        System.out.println("nums.equals(nums1) = " + nums.equals(nums1));
        System.out.println( nums == nums1);

//        task  verilen sayı listesinin ilk ve son elemanları dısındakileri cıkarın
        while (nums1.size()>2){
            nums1.remove(1);
        }

        System.out.println("nums1 = " + nums1);
        System.out.println("nums = " + nums);


        nums.add(60);
        nums.add(200);
        System.out.println("nums = " + nums);
//        [10, 101, 190, 5, 55, 60, 200]

        Integer I = 5;
        int i = 5;

        nums.remove(I);
        System.out.println("nums = " + nums);//[10, 101, 190, 55, 60, 200]

        nums.remove(i);
        System.out.println("nums = " + nums);//[10, 101, 190, 55, 60]

        nums.remove(new Integer(10));
        System.out.println("nums = " + nums);//[101, 190, 55, 60]

        nums.remove(Integer.valueOf(55));
        System.out.println("nums = " + nums);//[101, 190, 60]

        nums.remove(Integer.parseInt("1"));
        System.out.println("nums = " + nums);//[101, 60]


    }
}
