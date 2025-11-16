package LC4TOP150;
import java.util.*;
public class LongestPalindrome {
    public static int LongPalindrome(String s) {
        int[] freq = new int[128];

        for(char ch : s.toCharArray()) {
            freq[ch]++;
        }

        int length = 0;
        boolean oddFound = false;

        for(int count : freq) {
            if(count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                oddFound = true;
            }
        }
        if(oddFound) {
            length += 1;
        }
        return length;
    }
}
