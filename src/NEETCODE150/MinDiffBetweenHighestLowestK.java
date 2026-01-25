package NEETCODE150;
import java.util.*;
public class MinDiffBetweenHighestLowestK {
    public static int MinDiff(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = Integer.MIN_VALUE;

        for(int i=0; i<n-k+1; i++) {
            ans = Math.min(ans, nums[i-k+1] - nums[i]);
        }
        return ans;
    }
}
