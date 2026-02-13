package WEEKLYCONTESTQUESTIONS;
import java.util.*;
public class LongestBalancedSubstring1 {
    public static int LongestBalanced(String s) {
        int n = s.length();
        int max = 0;

        for(int i=0; i<s.length(); i++) {
            int[] freq = new int[26];

            for(int j=i; j<s.length(); j++) {
                freq[s.charAt(j) - 'a']++;

                if(check(freq)) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }
    public static boolean check(int[] freq) {
        int count = 0;

        for(int i=0; i<26; i++) {
            if(freq[i] != 0) {
                count = freq[i];
            } else if(count != freq[i]) {
                return false;
            }
        }
        return true;
    }
}
