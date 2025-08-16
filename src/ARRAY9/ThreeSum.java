package ARRAY9;
import java.util.*;
public class ThreeSum {
    public static List<List<Integer>> SumOfThree(int[] nums) {
        if(nums == null || nums.length < 3) {
            return null;
        }
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();

        for(int i=0 ; i<nums.length ; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {
                int sum = nums[left] + nums[right] + nums[i];

                if(sum == 0) {
                    set.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}

//Time Complexity : O(n)
//Space Complexity : O(n)
