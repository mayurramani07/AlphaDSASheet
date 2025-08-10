package ARRAY6;
import java.util.*;
public class Sqrt {
    public static int Sqrtt(int x) {
        if(x < 2) {
            return x;
        }
        int left = 1;
        int right = x/2;
        int ans = 0;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if((long) mid * mid == x) {
                return mid;
            }
            if((long)mid * mid < x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
//Time Complexity : O(logn)
//Space Complexity : O(1)
