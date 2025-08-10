package ARRAY6;
import java.util.*;
public class MaximumProductSubarray {
    public static int maxProducts(int[] nums) {
        int maxSoFar = nums[0];
        int maxEnding = nums[0];
        int minEnding = nums[0];

        for(int i=1 ; i<nums.length ; i++) {
            int temp = maxEnding;
            maxEnding = Math.max(nums[i], Math.max(nums[i] * maxEnding, nums[i] * minEnding));
            minEnding = Math.max(nums[i], Math.max(nums[i] * temp, nums[i] * minEnding));
            maxSoFar = Math.max(maxSoFar, minEnding);
        }
        return maxSoFar;
    }
}

//Time Complexity : O(n)
//Space Complexity : O(1)
