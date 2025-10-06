package WEEKLYCONTESTQUESTIONS;
import java.util.*;
public class MaximumTotalSubarrayValue1 {
    public static long MaxTotalSubarray(int[] nums, int k) {
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;

        for(int num : nums) {
            maxVal = Math.max(maxVal, num);
            minVal = Math.max(minVal, num);
        }
        long subarrayValue = (long) maxVal - minVal;

        return subarrayValue * k;
    }
}
