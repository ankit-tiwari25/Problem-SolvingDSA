package JuneChallenge;
// 633. [Medium] Sum of Square Numbers
// 17th June 2024
// Two pointer approach
public class SumofSquareNumbers {
    public static void main(String[] args) {
        int c = 13;
        System.out.println(judgeSquareSum(c));
    }  
    public static boolean judgeSquareSum(int c) {

        if(c < 0){
            return false;
        }
        long r = (int)Math.sqrt(c);
        long l = 0;

        while(l <= r){
            long sum =  l * l + r*r;
            if(sum == c){
                return true;
            }else if(sum < c){
                l++;
            }else{
                r--;
            }
            
        }

        return false;
    }
}
