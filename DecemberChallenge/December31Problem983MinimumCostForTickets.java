package DecemberChallenge;
/*
 * 983.[Medium] Minimum Cost For Tickets
 */
public class December31Problem983MinimumCostForTickets {
    public static void main(String[] args) {
        int[] days = {1,4,6,7,8,20};
        int[] costs = {2,7,15};
        System.out.println(mincostTickets(days, costs));
    }
    public static int mincostTickets(int[] days, int[] costs) {
        int maxDay = days[days.length - 1];
       boolean[] travelDay = new boolean[maxDay + 1];

       for (int day : days)
           travelDay[day] = true;

       int[] dp = new int[maxDay + 1];
       dp[0] = 0;

       for (int i = 1; i <= maxDay; i++) {
           if (!travelDay[i]) {
               dp[i] = dp[i - 1];
               continue;
           }

           dp[i] = costs[0] + dp[i - 1];
           dp[i] = Math.min(dp[Math.max(0, i - 7)] + costs[1], dp[i]);
           dp[i] = Math.min(dp[Math.max(0, i - 30)] + costs[2], dp[i]);
       }

       return dp[maxDay];
   }
}
