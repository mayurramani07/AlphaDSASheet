package ARRAY12;
import java.util.*;
public class MaximumErasureValue {
    public static int MaximumEraser(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxSum = 0;
        int currSum = 0;

        while(right < nums.length) {
            if(!set.contains(nums[right])) {
                set.add(nums[right]);
                currSum += nums[right];
                maxSum += Math.max(maxSum , currSum);
                right++;
            }
            else {
                set.remove(nums[left]);
                currSum -= nums[left];
                left++;
            }
        }
        return maxSum;
    }
}

//Time Complexity : O(n)
//Space Complexity : O(n)