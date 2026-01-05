package PRACTICEARRAY;
import java.util.*;
public class MaximumSumTriplet {
    public static int MaxSumTriplet(int[] nums) {
        int n = nums.length;

        int[] rightMax = new int[n];
        rightMax[n-1] = nums[n-1];

        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(nums[i], rightMax[i+1]);
        }

        TreeSet<Integer> set = new TreeSet<>();
        set.add(nums[0]);

        int ans = 0;

        for(int j=1; j<n-1; j++) {
            Integer left = set.lower(nums[j]);
            int right = rightMax[j + 1];
            if (left != null && right > nums[j]) {
                ans = Math.max(ans, left + nums[j] + right);
            }

            set.add(nums[j]);
        }
        return ans;
    }
}
