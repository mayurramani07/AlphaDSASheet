package LC2TOP150;
import java.util.*;
public class TwoSneakyNumber {
    public static int[] SneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];
        int index = 0;

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() == 2) {
                ans[index] = entry.getKey();
                index++;
            }
        }
        return ans;
    }
}
