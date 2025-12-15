package DAILYSTREAKQUESTIONS;
import java.util.*;
public class ZeroFilledSubarraycode {
    public static long ZeroFilledSubarray(int[] nums) {
        long ans = 0;
        long countZero = 0;

        for(int num : nums) {
            if(num == 0) {
                countZero++;
            } else {
                ans += countZero*(countZero + 1) / 2;
                countZero = 0;
            }
        }
        ans += countZero * (countZero + 1) / 2;
        return ans;
    }
}
