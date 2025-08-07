package ARRAY3;
import java.util.*;
public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;

        for(int i=0 ; i<n ; i++) {
            xor ^= i;
        }
        for(int num : nums) {
            xor ^= num;
        }
        return xor;
    }
}
//Time Complexity : O(n)
//Space Complexity : O(1)
