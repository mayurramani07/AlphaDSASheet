package LOGICBUILDING3;
import java.util.*;
public class SmallestMissingIntGreater {
    public static int missingInteger(int[] nums) {
        int sum = nums[0];
        int i = 1;
        while(i < nums.length && nums[i] == nums[i-1] + 1) {
            sum += nums[i];
            i++;
        }

        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }

        int x = sum;
        if(set.contains(x)) {
            x++;
        }
        return x;
    }
}

//Time Complexity : O(n)
//Space Complexity : O(n)