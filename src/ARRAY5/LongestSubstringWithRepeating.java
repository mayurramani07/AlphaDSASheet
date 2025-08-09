package ARRAY5;
import java.util.*;
public class LongestSubstringWithRepeating {
    public static int longestSubstring(String s, int k) {
        if (s == null || s.length() == 0 || k > s.length()) return 0;

        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] < k) {
                int left = longestSubstring(s.substring(0, i), k);
                int right = longestSubstring(s.substring(i + 1), k);
                return Math.max(left, right);
            }
        }
        return s.length();
    }
}

