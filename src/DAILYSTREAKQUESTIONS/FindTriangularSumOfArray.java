package DAILYSTREAKQUESTIONS;
import java.util.*;
public class FindTriangularSumOfArray {
    public static int SumOfArray(int[] nums) {
        int n = nums.length;

        while(n > 1) {
            for(int i=0 ; i<n-1 ; i++) {
                nums[i] = (nums[i] + nums[i+1]) % 10;
            }
            n--;
        }
        return nums[0];
    }
}
