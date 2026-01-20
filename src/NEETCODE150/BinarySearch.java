package NEETCODE150;
import java.util.*;
public class BinarySearch {
    public static int Binarysearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(mid == target) {
                return mid;
            }
            else if(mid < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
//TIME COMPLEXITY : O(log n)
//SPACE COMPLEXITY : O(1)