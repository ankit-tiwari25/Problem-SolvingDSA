
/* 3169.[Medium] Count Days Without Meetings */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class March24Problem3169CountDaysWithoutMeetings {
    public static void main(String[] args) {
      int  days = 10;
      int[][]  meetings = {{5,7},{1,3},{9,10}};
      System.out.println(countDays(days, meetings));
    }
     public static int countDays(int days, int[][] meetings) {
          Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));

        List<int[]> mergedMeetings = new ArrayList<>();
        for (int[] meeting : meetings) {
            if (mergedMeetings.isEmpty() || meeting[0] > mergedMeetings.get(mergedMeetings.size() - 1)[1]) {
                mergedMeetings.add(meeting);
            } else {
                mergedMeetings.get(mergedMeetings.size() - 1)[1] = 
                    Math.max(mergedMeetings.get(mergedMeetings.size() - 1)[1], meeting[1]);
            }
        }

        int meetingDaysCount = 0;
        for (int[] m : mergedMeetings) {
            meetingDaysCount += (m[1] - m[0] + 1);
        }

        return days - meetingDaysCount;
    }
}
