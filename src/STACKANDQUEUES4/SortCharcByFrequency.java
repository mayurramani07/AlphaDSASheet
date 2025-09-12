package STACKANDQUEUES4;
import java.util.*;
public class SortCharcByFrequency {
    public static String SortCharc(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        maxHeap.addAll(map.keySet());

        StringBuilder sb = new StringBuilder();
        while(!maxHeap.isEmpty()) {
            char c = maxHeap.poll();
            int freq = map.get(c);
            for(int i=0 ; i<freq ; i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

//Time Complexity : O(n + klogk)
//Space Complexity : O(n+k)