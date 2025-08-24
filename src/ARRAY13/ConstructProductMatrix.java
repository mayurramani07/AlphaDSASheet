package ARRAY13;
import java.util.*;
public class ConstructProductMatrix {
    public static int[][] constructMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int size = m * n;


        int[] flat = new int[size];
        for(int i=0 ; i<m ; i++) {
            for(int j=0 ; j<n ; j++) {
                flat[i * n + j] = grid[i][j];
            }
        }

        int[] prefix = new int[size];
        int[] suffix = new int[size];
        int[] ans = new int[size];

        prefix[0] = 1;
        for(int i=1 ; i<size ; i++) {
            prefix[i] = prefix[i-1] * flat[i-1];
        }
        suffix[size - 1] = 1;
        for(int i=size - 2 ; i>=0 ; i--) {
            suffix[i] = suffix[i+1] * flat[i+1];
        }
        for(int i=0 ; i<size ; i++) {
            ans[i] = prefix[i] * suffix[i];
        }
        int[][] result = new int[m][n];
        for(int i=0 ; i<m ; i++) {
            for(int j=0 ; j<n ; j++) {
                result[i][j] = ans[i * n + j];
            }
        }
        return result;
    }
}
