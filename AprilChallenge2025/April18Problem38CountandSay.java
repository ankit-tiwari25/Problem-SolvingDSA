/* 38.[Medium] Count and Say */
public class April18Problem38CountandSay {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(countAndSay(n));
    }
    public static String countAndSay(int n) {
        String curr = "1";
        if(n==1) return curr;
        for(int i=2;i<=n;i++)
        {
            StringBuilder sb = new StringBuilder();
            int cnt = 1;
            char ele = curr.charAt(0);
            for(int j=1;j<curr.length();j++)
            {
                char currChar = curr.charAt(j);
                if(currChar == ele) 
                cnt++;
                else{
                    sb.append(cnt).append(ele);
                    ele = currChar;
                    cnt=1;
                }
            }
            sb.append(cnt).append(ele);
            curr = sb.toString();
        }
        return curr;  
    }
}
