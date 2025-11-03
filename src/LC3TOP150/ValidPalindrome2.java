package LC3TOP150;
import java.util.*;
public class ValidPalindrome2 {
    public static boolean ValidPalindrome(String s) {
        int left = 0;
        int right = s.length();

        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
        }
        return false;
    }
    public static boolean isPalindrome(String s, int left, int right) {
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
