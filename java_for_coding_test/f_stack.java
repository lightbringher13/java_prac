package java_for_coding_test;

import java.util.Stack;

class StackPrac {
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.pop();
        stack.pop();

        stack.peek();

        System.out.println(stack);
    }
}