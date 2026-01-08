package PRACTICEARRAY;
import java.util.*;
public class AddOneInArray {
    public static int[] AddOne(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int carry = 1;

        for(int i=n-1; i>=0; i--) {
            int sum = nums[i] + carry;
            nums[i] = sum % 10;
            carry = sum / 10;
        }

        if(carry == 1) {
            int[] res = new int[n + 1];
            res[0] = 1;
            return res;
        }
        int idx = 0;
        while (idx < n && nums[idx] == 0) {
            idx++;
        }

        return Arrays.copyOfRange(nums, idx, n);
    }
}