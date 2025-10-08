package PATTERNMATRIXTRAVERSAL;
import java.util.*;
public class NumberOfIslands {
    public static int NumOfIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        boolean[][] visited = new boolean[m][n];

        for(int i=0 ; i<m ; i++) {
            for(int j=0 ; j<n ; j++) {
                if(grid[i][j] == '1' && !visited[i][j]) {
                    dfs(grid, i, j, visited);
                    count++;
                }
            }
        }
        return count;
    }
    public static void dfs(char[][] grid, int r, int c,boolean[][] visited) {
        int rows = grid.length;
        int cols = grid[0].length;

        if(r < 0 || r >= rows || c < 0 || c >= cols || grid[r][c] == '0' || visited[r][c]) {
            return;
        }
        visited[r][c] = true;

        dfs(grid, r + 1, c, visited);
        dfs(grid, r - 1, c, visited);
        dfs(grid, r, c + 1, visited);
        dfs(grid, r, c - 1, visited);
    }
}



