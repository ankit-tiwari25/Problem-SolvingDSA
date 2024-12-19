package DecemberChallenge;
/* 769. Max Chunks To Make Sorted */
public class December19Problem769MaxChunksToMakeSorted {
   public static void main(String[] args) {
    int[] arr = {4,3,2,1,0};
    System.out.println(maxChunksToSorted(arr));
   } 
   public static int maxChunksToSorted(int[] arr) {
    int n = arr.length;
    int chunks = 0, prefixSum = 0, sortedPrefixSum = 0;

    // Iterate over the array
    for (int i = 0; i < n; i++) {
        // Update prefix sum of `arr`
        prefixSum += arr[i];
        // Update prefix sum of the sorted array
        sortedPrefixSum += i;

        // If the two sums are equal, the two prefixes contain the same elements; a chunk can be formed
        if (prefixSum == sortedPrefixSum) {
            chunks++;
        }
    }
    return chunks;
}
}
