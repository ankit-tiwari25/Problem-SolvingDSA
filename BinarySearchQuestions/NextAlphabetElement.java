package BinarySearchQuestions;
/*
 *  Que : Array of characters given hai along with an element X.
 *  Find next character of X even if X is present in the array.
 *  Eg : arr[] = {a , c, d, f, g, h, k} X = g
 *    O/p : h
 */
public class NextAlphabetElement {
    public static void main(String[] args) {
        char[] arr = {'a', 'c', 'd', 'f', 'g', 'h', 'k'};
        char X = 'g';
        char res = nextAlphabetElement(arr, X);
         if(res != '#'){
            System.out.println(res);
         }else{
            System.out.println("Element greater than "+ X + " is not present!");
         }
    }
    public static char nextAlphabetElement(char[] arr, char X){
        char res = '#';
        int st = 0;
        int end = arr.length - 1;

        while(st <= end){
            int mid = st + (end - st) / 2;
            if(arr[mid] == X){
                // continue to search on right side
                st = mid + 1;
            }else if(arr[mid] < X){
                // continue to search on right side
                st = mid + 1;
            }else{
                // might be a possible ans, but continue to move left side
                res = arr[mid];
                end = mid - 1;
            }
        }
        return res;
    }
}
