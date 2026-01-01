package PRACTICESTRING;
import java.util.*;
public class MinimumDeletionToMakeAllCharEqual {
    public static long minCost(String s, int[] cost) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length() ; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int max = 0;
        int sum = 0;
        for(int val : map.values()) {
            sum += val;
            max = Math.max(max, val);
        }
        return max - sum;
    }
}
