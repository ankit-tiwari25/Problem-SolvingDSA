package June2025Challenge;

/* 3403.[Medium] Find the Lexicographically Largest String From the Box I */
public class Jun04Problem3403FindtheLexicographicallyLargestStringFromtheBoxI {
    public static void main(String[] args) {
        String word = "dbca";
        int numFriends = 2;
    }
    public static String answerString(String word, int numFriends) {
       if (numFriends == 1) return word;
        String res = "";
        int length = word.length() - numFriends + 1;
        for (int i = 0; i < word.length(); i++) {
            String temp;
            if (i + length <= word.length())
                temp = word.substring(i, i + length);
            else
                temp = word.substring(i);
            if (temp.compareTo(res) > 0)
                res = temp;
        }
        return res; 
    }
}
