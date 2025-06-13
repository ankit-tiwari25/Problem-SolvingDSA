package Recursion.Retry;

import java.util.Stack;

/* Sort a stack */
public class SortAStack {
    public static void main(String[] args) {
        int[] arr = {5,2,0,1};
        Stack<Integer> stack = new Stack<>();
        for(int i : arr){
            stack.push(i);
        }
        stack = sortAStack(stack);
        System.out.println(stack);
    }
    public static Stack<Integer> sortAStack(Stack<Integer> stack){
        /* Base Condition */
        if(stack.size() == 1){
            return stack;
        }

        /* Hypothesis */
        int top = stack.pop();
        sortAStack(stack);

        /* Induction */
        stack = insertElementInStack(stack, top);
        return stack;
    }
    public static Stack<Integer> insertElementInStack(Stack<Integer> stack, int element){
        /* Base Condition */
        if(stack.isEmpty() || stack.peek() <= element){
            stack.push(element);
            return stack;
        }

        /* Hypothesis */
        int top = stack.pop();
        insertElementInStack(stack, element);

        /* Induction */
        stack.push(top);
        return stack;
    }
}
