package ARRAY11;
import java.util.*;
public class CountDaysWithoutMeeting {
    public static int CountDays(int days, int[][] meetings) {
        int freeDays = 0;
        int prevEnd = 0;

        Arrays.sort(meetings , (a,b) -> Integer.compare(a[0], b[0]));

        for(int[] meeting : meetings) {
            int start = meeting[0];
            int end = meeting[1];

            if(start > prevEnd) {
                freeDays += start - prevEnd - 1;
                prevEnd = Math.max(prevEnd , end);
            }
        }
        return freeDays + Math.max(0, days - prevEnd);
    }
}

//Time Complexity : O(nlogn)
//Space Complexity : O(n)