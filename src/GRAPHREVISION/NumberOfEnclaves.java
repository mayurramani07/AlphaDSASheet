package GRAPHREVISION;
import java.util.*;
public class NumberOfEnclaves {
    static int m;
    static int n;
    public static int numEnclaves(int[][] grid) {
        m = grid.length;
        n = grid[0].length;

        for(int i=0 ; i<m ; i++) {
            dfs(grid, i, 0); // Top right
            dfs(grid, i, n-1); //Top left
        }

        for(int j=0 ; j<n ; j++) {
            dfs(grid, 0, j);
            dfs(grid, m-1, j);
        }
        int count = 0;
        for(int i=0 ; i<m ; i++) {
            for(int j=0 ; j<n ; j++) {
                if(grid[i][j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void dfs(int[][] grid, int i, int j) {
        if(i<0 || i >= m || j < 0 || j >= n || grid[i][j] == 0) {
            return;
        }
        grid[i][j] = 0;

        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }
}
