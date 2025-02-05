package February2025Challenge;
/* 1790. [Easy] Check if One String Swap Can Make Strings Equal */
public class Feb5Problem1790CheckifOneStringSwapCanMakeStringsEqual {
    public static void main(String[] args) {
        String s1 = "bank", s2 = "kanb";
    }
    public static boolean areAlmostEqual(String s1, String s2) {
        int i=-1, j=-1;
        int cnt=0;

        for(int k=0; k<s1.length(); k++){
            if(s1.charAt(k)!=s2.charAt(k)){
                cnt++;
                if(i==-1) i=k;
                else if(j==-1) j=k;
            }
        }

        if(cnt==0) return true;
        else if(cnt==2 && s1.charAt(i)==s2.charAt(j) && s1.charAt(j)==s2.charAt(i)){
            return true;
        }


        return false;
    }
}
