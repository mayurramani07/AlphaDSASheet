package LCTOP150;
import java.util.*;
public class SortCharcByFreq2 {
    public static String SortChar(String s) {
        int n = s.length();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<Character>[] bucket = new List[n + 1];
        for (char ch : map.keySet()) {
            int freq = map.get(ch);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            } else {
                bucket[freq].add(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = n; i >= 1; i--) {
            if (bucket[i] != null) {
                for (char c : bucket[i]) {
                    for (int j = 0; j < i; j++) sb.append(c);
                }
            }
        }

        return sb.toString();
    }
}

//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(n)