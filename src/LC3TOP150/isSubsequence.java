package LC3TOP150;
import java.util.*;
public class isSubsequence {
    public static boolean isSubsequences(String s, String t) {
        int i = 0;
        int j = 0;

        while(i < s.length() && j < t.length()) {
            if(s.charAt(i) == s.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
