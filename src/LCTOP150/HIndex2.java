package LCTOP150;
import java.util.*;
public class HIndex2 {
    public static int HIndex(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int h = 0;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            int papers = n - mid;

            if(nums[mid] >= papers) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return h;
    }
}
