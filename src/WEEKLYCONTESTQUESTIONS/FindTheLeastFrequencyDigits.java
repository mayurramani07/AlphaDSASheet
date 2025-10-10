package WEEKLYCONTESTQUESTIONS;
import java.util.*;
public class FindTheLeastFrequencyDigits {
    public static int FindLeastFrequencies(int n) {
        int[] freq = new int[10];
        int num = n;
        while(num > 0) {
            int digit = num % 10;
            freq[digit]++;
            num /= 10;
        }
        int minNum = Integer.MAX_VALUE;
        int ans = 0;
        for(int i=0 ; i<9 ; i++) {
            if(freq[i] > 0 && freq[i] < minNum) {
                minNum = freq[i];
                ans = i;
            }
        }
        return ans;
    }
}
