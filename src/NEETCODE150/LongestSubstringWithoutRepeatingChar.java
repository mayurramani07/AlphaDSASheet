package NEETCODE150;
import java.util.*;
public class LongestSubstringWithoutRepeatingChar {
    public static int LongestSubstring(String str) {
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int right = 0;
        int maxLength = 0;

        while(right < str.length()) {
            char ch = str.charAt(right);

            if(!set.contains(ch)) {
                set.add(ch);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                set.remove(str.charAt(ch));
                left++;
            }
        }
        return maxLength;
    }
}
//TIME COMPLEXITY : O(n)
//SPACR COMPLEXITY : O(n)
