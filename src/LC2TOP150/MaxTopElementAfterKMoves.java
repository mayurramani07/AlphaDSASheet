package LC2TOP150;
import java.util.*;
public class MaxTopElementAfterKMoves {
    public static int MaxTopElements(int[] nums, int k) {
        int n = nums.length;
        if(k == 0) {
            return nums[0];
        }
        if(n == 1 && k % 2 == 1) {
            return -1;
        }

        int ans = -1;

        for(int i=0 ; i<k-1 ; i++) {
            ans = Math.max(ans, nums[i]);
        }
        if(k < n) {
            ans = Math.max(ans, nums[k]);
        }
        return ans;
    }
}
