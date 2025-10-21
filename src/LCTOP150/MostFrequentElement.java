package LCTOP150;
import java.util.*;
public class MostFrequentElement {
    public static int MostFreq(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums) {
            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        int result = -1;
        int maxFreq = 0;

        for(int key : map.keySet()) {
            int freq = map.get(key);

            if(freq > maxFreq) {
                maxFreq = freq;
                result = key;
            }
            else if(freq == maxFreq) {
                result = Math.min(result, key);
            }
        }

        return result;
    }
}
