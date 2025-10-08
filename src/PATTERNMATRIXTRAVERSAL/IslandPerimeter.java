package PATTERNMATRIXTRAVERSAL;
import java.util.*;
public class IslandPerimeter {
    public static int CalPerimeter(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        boolean[][] visited = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    return dfs(grid, visited, i, j);
                }
            }
        }
        return 0;
    }

    public static int dfs(int[][] grid, boolean[][] visited, int r, int c) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (r < 0 || r >= rows || c < 0 || c >= cols || grid[r][c] == 0) {
            return 1;
        }
        if (visited[r][c]) {
            return 0;
        }

        visited[r][c] = true;

        int perimeter = 0;
        perimeter += dfs(grid, visited, r + 1, c);
        perimeter += dfs(grid, visited, r - 1, c);
        perimeter += dfs(grid, visited, r, c + 1);
        perimeter += dfs(grid, visited, r, c - 1);

        return perimeter;
    }
}