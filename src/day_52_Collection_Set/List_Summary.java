package day_52_Collection_Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List_Summary {

    public static void main(String[] args) {

        Integer[] array={1,4,5,2,9,11,3};
        List<Integer> list=new ArrayList<>(Arrays.asList(array));
        //list=Arrays.asList(array);  kullanmamaya çalışın
        list.add(5);
       // System.out.println(list);
        Collections.sort(list);
       // System.out.println(list);
        List<Integer> list2=Arrays.asList(1,2,3);
        list.removeAll(list2);
        System.out.println(list);
        list.addAll(list2);
        System.out.println(list);

    }


}
