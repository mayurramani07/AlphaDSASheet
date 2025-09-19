package TWOPOINTERS1;
import java.util.*;
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        String str = sb.toString();
        String reversed = sb.reverse().toString();
        return(str.equals(reversed));
    }
}
//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(n)