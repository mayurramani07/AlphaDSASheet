package PRACTICEARRAY;
import java.util.*;
public class GreaterThemAll {
    public static int GreaterThem(int[] nums) {
        int n = nums.length;
        int count = 0;
        int max = 0;

        for(int i=0; i<n; i++) {
            if(nums[i] > max) {
                count++;
                nums[i] = max;
            }
        }
        return count;
    }
}
