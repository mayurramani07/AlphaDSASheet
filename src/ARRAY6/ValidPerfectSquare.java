package ARRAY6;
import java.util.*;
public class ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        if(num < 1) {
            return false;
        }
        long left = 1;
        long right = num;

        while(left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if(square == num) {
                return true;
            }
            else if(square < num) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return false;
    }
}
//WHY WE ARE USING LONG HERE?....BECAUSE OF INTEGER OVERFLOW
//Time Complexity : O(nlogn)
//Space Complexity : O(n)

