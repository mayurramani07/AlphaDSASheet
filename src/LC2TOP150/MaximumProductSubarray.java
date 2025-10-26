package LC2TOP150;
import java.util.*;
public class MaximumProductSubarray {
    public static int MaxProduct(int[] nums) {
        int n = nums.length;
        int maxProduct = Integer.MAX_VALUE;

        int prefix = 1;
        int suffix = 1;

        for(int i=0 ; i<n ; i++) {
            prefix *= nums[i];
            suffix *= nums[n - i -1];

            maxProduct = Math.max(maxProduct, Math.max(prefix, suffix));

            if(prefix == 0) {
                prefix = 1;
                suffix = 1;
            }
        }
        return maxProduct;
    }
}
