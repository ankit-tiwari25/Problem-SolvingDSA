package InterviewPrep;

import java.util.ArrayList;
import java.util.*;

/*
 * Leet code 15 : ThreeSum
 */
 class Data{
    public int n1;
    public int n2;
    public int n3;
    public int getN1() {
        return n1;
    }
    public void setN1(int n1) {
        this.n1 = n1;
    }
    public int getN2() {
        return n2;
    }
    public void setN2(int n2) {
        this.n2 = n2;
    }
    public int getN3() {
        return n3;
    }
    public void setN3(int n3) {
        this.n3 = n3;
    }

    public void display(){
        System.out.println(" n1 = " + getN1() + " n2 = " + getN2() + " n3 = " + getN3());
    }

}
public class ThreeSum {
    public static List<Data> list = new ArrayList<>();
    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4, 0, 2};
        threeSum(arr);

        for(Data d : list){
            d.display();
        }
    }
    public static void threeSum (int[] arr){
        int n = arr.length;
        for(int i = 0; i < n -2; i++){
            if( i > 0 && arr[i] == arr[i - 1]){
                continue;
            }

            int n1 = arr[i];
            int target = -n1;
            twoSum(arr, target, i + 1, n-1);
        }
    }
    public static void twoSum(int[] arr, int target, int i, int j){
        while(i < j){

            if(arr[i] + arr[j] > target){
                j--;
            }else if(arr[i] + arr[j] < target){
                i++;
            }else{
                while( i < j && arr[i] == arr[i + 1]){
                    i++;
                }
                while( i < j && arr[j] == arr[j -1]){
                    j--;
                }
                
            }
          
        }
        Data obj = new Data();
        obj.setN1(-target);
        obj.setN2(arr[i]);
        obj.setN3(arr[j]);
        list.add(obj);
    }
}
