package NEETCODE150;
import java.util.*;
public class MinimizeTheMaxNumOfPairs {
    public static int MinMaxPairs(int[] nums, int p) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;
        int ans = 0;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(canFormPairs(nums, p, mid)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
    public static boolean canFormPairs(int[] nums, int p, int maxDiff) {
        int count = 0;
        int i = 0;

        while(i < nums.length - 1) {
            if(nums[i+1] - nums[i] <= maxDiff) {
                count++;
                i+=2;
            } else {
                i++;
            }
        }
        return count >= p;
    }
}
