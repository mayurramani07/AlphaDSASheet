package WEEKLYCONTESTQUESTIONS;
import java.util.*;
public class LongestSubstringWithAtleastKRepeats {
    public static int LongestSubstring(String s, int k) {
        if(s == null || s.length() == 0 || k > s.length()) {
            return 0;
        }
        int[] freq = new int[26];
        for(char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        for(int i=0; i<s.length(); i++){
            if(freq[s.charAt(i) - 'a'] < k) {
                int left = LongestSubstring(s.substring(0, i), k);
                int right = LongestSubstring(s.substring(i+1), k);
                return Math.max(left, right);
            }
        }
        return s.length();
    }
}
