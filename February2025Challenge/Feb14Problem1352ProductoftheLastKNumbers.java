/*1352.[Medium] Product of the Last K Numbers */

import java.util.ArrayList;

public class Feb14Problem1352ProductoftheLastKNumbers {
    public static void main(String[] args) {
        Feb14Problem1352ProductoftheLastKNumbers obj = new Feb14Problem1352ProductoftheLastKNumbers();
    }
      ArrayList<Integer> list = new ArrayList<>();
    int prod = 1;

    public Feb14Problem1352ProductoftheLastKNumbers() {
        
    }
    
    public void add(int num) {
        if(num == 0){
            list = new ArrayList<>();
            prod = 1;
            return;
        }
        prod = prod * num;
        list.add(prod);  
    }
    
    public int getProduct(int k) {
          if(list.size() < k) return 0;
        int ans = list.get(list.size() - 1);
        if(list.size() == k) return ans;
        return ans / list.get(list.size() - 1 - k);
    }
}
