package LOGICBUILDING2;
import java.util.*;
public class MaximumProductSubarray {
    public static int MaxProduct(int[] nums) {
        int maxEnding = nums[0];
        int minEnding = nums[0];
        int maxSOFAR = nums[0];

        for(int i=1 ; i<nums.length ; i++) {
            int temp = maxEnding;
            maxEnding = Math.max(nums[i], Math.max(nums[i] * maxEnding , nums[i] * minEnding));
            minEnding = Math.min(nums[i], Math.min(nums[i] * temp , nums[i] * minEnding));
            maxSOFAR = Math.max(maxEnding, minEnding);
        }
        return maxSOFAR;
    }
}
