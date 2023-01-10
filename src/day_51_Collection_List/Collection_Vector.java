package day_51_Collection_List;

import java.util.*;

public class Collection_Vector {

    public static void main(String[] args) {
/*
       LinkedList<Integer> linkedList=new LinkedList<>();

       linkedList.add(5);
       linkedList.add(23);
        System.out.println(linkedList.getFirst());
        linkedList.addFirst(3);
        linkedList.contains(3);
        linkedList.offer(15);
        System.out.println(linkedList);
        System.out.println(linkedList.peek());
        System.out.println(linkedList);
*/
        /********  List<Integer> list= Arrays.asList(30,40,50);
        list.add(3);
        System.out.println(list); */


        Vector<Integer> vector=new Vector<>();
        System.out.println(vector.capacity());
        vector.add(5);
        vector.add(10);
        vector.add(9);
        vector.add(34);
        vector.add(25);
      /*
        System.out.println(vector.capacity());
        System.out.println(vector.size());
       List<Integer> list= vector.subList(10,20);
        System.out.println(list);
        System.out.println(vector.firstElement()); */

        vector.set(0,18);
        System.out.println(vector);


    }
}
