package OneDimensionalDP;
import java.util.*;
public class LongestIncreaseSubsequence2 {
    public static int LengthOfLIS(int[] nums) {
        int n = nums.length;

        if(n == 0) {
            return 0;
        }
        int[] dp = new int[n];
        dp[0] = 1;
        int ans = 1;
        for(int i=1 ; i<n ; i++) {
            int max = 0;
            for(int j=0 ; j<n ; j++) {
                if(nums[i] > nums[j]) {
                    max = Math.max(max , nums[j]);
                }
            }
            dp[i] = max + 1;
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}
