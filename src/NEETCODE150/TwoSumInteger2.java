package NEETCODE150;
import java.util.*;
public class TwoSumInteger2 {
    public static int[] TwoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            int sum = nums[left] + nums[right];

            if(sum == target) {
                return new int[]{left+1, right+1};
            }
            else if(sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
        return new int[]{-1,-1};
    }
}
