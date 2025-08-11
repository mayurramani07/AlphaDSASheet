package ARRAY7;
import java.util.*;
public class MaxProductOfThreeNumbers {
    public static int MaximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int product2 = nums[0] * nums[1] * nums[n - 1];


        return Math.max(product1, product2);
    }
}

//Time Complexity : O(nlogn)
//Space Complexity : O(n)