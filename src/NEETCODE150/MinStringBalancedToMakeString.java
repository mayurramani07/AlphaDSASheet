package NEETCODE150;
import java.util.*;
public class MinStringBalancedToMakeString {
    public static int MinStingBal(String s) {
        int n = s.length();
        int[] dp = new int[n+1];
        dp[0] = 0;
        int[] freq = new int[2];

        for(int i=1; i<=n; i++) {
            if(s.charAt(i) == 'a') {
                if(freq[1] > 1) {
                    dp[i] = Math.min(dp[i-1] + 1, freq[1]);
                } else {
                    dp[i] = dp[i-1];
                }
                freq[0]++;
            } else {
                freq[1]++;
                dp[i] = dp[i-1];
            }
        }
        return dp[n];
    }
}