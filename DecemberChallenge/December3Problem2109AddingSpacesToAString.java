package DecemberChallenge;

/*
 * 2109.  Adding Spaces to a String
 */
public class December3Problem2109AddingSpacesToAString {
    public static void main(String[] args) {
        // String s = "EnjoyYourCoffee";
        // int[] space = {5,9};
        String s = "LeetcodeHelpsMeLearn";
        int[] spaces = {8,13,15};

        System.out.println(addSpaces(s, spaces));
    }
    public static String addSpaces(String s, int[] spaces) {
        StringBuilder str = new StringBuilder();
        int n = s.length();
        for(int i = 0, j = 0; i < n; i++){
            if(j < spaces.length){
                int idx = spaces[j];
            if(i == idx){
                str.append(" ");
                j++;
            }
            }
            
            str.append(""+s.charAt(i));
            
            // System.out.println(str);

        }
        return str.toString();
    }
}
