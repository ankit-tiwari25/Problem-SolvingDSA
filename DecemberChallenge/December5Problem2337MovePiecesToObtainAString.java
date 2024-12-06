package DecemberChallenge;
/* [Interesting Question : Two Pointer]
 * 2337. [Medium] Move Pieces to Obtain a String
 */
public class December5Problem2337MovePiecesToObtainAString {
    public static void main(String[] args) {
        // String start = "_L__R__R_";
        // String target =   "L______RR";

        // String start = "R_L_", target = "__LR";
        // String start = "_R", target = "R_";
        String start = "_L__R__R_L", target = "L______RR_";
        System.out.println(canChange(start, target));

    }
    public static boolean canChange(String start, String target) {
        if(checkStringEquals(start, target) == false){
            return false;
        }
        int n = start.length();
        int i = 0;
        int j = 0;
        int lastIndex = -1;
        
        while(i < n){
            i = skipSpaces(start, i, n);
            j = skipSpaces(target, j, n);
             if(i == n && j == n){
                //Completely traversed, no extra characters left!
                 return true;
             }
            if(start.charAt(i) != target.charAt(j)){
                //Order mismatch
                return false;
            }
            if(start.charAt(i) == 'L' && (j > i || j <= (lastIndex))){
                return false;
            }else if(start.charAt(i) == 'R' && (j < i)){
                return false;
            }
            i++;
            j++;
            lastIndex = j;
        }
        i = skipSpaces(start, i, n);
        j = skipSpaces(target, j, n);

        if(i == n && j == n){
            return true;
        }else{
            return false;
        }
    }
    public static int skipSpaces(String str, int pos, int n){
        while(pos < n && str.charAt(pos) == '_'){
            pos++;
        }
        return pos;
    }
    public static boolean checkStringEquals(String start, String target){
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for(Character ch : start.toCharArray()){
            if(ch!= '_'){
                str1.append(ch.toString());
            }
        }
        for(Character ch : target.toCharArray()){
            if(ch!= '_'){
                str2.append(ch.toString());
            }
        }

        return str1.equals(str2);

    }
}
