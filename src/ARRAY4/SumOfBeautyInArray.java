package ARRAY4;
import java.util.*;
public class SumOfBeautyInArray {
    public static int SumOfBeauty(int[] nums) {
        int n = nums.length;

        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = nums[0];
        for(int i=1 ; i<nums.length ; i++) {
            prefix[i] = Math.max(prefix[i-1], nums[i]);
        }
        suffix[n-1] = nums[n-1];
        for(int i=n-1 ; i>=0 ; i--) {
            suffix[i] = Math.min(suffix[i+1], nums[i]);
        }
        int beautySum = 0;
        for(int i=1 ; i<n-1 ; i++) {
            if(nums[i] > prefix[i-1] && nums[i] < suffix[i+1]) {
                beautySum += 2;
            }
            else if(nums[i-1] < nums[i] && nums[i] < nums[i+1]) {
                beautySum += 1;
            }
        }
        return beautySum;
    }
}

//Time Complexity : O(n)
//Space Complexity : o(n)