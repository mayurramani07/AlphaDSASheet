package PRACTICEARRAY;
import java.util.*;
public class MaximumScore {
    public static int MaxScore(int[] arr, int k) {
        int n = arr.length;

        int[][][] dp = new int[n][n][k+1];

        for (int m = 1; m <= k; m++) {
            for (int len = 1; len <= n; len++) {
                for (int l = 0; l + len - 1 < n; l++) {
                    int r = l + len - 1;
                    int best = Integer.MIN_VALUE;

                    for (int i = l; i <= r; i++) {
                        best = Math.max(best, arr[i] + dp[i][r][m - 1]);
                        best = Math.max(best, arr[i] + dp[l][i][m - 1]);
                    }
                    dp[l][r][m] = best;
                }
            }
        }

        return dp[0][n - 1][k];
    }
}