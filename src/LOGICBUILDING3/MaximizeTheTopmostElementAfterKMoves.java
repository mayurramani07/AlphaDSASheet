package LOGICBUILDING3;
import java.util.*;
public class MaximizeTheTopmostElementAfterKMoves {
    public static int MaximizeTopmost(int[] nums, int k) {
        int n = nums.length;
        if(k == 0) {
            return nums[0];
        }
        if(n == 1 && k % 2 == 1) {
            return -1;
        }
        int ans = -1;

        for(int i=0 ; i<Math.min(n, k-1) ; i++) {
            ans = Math.max(ans, nums[i]);
        }
        if(k < n) {
            ans = Math.max(ans, nums[k]);
        }
        return ans;
    }
}
