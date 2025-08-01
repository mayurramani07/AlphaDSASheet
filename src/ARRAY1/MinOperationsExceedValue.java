package ARRAY1;
import java.util.*;
public class MinOperationsExceedValue {
    public static int minOperations(int[] nums, int k) {
        int operation = 0;
        Arrays.sort(nums);

        for (int num : nums) {
            if (num < k) {
                operation++;
            } else {
                break;
            }
        }
        return operation;
    }
}

//TIME COMPLEXITY : O(nlogn)
//SPACE COMPLEXITY : O(1)