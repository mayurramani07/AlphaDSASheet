package ARRAY1;
import java.util.*;
public class MostFrequentEvenElement {
    public static int mostFrequent(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums) {
            if(num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        int result = -1;
        int maxFreq = 0;

        for(int key : map.keySet()) {
            int freq = map.get(key);
            if(freq > maxFreq || (freq == maxFreq && key < result)) {
                maxFreq = freq;
                result = key;
            }
        }
        return result;
    }
}

//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(n)