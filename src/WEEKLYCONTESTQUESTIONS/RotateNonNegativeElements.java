package WEEKLYCONTESTQUESTIONS;
import java.util.*;
public class RotateNonNegativeElements {
    public static int[] RotateNonNegative(int[] nums, int k) {
        int n = nums.length;

        List<Integer> NonNegative = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            if(nums[i] >= 0) {
                NonNegative.add(nums[i]);
            }
        }
        int m = NonNegative.size();

        k = k % m;

        List<Integer> rotated = new ArrayList<>();
        for(int i=k; i<m; i++) {
            rotated.add(NonNegative.get(i));
        }
        for(int i=0; i<k; i++) {
            rotated.add(NonNegative.get(i));
        }
        int idx = 0;
        for(int i=0; i<n ; i++) {
            if(nums[i] >= 0) {
                nums[i] = rotated.get(idx);
                idx++;
            }
        }
        return nums;
    }
}

//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(n)