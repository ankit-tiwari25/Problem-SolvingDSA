package Recursion;

import java.util.Stack;
// Reverse a stack using recursion
public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(14);
        stack.push(16);
        stack.push(2);
        stack.push(10);
        stack.push(97);
        stack.push(413);
        stack.push(2);
        stack.push(89);   

        System.out.println("Before Reverse");
        System.out.print(stack);
        System.out.println();
        reverseStack(stack);
        System.out.println("After Reverse");
        System.out.println(); 
        System.out.println(stack);      
    }

    public static void reverseStack(Stack<Integer> stack){
        if(stack.size() == 1){
            return;
        }

        int topElement = stack.pop();
        reverseStack(stack);
        insert(stack, topElement);

    }

    public static void insert(Stack<Integer> stack, int element){
        //Base condition
        if(stack.size() == 0){
            stack.push(element);
            return;
        }

        int top = stack.pop();
        insert(stack, element);
        stack.push(top);
    }
}
