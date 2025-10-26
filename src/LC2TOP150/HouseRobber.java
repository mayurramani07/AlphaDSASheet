package LC2TOP150;
import java.util.*;
public class HouseRobber {
    public static int HouseRobberr(int[] nums) {
        int n = nums.length;
        if(n == 0) {
            return n;
        }
        if(n == 1) {
            return nums[0];
        }
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0], dp[1]);

        for(int i=2 ; i<n ; i++) {
            dp[i] = Math.max(dp[i], dp[i-2] + nums[i]);

        }
        return dp[n-1];
    }
}
