package SLIDINGWINDOW;
import java.util.*;
public class MaximumErasureValue {
    public static int MaxErasure(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxSum = 0;
        int currSum = 0;

        while (right < arr.length) {
            if(!set.contains(arr[right])) {
                set.add(arr[right]);
                currSum += arr[right];
                maxSum = Math.max(currSum, maxSum);
                right++;
            } else {
                set.remove(arr[left]);
                currSum -= arr[left];
                left++;
            }
        }
        return maxSum;
    }
}

//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(n)