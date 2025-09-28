package SLIDINGWINDOW;
import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters {
    public static int LongestSubstring(String str) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxLen = 0;

        while(right < str.length()) {
            char ch = str.charAt(right);
            if(!set.contains(ch)) {
                set.add(ch);
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else {
                set.remove(str.charAt(left));
                left++;
            }
        }
        return maxLen;
    }
}