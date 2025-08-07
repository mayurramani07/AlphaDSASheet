package ARRAY3;
import java.util.*;
public class FindDuplicateNumber {
    public static int FindDuplicate(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int key : map.keySet()) {
            if(map.get(key) == 2) {
                return key;
            }
        }
        return -1;
    }
}

//Time Complexity : O(n)
//Space Complexity : O(n)