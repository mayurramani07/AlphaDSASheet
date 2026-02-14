package WEEKLYCONTESTQUESTIONS;
import java.util.*;
public class FindElementAfterSubarrayDeletion {
    public static int FindElements(int[] nums) {
        int n = nums.length;

        return Math.max(nums[0], nums[n-1]);

    }
}
