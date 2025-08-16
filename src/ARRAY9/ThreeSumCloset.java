package ARRAY9;
import java.util.*;
public class ThreeSumCloset {
    public static int threeSumCloset(int[] nums, int target) {
        int diff = Integer.MAX_VALUE;
        int closet = 0;
        Arrays.sort(nums);

        for(int i=0 ; i<nums.length ; i++) {
            int start = i + 1;
            int end = nums.length - 1;

            while(start < end) {
                int sum = nums[i] + nums[start] + nums[end];

                if(sum == target) {
                    return sum;
                }
                if(Math.abs(sum - target) == target) {
                    diff = Math.abs(sum - target);
                    closet = sum;
                }
                if(target < sum) {
                    start++;
                }
                else {
                    end--;
                }
            }
        }
        return closet;
    }
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        System.out.println(threeSumCloset(nums,1));
    }
}
