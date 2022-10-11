package eylul_28_Collection;

import java.util.Stack;

public class Stack_Example {
    public static void main(String[] args) {

        Stack<Object> stack=new Stack<>();
        stack.add("adem");
        stack.add(12);
        stack.add('A');
        stack.add(true);
        stack.add(5.7);

        System.out.println(stack.size());
        stack.push("safak");
        System.out.println(stack.size());
        System.out.println(stack.peek());






    }
}
