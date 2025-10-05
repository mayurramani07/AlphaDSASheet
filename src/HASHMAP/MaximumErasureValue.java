package HASHMAP;
import java.util.*;
public class MaximumErasureValue {
    public static int MaxErasure(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxSum = 0;
        int currSum = 0;

        while(right < arr.length) {
            if (!set.contains(arr[right])) {
                set.add(arr[right]);
                currSum += arr[right];
                maxSum = Math.max(maxSum, currSum);
                right++;
            } else {
                set.remove(arr[left]);
                left++;
                currSum -= arr[left];
            }
        }
        return maxSum;
    }
}
