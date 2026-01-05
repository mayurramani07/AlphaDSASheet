package PRACTICEARRAY;
import java.util.*;
public class MinimumLightToActivate {
    public static int solve(int[] A, int B) {
        int n = A.length;
        int i = 0;
        int count = 0;

        while(i < n) {
            int rightMost = -1;

            int left = Math.max(0, i - B + 1);
            int right = Math.min(n-1, i+B-1);

            for(int j=left; j<=right; j++) {
                if(A[i] == 1) {
                    rightMost = j;
                }
            }
            if(rightMost == -1) {
                return -1;
            }
            count++;
            i = rightMost + B;
        }
        return count;
    }
}
