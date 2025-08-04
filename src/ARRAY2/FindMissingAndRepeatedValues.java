package ARRAY2;
import java.util.*;
public class FindMissingAndRepeatedValues {
    public static int[] findMissingAndRepeated(int[][] grid) {
        int n = grid.length;
        int nsquared = n * n;

        int[] count = new int[n+1];
        for(int[] row : grid) {
            for(int num : row) {
                count[num]++;
            }
        }
        int repeated = -1;
        int missing = -1;

        for(int i=1 ; i<=nsquared ; i++) {
            if(count[i] == 2) {
                repeated = i;
            }
            if(count[i] == 0) {
                missing = i;
            }
        }
        return new int[]{repeated,missing};
    }
}

//Time Complexity : O(n^2)
//Space Complexity : O(n^2)