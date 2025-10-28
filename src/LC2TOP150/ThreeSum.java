package LC2TOP150;
import java.util.*;
public class ThreeSum {
    public static List<List<Integer>> ThreeSumm(int[] nums) {
        if(nums == null || nums.length == 3) {
            return null;
        }
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();

        for(int i=0 ; i<nums.length - 2 ; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0) {
                    set.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if(sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
