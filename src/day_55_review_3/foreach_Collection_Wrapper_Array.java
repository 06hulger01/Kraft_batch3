package day_55_review_3;

import java.util.*;

public class foreach_Collection_Wrapper_Array {
    public static void main(String[] args) {
//        foreach
//        iterator is fixed
//        there must be a data structure
//        for(data type : data structure){}

        int[] nums = new int[]{2, 5, 8, 10, 9, 11, 15, 1, 6, 7};

        for (int each : nums) {
            System.out.println(" " + each);
        }

        Integer[] numsI = new Integer[nums.length];
//        bir arrayı wrapper versiyonuna convert etmek
        for (int i = 0; i < numsI.length; i++) {
            numsI[i] = Integer.valueOf(nums[i]);
        }
        System.out.println(Arrays.toString(numsI));

//        Collections.sort(Arrays.asList(nums));
        Collections.sort(Arrays.asList(numsI));
//        Collections.reverse(Arrays.asList(numsI));

        System.out.println(Arrays.toString(numsI));

//        sort olmuş wrapper arrayı int arraye convert etme
        int[] nums2 = new int[numsI.length];
        for (int i = 0; i < numsI.length; i++) {
            nums2[i] = numsI[i].intValue();
        }
        System.out.println(Arrays.toString(nums2));

        List<Integer> lst = new ArrayList<>(Arrays.asList(numsI));

        System.out.println(lst);

//        Object[] objects = lst.toArray();
        Integer[] lArray = lst.toArray(new Integer[15]);
        System.out.println(Arrays.toString(lArray));

//        sublist

        List<Integer> lst2 = new ArrayList<>(Arrays.asList(2, 4, 5, 8, 11, 15, 20));
        System.out.println(lst2.subList(1, 4));
        List<Integer> lst3 = lst2.subList(1, 4);
        lst3.set(1, 111);
        System.out.println(lst3);
        System.out.println(lst2);

        lst2.set(1, 110);
        System.out.println(lst3);
        System.out.println(lst2);
//       list2 :  [2, 110, 111, 8, 11, 15, 20]
//        lst2.sort(null);
//        lst2.sort(Comparator.naturalOrder());
//        lst2.sort(Comparator.reverseOrder());

        System.out.println(lst2);

//        iterator

        //       list2 :  [2, 110, 111, 8, 11, 15, 20]
//        for ( Integer each :  lst2 ){
//                if (each<15){
//                    lst2.remove(each);
//                }
//        }

        Iterator<Integer> myIter = lst2.iterator();

        System.out.println(myIter.hasNext());
//        myIter.next();
//        myIter.remove();
//        myIter.next();
//        myIter.remove();

        System.out.println(lst2);// [2, 110, 111, 8, 11, 15, 20]

        while (myIter.hasNext()){
            Integer next = myIter.next();
            if (next<15){
                myIter.remove();
            }
        }
        System.out.println(lst2);

        System.out.println(myIter.hasNext());//false cunku listeyi sona kadar next yaptık

        Iterator<Integer> myIter2 = lst2.iterator();// yeni bir iterasyon olusturdum

        System.out.println(myIter2.hasNext());

//        [110, 111, 15, 20]

        ListIterator<Integer> myLstIter = lst2.listIterator();// has previous avantajı saglıyor

        while (myLstIter.hasNext()){
            Integer next = myLstIter.next();
            if (next>100){
                myLstIter.remove();
            }
        }
        System.out.println("lst2 = " + lst2);// [15, 20]

        System.out.println("myLstIter.hasNext() = " + myLstIter.hasNext());//false
        System.out.println("myLstIter.hasPrevious() = " + myLstIter.hasPrevious());//true

        while (myLstIter.hasPrevious()){
            Integer previous = myLstIter.previous();
            if (previous==15){
                myLstIter.set(20);
            }
        }
        System.out.println("lst2 = " + lst2);//[20, 20]
        System.out.println("myLstIter.hasPrevious() = " + myLstIter.hasPrevious());//false
        System.out.println("myLstIter.hasNext() = " + myLstIter.hasNext());//true

    }


}
