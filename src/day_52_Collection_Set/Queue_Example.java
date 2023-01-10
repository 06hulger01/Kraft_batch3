package day_52_Collection_Set;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Example {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.offer("Harun");
        queue.offer("Ozlem");
        queue.offer("Emre");
        queue.add("Cengiz");
       System.out.println(queue.peek());
       // System.out.println(queue);
       // System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.element());
        System.out.println(queue);
    }
}
