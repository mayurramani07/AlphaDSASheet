package DAILYSTREAKQUESTIONS;
import java.util.*;
public class MinimumMovesToBalanceArray {
    public static long minMoves(int[] balance) {
        long sum = 0;
        int idx = -1;
        int n = balance.length;

        for(int i=0 ; i<balance.length ; i++) {
            sum += balance[i];
            if(balance[i] < 0) {
                idx = i;
            }
        }
        if(sum < 0) return -1;
        if(idx == -1) return 0;

        long val = balance[idx];
        int left = (idx - 1 + n) % n;
        int right = (idx + 1) % n;

        int dist = 1;
        long ans = 0;

        while(val < 0) {
            if(balance[left] > 0) {
                long take = Math.min(balance[left], -val);
                balance[left] -= take;
                val += take;
                ans += take * dist;
            }
            if(val < 0 && balance[right] > 0) {
                long take = Math.min(balance[right], -val);
                balance[right] -= take;
                val += take;
                ans += take * dist;
            }
            left = (left - 1 + n) % n;
            right = (right + 1) % n;
            dist++;
        }

        return ans;
    }
}
