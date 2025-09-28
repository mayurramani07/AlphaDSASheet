package SLIDINGWINDOW;
import java.util.*;
public class MinOperReduceXtoZero {
    public static int MinOperation(int[] nums, int x) {
        int n = nums.length;
        int total = 0;

        for(int num : nums) {
            total += num;
        }
        int target = total - x;
        if(target < 0) {
            return -1;
        }
        int left = 0;
        int currSum = 0;
        int maxLen = -1;

        for(int right = 0; right < n ; right++) {
            currSum += nums[right];

            while(currSum >= target) {
                 maxLen = Math.max(maxLen, right - left + 1);
                 currSum -= nums[left];
                left++;
            }
        }
        return (maxLen == -1) ? -1 : n - maxLen;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,4,2,3};
        int x = 5;
        System.out.println(MinOperation(nums, x));
    }
}
