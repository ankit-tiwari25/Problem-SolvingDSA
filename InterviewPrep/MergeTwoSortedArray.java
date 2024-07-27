package InterviewPrep;

public class MergeTwoSortedArray {
   public static void main(String[] args) {
    int[] arr1 = {1,5,8,23,56,67};
    int[] arr2 = {2,3,6,7,9,14};

    int [] ans = mergeArray(arr1, arr2);
    display(ans);
   }
   public static int[] mergeArray(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int ans[] = new int[n1 + n2];
        int i = 0; // arr1
        int j = 0; // arr2
        int k = 0; // ans arr

        while(i < n1 && j < n2){
            if(arr1[i] < arr2[j]){
                ans[k] = arr1[i];
                i++;
                k++;
            }else{
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }

        while( i < n1){
            ans[k] = arr1[i];
            i++;
            k++;
        }
        while(j < n2){
            ans[k] = arr2[j];
            k++;
            j++;
        }
        return ans;
   }
   public static void display(int[] ans){
    for(int i : ans){
        System.out.print(i + " ");
    }
   }
}
