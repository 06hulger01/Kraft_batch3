package day_35_review;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListtasks {
    public static void main(String[] args) {
//Birinci arrayList e elma, armut, kayısı, üzüm, erik;
//İkinci arrayListe e armut, kayısı, üzüm değerlerini atayalım ve
//İlk arrayList in içinden ikinci arrayList i çıkartalım.

        ArrayList<String> fruitsInBasket = new ArrayList<>();
        fruitsInBasket.add("elma");
        fruitsInBasket.add("armut");
        fruitsInBasket.add("kayısı");
        fruitsInBasket.add("üzüm");
        fruitsInBasket.add("erik");

        ArrayList<String> fruitsInPlate = new ArrayList<>();

        fruitsInPlate.add("armut");
        fruitsInPlate.add("kayısı");
        fruitsInPlate.add("üzüm");

        fruitsInBasket.removeAll(fruitsInPlate);
        System.out.println(fruitsInBasket);

        ArrayList<Integer> listOfNums = new ArrayList<>();
        listOfNums.add(5);
        listOfNums.add(10);
        listOfNums.add(15);
        listOfNums.add(15);
        listOfNums.add(20);
        listOfNums.add(25);
        listOfNums.add(25);
        listOfNums.add(100);
        listOfNums.add(100);
        listOfNums.add(500);

        printListNumbers(listOfNums);
        System.out.println("\n" + sum(listOfNums));
        System.out.println("squared(listOfNums) = " + squared(listOfNums));

        System.out.println("dublicate(listOfNums) = "
                + duplicate(listOfNums));//uste ki squared() methodu list yeni değerler almasına sebep oldu dikkat edin!

        System.out.println("random(20) = " + random(20));

    }

//    5,10,15,15,20,25,25,100,100,500 rakamlarını listOfNums isili
//      bir ArrayListe atın ve
//      printListNumbers(listOfNums); methodu ile yazdıralım.

    public static void printListNumbers(ArrayList<Integer> nums) {
//        System.out.println(nums);
        for (Integer I : nums) {
            System.out.print(I + " ");
        }
    }

    //    sum(listOfNums); methodu ile de toplam değeri döndürelim.
    public static int sum(ArrayList<Integer> nums) {
        int sum = 0;
        for (Integer I : nums) {
            sum += I;
        }
        return sum;
    }

    //    duplicate(listOfNums); methodu ile de değerleri dublicate
//edip list i döndürelim.
    public static ArrayList<Integer> duplicate(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            nums.set(i, nums.get(i) * 2);
        }
        return nums;

    }

//    squared(listOfNums); methodu ile de değerleri kendi ile
//çarpıp list i döndürün.

    public static ArrayList<Integer> squared(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
//            nums.set(i,(int)Math.pow(nums.get(i),2));
            nums.set(i, (nums.get(i) * nums.get(i)));
        }
        return nums;
    }

    //    ArrayList<Integer> myList = getList(20);//return method
//System.out.println(myList);
//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
    public static ArrayList<Integer> getList(int i) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 1; j <= i; j++) {
            list.add(j);
        }
        return list;
    }

    //    random(20); bir method oluşturup 20 size li 20 ye kadar random
//rakamlardan oluşan bir ArrayList döndüren method oluşturalım.
    public static ArrayList<Integer> random(int pram) {
        Random rm = new Random();
        ArrayList<Integer> rnNums = new ArrayList<>();
        for (int j = 0; j < pram; j++) {
            rnNums.add(rm.nextInt(pram + 1));
        }
        return rnNums;
    }
}
