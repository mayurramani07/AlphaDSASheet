package WEEKLYCONTESTQUESTIONS;
import java.util.*;
public class FindSmallestLetterGreaterThanTarget {
    public static char FindSmallest(char[] letters, char target) {
        char ans = letters[0];
        int left = 0;
        int right = letters.length - 1;

        if(letters[right] <= target) {
            return ans;
        }
        while(left <= right) {
            int mid = left + (right - left) / 2;
            char ch= letters[mid];
            if(ch < target) {
                ans = ch;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
