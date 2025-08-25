package STRING1;
import java.util.*;
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder result = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                result.append(Character.toLowerCase(c));
            }
        }
        String str = result.toString();
        String reversed = result.reverse().toString();
        return str.equals(reversed);
    }
}
