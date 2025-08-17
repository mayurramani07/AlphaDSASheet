package ARRAY10;
import java.util.*;
public class MinimumSumOfMountainTriplets {
    public static int MinSumOfTriplet(int[] nums, int triplet) {
        int n = nums.length;

        int[] leftMin = new int[n];
        int[] rightMin = new int[n];

        leftMin[0] = Integer.MAX_VALUE;
        for(int i=1 ; i<n ; i++) {
            leftMin[i] = Math.min(leftMin[i-1], nums[i-1]);
        }

        rightMin[n-1] = Integer.MAX_VALUE;
        for(int i=n-2 ; i>=0 ; i--) {
            rightMin[i] = Math.min(rightMin[i+1], nums[i+1]);
        }
        int ans = Integer.MAX_VALUE;

        for(int j=1 ; j<n-1 ; j++) {
            if(leftMin[j] < nums[j] && rightMin[j] < nums[j]) {
                ans = Math.min(ans, leftMin[j] + nums[j] + rightMin[j]);

            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
