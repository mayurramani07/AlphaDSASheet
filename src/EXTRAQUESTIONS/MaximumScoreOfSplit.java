package EXTRAQUESTIONS;
import java.util.*;
public class MaximumScoreOfSplit {
    public static long maximumScore(int[] nums) {
        int n = nums.length;
        long[] prefix= new long[n];
        long[] suffix = new long[n];
        prefix[0] = nums[0];
        for(int i=1; i<n ; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }
        suffix[n-1] = Integer.MAX_VALUE;
        for(int j=n-2 ; j>=0 ; j--) {
            suffix[j] = Math.min(suffix[j+1], nums[j+1]);
        }
        long max = Integer.MIN_VALUE;
        for(int i=0 ; i<n-1 ; i++) {
            max = Math.max(max, prefix[i] - suffix[i]);
        }
        return max;
    }
}
