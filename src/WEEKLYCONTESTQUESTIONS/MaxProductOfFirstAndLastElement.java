package WEEKLYCONTESTQUESTIONS;
import java.util.*;
public class MaxProductOfFirstAndLastElement {
    public static long maxProduct(int[] nums, int m) {
        int n = nums.length;
        long maxProduct = Long.MIN_VALUE;

        long maxLeft = Long.MIN_VALUE;
        long minLeft = Long.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            int newLeftIndex = right - (m - 1);
            if (newLeftIndex >= 0) {
                long val = nums[newLeftIndex];
                if (val > maxLeft) {
                    maxLeft = val;
                }
                if (val < minLeft) {
                    minLeft = val;
                }
            }
            if (right >= m - 1) {
                long a = (long) nums[right] * maxLeft;
                long b = (long) nums[right] * minLeft;
                maxProduct = Math.max(maxProduct, Math.max(a, b));
            }
        }
        return maxProduct;
    }
}