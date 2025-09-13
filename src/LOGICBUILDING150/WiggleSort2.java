package LOGICBUILDING150;
import java.util.*;
public class WiggleSort2 {
    public static void WiggleSort(int[] nums) {
        int n = nums.length;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        int left = (n-1)/2;
        int right = n-1;


        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                nums[i] = sorted[left--];   // smaller elements
            } else {
                nums[i] = sorted[right--];  // larger elements
            }
        }
    }
}

