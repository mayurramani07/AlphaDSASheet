package LOGICBUILDING150;
import java.util.*;
public class SortCharacterByFrequency {
    public static String SortCharacters(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char s : str.toCharArray()) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b)-> map.get(b) - map.get(a));
        pq.addAll(map.keySet());

        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()) {
            char c = pq.remove();
            int freq = map.get(c);
            for(int i=0 ; i<freq ; i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

//Time Complexity : O(nlogn)
//Space Complexity : O(n + u)