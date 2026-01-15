package NEETCODE150;
import java.util.*;
public class ThreeSumCloset {
    public static int ThreeSum(int[] nums, int target) {
        if(nums == null || nums.length < 3) {
            return 0;
        }
        int diff = Integer.MAX_VALUE;
        int closet = 0;

        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++) {
            int left = i+1;
            int right = nums.length - 1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == target) {
                    return target;
                }
                if(Math.abs(sum - target) < diff) {
                    diff = Math.abs(sum - target);
                    closet = sum;
                }
                if(sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return closet;
    }
}
//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(n)