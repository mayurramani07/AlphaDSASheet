package LC4TOP150;
import java.util.*;
public class LongestPalindrome2 {
    public static int LongestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int length = 0;
        boolean oddFound = false;

        for(int count : map.values()) {
            if(count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                oddFound = true;
            }
        }
        if(oddFound) {
            length += 1;
        }
        return length;
    }
}
