package DPMULTIDIMENSIONAL;
import java.util.*;
public class InterleavingString {
    public static boolean Interleave(String s1, String s2, String s3) {
        if(s1.length() + s2.length() != s3.length()) {
            return false;
        }

        Boolean[][] dp = new Boolean[s1.length() + 1][s2.length() + 1];
        return solve(0, 0 , s1, s2, s3, dp);
    }
    public static boolean solve(int i, int j, String s1, String s2, String s3, Boolean[][] dp) {
        if(i == s1.length() && j == s2.length()) {
            return true;
        }

        boolean ans = false;
        if(i < s1.length() && s1.charAt(i) == s3.charAt(i+j)) {
            ans = ans || solve(i+1, j, s1, s2, s3, dp);
        }
        if(j < s2.length() && s2.charAt(j) == s3.charAt(i+j)) {
            ans = ans || solve(i, j+1, s1, s2, s3, dp);
        }
        return ans;
    }
}
