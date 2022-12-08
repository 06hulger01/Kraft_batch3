package day_29_ArraysCont;

public class TwoDimensAray {
    public static void main(String[] args) {
        int[][] nums = new int[5][4];

        nums[0][0]=10;
        nums[0][1]=0;
        nums[0][2]=30;
        nums[0][3]=30;

        nums[1][0]=100;
        nums[1][1]=0;
        nums[1][2]=300;
        nums[1][3]=400;

        nums[2][0]=400;
        nums[2][1]=50;
        nums[2][2]=500;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
//                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

//        Ragged

        int[][] numbers = new int[3][];

        numbers[0] = new int[2];
        numbers[1] = new int[3];
        numbers[2] = new int[4];

        numbers[0][0]=10;
        numbers[0][1]=20;

        numbers[1][0]=30;
        numbers[1][1]=40;
        numbers[1][2]=50;

        numbers[2][0]=60;
        numbers[2][1]=70;
        numbers[2][2]=80;
        numbers[2][3]=90;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

//        literal way
        System.out.println();
        int[][] sayılar = {{10,20},{30,40,50,55},{60,70,80,90}};

        for (int i = 0; i < sayılar.length; i++) {
            for (int j = 0; j < sayılar[i].length; j++) {
                System.out.print(sayılar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
