package SLIDINGWINDOW;
import java.util.*;
public class MaxLengthOfRepeatedSubarray {
    public static int MaxLenght(int[] nums1 , int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int maxLen = 0;

        int[][] dp = new int[n][m];

        for(int i=1 ; i<=n ; i++) {
            for(int j=1 ; j<=m ; j++) {
                if(nums1[i-1] == nums2[j-1]) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                    maxLen = Math.max(maxLen, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return maxLen;
    }
}

//TIME COMPLEXITY : O(m * n)