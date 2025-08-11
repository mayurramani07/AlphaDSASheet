package ARRAY7;
import java.util.*;
public class SubarrayProductLessThenK {
    public static int maxSubarray(int[]nums , int k) {
        if(k <= 1) {
            return 0;
        }
        int prod = 1 , count = 0 , left = 0;

        for(int right=0 ; right<nums.length ; right++) {
            prod *= nums[right];

            while(prod >= k) {
                prod /= nums[left];
                left++;
            }
            count += (right - left + 1);
        }
        return count;
    }
}
