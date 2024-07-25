package JulyChallenge;
// 912. [Medium] Sort an Array
public class SortanArray {
    public static void main(String[] args) {
        int[] nums = {5,2,3,1};
        int[] ans = sortArray(nums);

        for(int i : ans){
            System.out.print(i + " ");
        }

    }
    public static int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
       return nums;
   }
     private static void mergeSort(int[] nums, int left, int right) {
       if (left >= right) return;

       int mid = left + (right - left) / 2;

       mergeSort(nums, left, mid);
       mergeSort(nums, mid + 1, right);

       merge(nums, left, mid, right);
   }

   private static void merge(int[] nums, int left, int mid, int right) {
       int n1 = mid - left + 1;
       int n2 = right - mid;

       int[] leftArray = new int[n1];
       int[] rightArray = new int[n2];

       for (int i = 0; i < n1; ++i)
           leftArray[i] = nums[left + i];
       for (int i = 0; i < n2; ++i)
           rightArray[i] = nums[mid + 1 + i];

       int i = 0, j = 0, k = left;

       while (i < n1 && j < n2) {
           if (leftArray[i] <= rightArray[j]) {
               nums[k++] = leftArray[i++];
           } else {
               nums[k++] = rightArray[j++];
           }
       }

       while (i < n1) {
           nums[k++] = leftArray[i++];
       }

       while (j < n2) {
           nums[k++] = rightArray[j++];
       }
   }
}
