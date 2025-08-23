package ARRAY12;
import java.util.*;
public class LongestSubstringWithoutRepeatingChar {
    public static int LongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxLen = 0;

        while(right < s.length()) {
            char ch = s.charAt(right);
            if(!set.contains(ch)) {
                set.add(ch);
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            }
            else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }
}

//Time Complexity : O(n)
//Space Complexity: O(1)