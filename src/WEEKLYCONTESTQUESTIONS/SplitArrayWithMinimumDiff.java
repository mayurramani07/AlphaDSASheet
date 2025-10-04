package WEEKLYCONTESTQUESTIONS;
import java.util.*;
public class SplitArrayWithMinimumDiff {
    public static long SplitArray(int[] nums) {
        int n = nums.length;

        long[] prefixSum = new long[n];
        prefixSum[0] = nums[0];
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + prefixSum[i];
        }
        boolean[] inc = new boolean[n];
        inc[0] = true;
        for (int i = 1; i < n; i++) {
            inc[i] = inc[i - 1] && nums[i] > nums[i - 1];
        }
        boolean[] dec = new boolean[n];
        dec[n - 1] = true;
        for (int i = n - 1; i >= 0; i--) {
            dec[i] = dec[i + 1] && nums[i] > nums[i + 1];
        }

        long ans = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            if (inc[i] && dec[i + 1]) {
                long leftSum = prefixSum[i];
                long rightSum = prefixSum[n - 1] - prefixSum[i];
                ans = Math.min(ans, Math.abs(leftSum - rightSum));
            }
        }

        return ans == Long.MAX_VALUE ? -1 : ans;
    }
}