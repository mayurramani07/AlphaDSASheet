package STACKANDQUEUES4;
import java.util.*;
public class FindFirstUniqueCharacters {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(int i=0 ; i<s.length() ; i++) {
            if()
        }
    }
}
