package LC3TOP150;
import java.util.*;
public class TwoSum {
    public static int[] TwoSums(int[] nums, int target) {
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0 ; i<nums.length ; i++) {
            int component = nums[i] - target;

            if(map.containsKey(component)) {
                return new int[] {map.get(component), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
