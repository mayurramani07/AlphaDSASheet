package ARRAY1;
import java.util.*;
public class MajorityElement {
    public static int MajorityEle(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num , 0) + 1);
        }

        for(int key : map.keySet()) {
            if(map.get(key) < n/2) {
                return key;
            }
        }
        return -1;
    }
}
