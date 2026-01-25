package NEETCODE150;
import java.util.*;
public class ContainDuplicates {
    public static int Duplicates(int[] nums) {
        int slow = 0;
        int fast = 0;

        while(true) {
            slow = nums[slow];
            fast = nums[nums[fast]];

            if(slow == fast) {
                break;
            }
        }
        while(true) {
            int slow2 = 0;
            slow = nums[slow];
            slow2 = nums[slow2];
            if(slow == fast) {
                return slow;
            }
        }
    }
}
