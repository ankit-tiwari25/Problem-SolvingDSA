package Recursion;

import java.util.Stack;

public class DeleteMiddleElementFromStack {
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

        System.out.println("Before deletion");
        System.out.println(stack);
        int k = (stack.size()/2) + 1;
        deleteMiddleElement(stack, k);
        System.out.println("After Deletion");
        System.out.println(stack);
    }
    public static void deleteMiddleElement(Stack<Integer> stack, int k){
        if(k == 1){
            stack.pop();
            return;
        }

        int top = stack.pop();
        deleteMiddleElement(stack, k-1);
        stack.push(top);
    }
    
}
