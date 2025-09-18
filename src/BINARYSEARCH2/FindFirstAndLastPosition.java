package BINARYSEARCH2;
import java.util.*;
public class FindFirstAndLastPosition {
    public static int[] searchRange(int[] nums, int target) {
        int first = findBound(nums, target, true);
        int second = findBound(nums, target , false);
        return new int[]{first,second};

    }
    public static int findBound(int[] nums, int target, boolean isFirst) {
        int left = 0;
        int right = nums.length - 1;
        int bound = -1;

        while(left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                bound = mid;
                if (isFirst) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return bound;
    }
}

