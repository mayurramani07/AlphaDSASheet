package LCTOP150;
import java.util.*;
public class LongPressedName {
    public static boolean LongPress(String name, String typed) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map1 = new HashMap<>();

        for(char ch : typed.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(char ch : name.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        for(int value : map.values()) {
            for(int value1 : map1.values()) {
                if(value > value1) {
                    return false;
                }
            }
        }
        return true;
    }
}
