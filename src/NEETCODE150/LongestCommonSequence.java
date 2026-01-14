package NEETCODE150;
import java.util.*;
public class LongestCommonSequence {
    public static int LCS(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        int maxLength = 0;
        for(int num : set) {
            if(!set.contains(num - 1)) {
                int currNum = num;
                int length = 1;

                while(set.contains(num - 1)) {
                    currNum++;
                    length++;
                }
                maxLength = Math.max(maxLength , length);
            }
        }
        return maxLength;
    }
}

//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(n)