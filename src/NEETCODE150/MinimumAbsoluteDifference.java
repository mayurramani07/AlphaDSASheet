package NEETCODE150;
import java.util.*;
public class MinimumAbsoluteDifference {
    public static List<List<Integer>> MinAbsoluteDiff(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++) {
            int diff = nums[i+1] - nums[i];
            if(diff < minDiff) {
                minDiff = diff;
                result.clear();
            }
            if (diff == minDiff) {

                result.add(Arrays.asList(nums[i], nums[i + 1]));
            }
        }

        return result;
    }
}
//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(1)