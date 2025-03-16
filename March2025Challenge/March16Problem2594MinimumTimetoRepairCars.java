package March2025Challenge;
/* 2594.[Medium] Minimum Time to Repair Cars */
public class March16Problem2594MinimumTimetoRepairCars {
    public static long repairCars(int[] ranks, int cars) {
        long l = 1, r = (long) 1e14;
       while (l < r) {
           long mid = (l + r) / 2;
           if (timeIsSuff(ranks, cars, mid)) {
               r = mid;
           } else {
               l = mid + 1;
           }
       }
       return l;
   }
}
