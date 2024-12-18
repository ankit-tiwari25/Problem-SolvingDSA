package DecemberChallenge;

import java.util.Stack;
/*
 *  1475. [Easy] Final Prices With a Special Discount in a Shop
 */
public class December18Problem1475FinalPricesWithASpecialDiscountInAShop{
    public static void main(String[] args) {
        int[] prices = {8,4,6,2,3};
        int[] arr = finalPrices(prices);
        display(arr);
    }
    public static int[] finalPrices(int[] prices) {
      // Create a copy of prices array to store discounted prices
        int[] result = prices.clone();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            // Process items that can be discounted by current price
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                // Apply discount to previous item using current price
                result[stack.pop()] -= prices[i];
            }
            // Add current index to stack
            stack.add(i);
        }

        return result;  
    }

    public static void display(int[] arr){
        for(int i : arr){
            System.out.print(" " + i);
        }
        System.out.println();
    }
}
