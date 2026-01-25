package NEETCODE150;
import java.util.*;
public class containsDuplicate3 {
    public static int duplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int num : nums) {
            if(map.get(num) > 1) {
                return num;
            }
        }
        return -1;
    }
}
