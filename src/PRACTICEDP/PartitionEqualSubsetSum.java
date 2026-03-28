package PRACTICEDP;
import java.util.*;
public class PartitionEqualSubsetSum {
    public static boolean PartitionSubset(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
        }
        if(sum % 2 != 0) {
            return false;
        }
        return dfs(nums, 0, sum/2);
    }
    public static boolean dfs(int[] nums, int i, int target ) {
        if(i == nums.length) {
            return target == 0;
        }
        if(target < 0) {
            return false;
        }
        return dfs(nums, i+1, target) || dfs(nums, i+1, target - nums[i]);
    }
}
