package NEETCODE150;
import java.util.*;
public class ConcatenationOfArray {
    public static int[] Concatenate(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];

        for(int i=0; i<nums.length; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}

//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(1)