package LCTOP150;
import java.util.*;
public class ProductOfArrayExceptSelf {
    public static int[] ProductExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = 1;
        for(int i=0 ; i<n ; i++) {
            prefix[i] = prefix[i-1] * ans[i-1];
        }

        suffix[n-1] = 1;
        for(int i=n-2 ; i>=0 ; i--) {
            suffix[i] = suffix[i-1] * ans[i-1];
        }

        for(int i=0 ; i<n ; i++) {
            ans[i] = prefix[i - 1] * suffix[i - 1];
        }
        return ans;
    }
}
