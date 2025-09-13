package LOGICBUILDING150;
import java.util.*;
public class MostFrequentEvenElement {
    public static int MostFrequent(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            if(num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0)+ 1);
            }
        }
        int result = -1;
        int maxfreq = 0;

        for(int key : map.keySet()) {
            int freq = map.get(key);
            if(freq > maxfreq || (freq == maxfreq && key < result)) {
                maxfreq = freq;
                result = key;
            }
        }
        return result;
    }
}

//Time Complexity : O(n)
//Space Complexity : O(1)