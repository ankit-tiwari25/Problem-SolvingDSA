package InterviewPrep.LeetCodeEasy;
// 389. Find the Difference
public class FindtheDifference {
    public static void main(String[] args) {
        String s = "abc";
        String t = "abct";

        System.out.println(findDifference(s, t));
    }
    public static char findDifference(String s, String t){
        int[] arr = new int[26];
        char ans = 'a';

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            arr[ch - 'a']++;
        }

        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            arr[ch - 'a']++;
        }

       

        for(char i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                ans = (char)('a' + i);
                break;
            }
        }
        return ans;
    }
}
