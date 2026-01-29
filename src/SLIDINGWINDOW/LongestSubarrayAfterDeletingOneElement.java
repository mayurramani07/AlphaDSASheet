package SLIDINGWINDOW;
import java.util.*;
public class LongestSubarrayAfterDeletingOneElement {
    public static int LongestSubarray(int[] nums) {
        int start = 0;
        int zerocount = 0;
        int result = 0;

        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0) {
                zerocount++;
            }

            while (zerocount > 1) {
                if (nums[start] == 0) {
                    zerocount--;
                }
                start++;
            }
            result = Math.max(result, end - start);
        }

        return result;
    }
}
//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(1)