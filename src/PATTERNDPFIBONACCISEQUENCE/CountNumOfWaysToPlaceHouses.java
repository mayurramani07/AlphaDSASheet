package PATTERNDPFIBONACCISEQUENCE;
import java.util.*;
public class CountNumOfWaysToPlaceHouses {
    public static int CountWays(int n) {
        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 2;

        for(int i=2 ; i<=n ; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        int total = dp[n] * dp[n];
        return total;
    }
}

//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(n)