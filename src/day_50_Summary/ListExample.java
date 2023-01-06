package day_50_Summary;

import java.util.*;


public class ListExample {


    public static void main(String[] args) {
        int[] arr=new int[5];
/*
        List<Integer> list=new ArrayList<>();
       list.add(5);
       list.add(10);
        list.add(10);
        list.add(10);

        System.out.println(list);
       Set<Integer> set=new HashSet<>();
        set.add(5);
        set.add(10);
        set.add(10);
        set.add(10);
        System.out.println(set);

        List<Object> list2=new ArrayList<>();
        list2.add("harun"); //String
        list2.add(false);   //Boolean
        list2.add(44);       //Integer    int değil



*/


        List<String> list=new ArrayList<>();
        list.add("harun");
        list.add("Şeyma");
        System.out.println(list.remove("harun"));


    }
}
