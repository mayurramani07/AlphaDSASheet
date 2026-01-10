package PRACTICEDP;
import java.util.*;
public class KnapsackMemorization {
    public static int knapSack(int W, int[] val, int[] wt) {
        int[][] dp = new int[val.length][W+1];

        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return Solve(W, val, wt, 0, dp);
    }
    public static int Solve(int W, int[] val, int[] wt, int idx, int[][] dp) {
        if(idx >= val.length || W == 0) {
            return 0;
        }
        if(dp[idx][W] != -1) {
            return dp[idx][W];
        }
        int include = 0;
        if(W >= wt[idx]) {
            include = val[idx] + Solve(W-wt[idx], val, wt, idx+1, dp);
        }
        int exclude = Solve(W, val, wt, idx+1, dp);
        return dp[idx][W] = Math.max(include, exclude);
    }
}
