public class BinarySearchSimple {
   public static void main(String[] args) {
    int arr[] = { 1, 4, 5, 8, 14, 18, 25, 29};
    int key = 5;
    System.out.println(findIndex(arr, key));
   } 

   public static int findIndex(int[] arr, int key){
    int st = 0;
    int end = arr.length -1;
    int ans = -1;
    
    while(st <= end){
        int mid = st + (end - st)/2;
        if(key == arr[mid]){
            ans = mid;
            break;
        }else if(key < arr[mid]){
            end = mid - 1;
        }else{
            st = mid + 1;
        }
    }
    return ans;
   }
}
