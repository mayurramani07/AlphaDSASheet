package ARRAY6;
import java.util.*;
public class MaxSubarray {
    public static int MaximumSubarray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0 ; i<nums.length ; i++) {
            currSum = currSum + nums[i];
            maxSum = Math.max(maxSum, currSum);
            if(currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }
}

//Time Complexity : O(n)
//Space Complexity : O(1)