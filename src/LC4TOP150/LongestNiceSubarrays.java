package LC4TOP150;
import java.util.*;
public class LongestNiceSubarrays {
    public static int LongestNice(int[] nums) {
        int n = nums.length;
        int maxLen = 1;

        for(int i=0 ; i<n; i++) {
            int mask = nums[i];
            for(int j=i+1 ; j<n ; j++) {
                if((mask & nums[j]) != 0) {
                    break;
                }
                mask |= nums[j];
                maxLen = Math.max(maxLen , j - i + 1);
            }
        }
        return maxLen;
    }
}
