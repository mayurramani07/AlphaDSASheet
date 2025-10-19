package LCTOP150;
import java.util.*;
public class TakeKOfEachCharacter {
    public static int TakeK(String s , int k) {
        int[] total = new int[k];

        for(char ch : s.toCharArray()) {
            total[ch - 'a']++;
        }
        if(total[0] < k || total[1] < k || total[2] < k) {
            return -1;
        }
        int n = s.length();
        int[] current = new int[k];
        int left = 0;
        int maxKeep = 0;

        for(int right = 0 ; right < n ; right++) {
            current[s.charAt(right) - 'a']++;

            while(left <= right && total[0] - current[0] < k || total[1] - current[1] < k || total[2] - current[2] < k) {
                current[s.charAt(left) - 'a']--;
                left++;
            }
            maxKeep = Math.max(maxKeep, right - left + 1);
        }
        return n - maxKeep;
    }
}
