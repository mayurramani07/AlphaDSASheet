package LC2TOP150;
import java.util.*;
public class MiceAndCheese {
    public static int MouseCheese(int[] rewards1, int[] rewards2, int k) {
        int n = rewards1.length;

        int[] diff = new int[n];
        for(int i=0 ; i<n ; i++) {
            diff[i] = rewards1[i] - rewards2[i];
        }
        Arrays.sort(diff);

        int total = 0;
        for (int i = 0; i < n; i++) {
            total += rewards2[i];
        }
        for (int i = n - 1; i >= n - k; i--) {
            total += diff[i];
        }
        return total;
    }
}