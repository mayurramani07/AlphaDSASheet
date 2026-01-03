package PRACTICEARRAY;
import java.util.*;
public class NobleInteger {
    public static int NobleIntegers(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        for(int i=0; i<nums.length; i++) {
            if(i < n-1 && nums[i] == nums[i+1]) {
                continue;
            }

            int greaterElements = n - i - 1;

            if(nums[i] == greaterElements) {
                return 1;
            }
        }
        return -1;
    }
}
