package PATTERNPREFIXSUFFIX;
import java.util.*;
public class PerfectPeakOfArray {
    public static int PerfectPeakArray(int[] nums) {
        int n = nums.length;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = nums[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(leftMax[i-1], nums[i]);
        }

        rightMax[n-1] = nums[n-1];
        for(int j=n-2; j>=0; j--) {
            rightMax[j] = Math.min(rightMax[j+1], nums[j]);
        }
        for(int i=1; i<=n-2; i--) {
            if(nums[i] > leftMax[i-1] && nums[i] < rightMax[i+1]);
            return 1;
        }
        return 0;
    }
}
