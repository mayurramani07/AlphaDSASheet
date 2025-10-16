package WEEKLYCONTESTQUESTIONS;
import java.util.*;
public class MinCostPathWithAlternatingDirection {
    public static long minCost(int m, int n, int[][] waitCost) {
        long[][] dp = new long[m][n];

        dp[0][0] = 1L;

        for(int j=1 ; j<n ; j++) {
            long entry = (long)(0+1) * (j+1);
            long add = entry + (j == n-1 && m == 1 ? 0 : waitCost[0][j]);
            dp[0][j] = dp[0][j-1] + add;
        }

        for(int i=1 ; i<m ; i++) {
            long entry = (long)(i + 1) * (0 + 1);
            long add = entry + (i == n-1 && m == 1 ? 0 : waitCost[i][0]);
            dp[i][0] = dp[i-1][0] + add;
        }

        for(int i=1 ; i<m ; i++) {
            for(int j=1 ; j<n ; j++) {
                long entry = (long)(i+j) * (j + 1);
                boolean isDest = (i == m - 1 && j == n - 1);
                long add = entry + (isDest ? 0 : waitCost[i][j]);
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + add;
            }
        }
        return dp[m - 1][n - 1];
    }
}
