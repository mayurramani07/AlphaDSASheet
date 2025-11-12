package LC3TOP150;
import java.util.*;
public class MinNumOfOpenToMakeAll1 {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int minOperations(int[] nums) {
        int n = nums.length;
        int overallGCD = nums[0];

        for (int i = 1; i < n; i++) {
            overallGCD = gcd(overallGCD, nums[i]);
        }
        if (overallGCD > 1) {
            return -1;
        }
        int ones = 0;
        for (int num : nums) {
            if (num == 1) {
                ones++;
            }
        }
        if (ones > 0) return n - ones;
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int currGcd = nums[i];
            for (int j = i + 1; j < n; j++) {
                currGcd = gcd(currGcd, nums[j]);
                if (currGcd == 1) {
                    minLen = Math.min(minLen, j - i + 1);
                    break;
                }
            }
        }
        return (minLen - 1) + (n - 1);
    }
}