package day_49_ExceptionAndCollection;

import java.util.*;

public class CollectionIntro {

    public static void main(String[] args) {
//        ArrayList<Integer> col = new ArrayList<>();
//        List<Integer> col = new ArrayList<>();//polymorphic way

        Collection<Integer> col = new ArrayList<>();////polymorphic way

        col.add(5);col.add(5);
        col.add(15);col.add(50);col.add(100);

//        getting size
        System.out.println(col.size());
        System.out.println(col);

//        remove item
        System.out.println(col.remove(5));
        System.out.println(col.remove(500));//false nesneyi collectionda ulamadığı için
        System.out.println(col);

//        contains [5, 15, 50, 100]
        System.out.println(col.contains(5));//true

//        containsAll
        System.out.println(col.containsAll(Arrays.asList(5, 100)));//true
        System.out.println(col.containsAll(Arrays.asList(5, 1000)));//false

//        checking is empty
        System.out.println(col.isEmpty());//false

//        removeAll[5, 15, 50, 100]
//        col.removeAll(col);
        col.removeAll(Arrays.asList(15,50));
        System.out.println(col);

//          addAll
        col.addAll(Arrays.asList(20,40,60));
        System.out.println(col);//[5, 100, 20, 40, 60]


//*/
    }
}
