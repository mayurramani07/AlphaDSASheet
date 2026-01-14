package NEETCODE150;
import java.util.*;
public class ProductOfArrayExceptSelf {
    public static int[] ProductOfArray(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] ans = new int[n];

        prefix[0] = 1;
        for(int i=1; i<n; i++) {
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        suffix[n-1] = 1;
        for(int i=n-2; i>=0; i--) {
            suffix[i] = suffix[i+1] * nums[i+1];
        }
        for(int i=0; i<n; i++) {
            ans[i] = prefix[i] * suffix[i];
        }
        return ans;
    }
}
//TIME COMPLEXITY - O(n)
//SPACE COMPLEXITY - O(n)
