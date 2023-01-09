package day_51_Collection_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection_List_Example_2 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        ArrayList<Integer> arrayList2=new ArrayList<>();
        arrayList2.add(4);

    // arrayList.removeAll(arrayList2);
   // arrayList.retainAll(arrayList2);

        System.out.println(arrayList);

        //Kullanıcıdan alınan 3 adet notun ortalamasını veren metodu yazınız. List

       List<Integer> list= Arrays.asList(30,40,50);
        System.out.println(ortalama(list));


    }

    public static double ortalama(List<Integer> list){
        double result=0;

        for (Integer x:list) {
            result+=x;
        }
        return result/list.size();
    }

}
