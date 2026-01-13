package NEETCODE150;
import java.util.*;
public class ContainsDuplicate {
    public static boolean ContainsDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int value : map.values()) {
            if(value != 1) {
                return true;
            }
        }
        return false;
    }
}
