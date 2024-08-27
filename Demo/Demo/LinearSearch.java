package Demo;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int size = sc.nextInt();
        int position = -1;
        
        int arr[] = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter target element");
        int target = sc.nextInt();

        for(int i = 0 ; i < size ; i++){

             if(target == arr[i]){
                position = i + 1;
                break;
            }
        }
        if(position == -1){
            System.out.println(target+" is not present! ans = "+ position);
        }else{
            System.out.println(target+" is present at "+position+" position");
        }
    }
}


