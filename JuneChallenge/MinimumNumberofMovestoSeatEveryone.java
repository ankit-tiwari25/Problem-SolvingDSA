package JuneChallenge;
// 2037. [Easy] Minimum Number of Moves to Seat Everyone
// 13th June 2024
// TODO : Revisit Required
public class MinimumNumberofMovestoSeatEveryone {
    public static void main(String[] args) {
        int[] seats = {3,1,5}            ;
        int[] students = {2,4,7};
        System.out.println(minMovesToSeat(seats, students));
    }
    public static int minMovesToSeat(int[] seats, int[] students) {
        int[] pos = new int[101];
      int n = seats.length;
      for(int i = 0; i < n; i++){
          pos[seats[i]]++;
          pos[students[i]]--;
      }
      int res = 0;
      int current = 0;
      for(int i: pos){
          res += Math.abs(current);
          current += i;
      }
      return res;
  }
}
