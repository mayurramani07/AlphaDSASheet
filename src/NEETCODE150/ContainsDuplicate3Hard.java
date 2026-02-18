package NEETCODE150;
import java.util.*;
public class ContainsDuplicate3Hard {
    public static boolean ContainsDuplicate(int[]nums, int valueDiff, int indexDiff) {
        TreeSet<Long> set = new TreeSet<>();

        for(int i=0; i<nums.length; i++) {
            Long floor = set.floor((long) nums[i] + valueDiff);
            Long ceil = set.ceiling((long) nums[i] - valueDiff);

            if((floor != null && floor >= (long)nums[i] - valueDiff) || (ceil != null && ceil <= (long)nums[i] + valueDiff)) {
                return true;
            }
            set.add((long) nums[i]);
            if(i >= indexDiff) {
                set.remove((long) nums[i - indexDiff]);
            }
        }
        return false;
    }
}

//TIME COMPLEXITY : O(nlogk)
//SPACE COMPLEXITY : O(k)