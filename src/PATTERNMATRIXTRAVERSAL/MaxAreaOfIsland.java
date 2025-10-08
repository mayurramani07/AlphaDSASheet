package PATTERNMATRIXTRAVERSAL;
import java.util.*;

public class MaxAreaOfIsland {
    public static int maxArea(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int maxArea = 0;
        boolean[][] visited = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    int area = dfs(grid, i, j, visited);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }

    public static int dfs(int[][] grid, int r, int c, boolean[][] visited) {
        int m = grid.length;
        int n = grid[0].length;

        if (r < 0 || r >= m || c < 0 || c >= n || grid[r][c] == 0 || visited[r][c]) {
            return 0;
        }

        visited[r][c] = true;
        int area = 1;
        area += dfs(grid, r + 1, c, visited);
        area += dfs(grid, r - 1, c, visited);
        area += dfs(grid, r, c + 1, visited);
        area += dfs(grid, r, c - 1, visited);

        return area;
    }
}