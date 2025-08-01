package ARRAY1;
import java.util.*;
public class MinimumIndexOfValidSplit {
    public static int MinimumIndex(List<Integer> nums) {
        int n = nums.size();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find dominant element and its total count
        int dominant = -1;
        int totalCount = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > totalCount) {
                totalCount = entry.getValue();
                dominant = entry.getKey();
            }
        }

        // Step 3: Try each index as a split
        int leftCount = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums.get(i) == dominant) {
                leftCount++;
            }

            int leftLength = i + 1;
            int rightLength = n - leftLength;
            int rightCount = totalCount - leftCount;

            // Check if dominant is valid in both left and right parts
            if (leftCount * 2 > leftLength && rightCount * 2 > rightLength) {
                return i;
            }
        }

        return -1;
    }
}