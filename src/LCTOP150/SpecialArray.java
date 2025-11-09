package LCTOP150;
import java.util.*;
public class SpecialArray {
    public static boolean[] SpecialArrays(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] prefix = new int[n];

        for(int i=1; i<nums.length; i++) {
            prefix[i] = prefix[i - 1];
            if((nums[i] % 2) == nums[i-1] % 2) {
                prefix[i]++;
            }
        }
        boolean[] ans = new boolean[queries.length];
        for(int i=0 ; i<queries.length ; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            ans[i] = (prefix[start] - prefix[end]) == 0;
        }
        return ans;
    }
}
