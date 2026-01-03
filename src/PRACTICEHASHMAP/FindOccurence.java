package PRACTICEHASHMAP;
import java.util.*;
public class FindOccurence {
    public static int[] FindOcc(int[] nums) {
        int n = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        int[] ans = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
