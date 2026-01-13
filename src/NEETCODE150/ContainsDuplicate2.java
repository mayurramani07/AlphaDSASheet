package NEETCODE150;
import java.util.*;
public class ContainsDuplicate2 {
    public static boolean ContainsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                return true;
            }
        }
        return false;
    }
}

//TIME COMPLEXITY : O(nlogn)
//SPACE COMPLEXITY : O(1)