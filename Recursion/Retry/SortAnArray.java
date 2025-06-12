package Recursion.Retry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Sort an array using recursion */
/*  arr[] = {2,3,7,6,5,4}
 *  o/p = {2,3,4,5,6,7}
 */
public class SortAnArray {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2,3,7,6,4,5);
         ArrayList<Integer> list = new ArrayList<>(arr);
        System.out.println(sortAnArray(list));
    }

    public static List<Integer> sortAnArray(List<Integer> arr){
        /* Base Condition */
        if(arr.size() == 1){
            return arr;
        }

        /* Hypothesis with smaller input */
        Integer lastElement = arr.remove(arr.size()-1);
        arr = sortAnArray(arr);
        /* Induction */
        arr = insert(arr, lastElement);
        return arr;
    }

    public static List<Integer> insert(List<Integer> arr, int ele){
        /* Base Condition */
        if(arr.size() == 0 || arr.get(arr.size()-1) <= ele){
            arr.add(ele);
            return arr;
        }

        /* Hypothesis with smaller input */
        Integer temp = arr.remove(arr.size()-1);
        arr = insert(arr, ele);

        /* Induction */
        arr.add(temp);
        return arr;

    }
}
