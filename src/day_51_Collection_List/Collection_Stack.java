package day_51_Collection_List;

import java.util.Iterator;
import java.util.Stack;

public class Collection_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.add(3);
        stack.add(5);
        stack.add(10);
        stack.add(12);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.push(77);
        stack.pop();
        System.out.println(stack);
        Stack<String> stack2=new Stack<>();

        Iterator iter=stack2.iterator();
        while (iter.hasNext()){
         iter.next();
        }

    }


}
