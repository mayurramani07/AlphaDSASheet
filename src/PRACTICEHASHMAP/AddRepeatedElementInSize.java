package PRACTICEHASHMAP;
import java.util.*;
public class AddRepeatedElementInSize {
    public static int AddRepeatElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int maxKey = 0;
        int maxValue = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }
}
