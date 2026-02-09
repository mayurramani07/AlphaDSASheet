package NEETCODE150;
import java.util.*;
public class CountDominantIndices {
    public static int CountDom(int[] nums) {
        int n = nums.length;
        int[] suffix = new int[n + 1];
        suffix[n] = 0;
        for(int i=n-1; i>=0; i--) {
            suffix[i] = suffix[i+1] + nums[i];
        }
        int count = 0;
        for(int i=0; i<n; i++) {
            int sum = suffix[i+1];
            int num = n - i + 1;

            if(num == 0) {
                continue;
            }
            int avg = sum / num;
            if(avg < nums[i]) {
                count++;
            }
        }
        return count;
    }
}
//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(1)