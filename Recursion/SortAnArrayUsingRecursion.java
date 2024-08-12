package Recursion;

import java.util.ArrayList;
import java.util.List;
//Recusrion Sort an Array using recursion by Aditya Verma
public class SortAnArrayUsingRecursion {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(4);
        list.add(2);
        list.add(9);
        list.add(18);
        list.add(3);
        list.add(7);
        list.add(72);
        list.add(417);
        list.add(1);

        System.out.println("Before Sorting : ");
        System.out.println(list);

        sort(list);
        System.out.println("After Sorting : ");
        System.out.println(list);
    }

    public static void sort(List<Integer> list){
        if(list.size() == 1){  // Base Condition
            return;  // Ek akela element apne aap me sorted hai
        }

        int temp = list.get(list.size() - 1);
        list.remove(list.size()-1);
        sort(list); // Hypothesis
        insert(list,temp); // Induction
    }
    public static void insert(List<Integer> list , int element){
        //Base Condition
        if(list.size() == 0 || list.get(list.size()-1) < element){
            list.add(element);
            return;
        }

        int lastElement = list.get(list.size()-1);
        list.remove(list.size()-1);
        insert(list, element);
        list.add(lastElement);
    }
}
