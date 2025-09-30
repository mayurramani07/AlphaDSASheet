package HASHMAP;
import java.util.*;
public class IsomorphicString {
    public static boolean Isomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if(map.containsKey(cs)) {
                if(!map.get(cs).equals(ct)) {
                    return false;
                }
            } else {
                if(map.containsValue(ct)) {
                    return false;
                }
                map.put(cs, ct);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(Isomorphic("egg", "add"));
    }
}
