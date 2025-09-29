package SLIDINGWINDOW;
import java.util.*;
public class CountCompleteSubarrayInArray {
    public static int CountSubarray(int[] nums) {
        HashSet<Integer> distinctSet = new HashSet<>();

        for (int num : nums) {
            distinctSet.add(num);
        }
        int totalDistinct = distinctSet.size();
        int n = nums.length;
        int count = 0;
        for(int start = 0 ; start < n ; start++) {
            HashSet<Integer> set = new HashSet<>();
            for(int end = start ; end < n ; end++) {
                set.add(nums[end]);
                if(set.size() == totalDistinct) {
                    count++;
                }
            }
        }
        return count;   
    }
}
