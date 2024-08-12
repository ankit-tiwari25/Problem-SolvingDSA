package Recursion;

import java.util.Stack;

public class SortAStackUsingRecursion {
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
        
        System.out.println("Before Sorting");
        System.out.print(stack);
        sortStack(stack);
        System.out.println();
        System.out.println("After Sorting");
        System.out.println(stack);

    }
    public static void sortStack(Stack<Integer> stack){
        if(stack.size()==1){
            return;
        }

        int topElement = stack.pop();
        sortStack(stack);
        insert(stack, topElement);

    }

    public static void insert(Stack<Integer> stack, int element){
        if(stack.size()==0){
            stack.push(element);
            return;
        }
        int top  = stack.pop();
        if(top < element){
            stack.push(top);
            stack.push(element);
            return;
        }

        insert(stack, element);
        stack.push(top);

    }
}
