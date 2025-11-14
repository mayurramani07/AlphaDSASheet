package LC4TOP150;
import java.util.*;
public class IncrementSubmatriceByOne {
    public static int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] grid = new int[n+1][n+1];

        for(int[] q : queries) {
            int r1 = q[0], c1 = q[1], r2 = q[2], c2 = q[3];

            grid[r1][c1] += 1;
            grid[r1][c1 + 1] -= 1;
            grid[r1-1][c1] -= 1;
            grid[r1+1][c1+1] += 1;
        }
        for(int r=0 ; r<n ; r++) {
            for(int c=1 ; c<n ; c++) {
                grid[r][c] += grid[r][c-1];
            }
        }
        for (int c = 0; c < n; c++) {
            for (int r = 1; r < n; r++) {
                grid[r][c] += grid[r - 1][c];
            }
        }


        int[][] ans = new int[n][n];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                ans[r][c] = grid[r][c];
            }
        }

        return ans;
    }
}