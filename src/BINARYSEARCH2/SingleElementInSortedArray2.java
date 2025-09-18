package BINARYSEARCH2;
import java.util.*;
public class SingleElementInSortedArray2 {
    public static int SingleElement(int[] nums) {
        int n = nums.length;
        if(n == 1) {
            return 0;
        }
        if(nums[0] != nums[1]) {
            return nums[0];
        }
        if(nums[n-1] != nums[n-2]) {
            return nums[n-1];
        }
        int start = 1;
        int end = n - 2;
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {
                return nums[mid];
            }
            //We are in left
            if((nums[mid] % 2 == 1 && nums[mid] == nums[mid - 1]) || (nums[mid] % 2 == 0  && nums[mid] == nums[mid + 1])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
