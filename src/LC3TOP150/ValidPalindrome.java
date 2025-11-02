package LC3TOP150;
import java.util.*;
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if(Character.isLowerCase(left) != Character.isLowerCase(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
