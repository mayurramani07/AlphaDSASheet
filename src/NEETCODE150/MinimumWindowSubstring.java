package NEETCODE150;
import java.util.*;
public class MinimumWindowSubstring {
    public static String MinWindow(String s, String t) {
        if(t.length() > s.length()) {
            return "";
        }
        String result = "";
        int minLength = Integer.MAX_VALUE;

        for(int i=0; i<s.length(); i++) {
            for(int j=i+1; j<s.length(); j++) {
                String str = s.substring(i, j);
                if(solve(str,t) && str.length() < minLength) {
                    minLength = str.length();
                    result = str;
                }
            }
        }
        return result;
    }
    public static boolean solve(String str, String t) {
        int[] freq = new int[128];
        for(char c : str.toCharArray()) {
            freq[str.charAt(c) - 'a']++;
        }
        for(char c : t.toCharArray()) {
            freq[str.charAt(c) - 'a']--;

            if(freq[c] < 0) {
                return false;
            }
        }
        return true;
    }
}

//TIME COMPLEXITY : O(n^3)
//SPACE COMPLEXITY : O(1)