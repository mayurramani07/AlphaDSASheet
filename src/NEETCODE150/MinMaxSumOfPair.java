package NEETCODE150;
import java.util.*;
public class MinMaxSumOfPair {
    public static int MinMaxSum(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int ans = 0;

        while(left < right) {
            ans = Math.max(ans, nums[left] + nums[right]);
            left++;
            right--;
        }
        return ans;
    }
}
//TIME COMPLEXITY : O(nlogn)
//SPACE COMPLEXITY : O(1)