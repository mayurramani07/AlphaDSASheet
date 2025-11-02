package LC3TOP150;
import java.util.*;
public class CountUnguardedCellsInGrid {
    public static int CountUnguardedCell(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];

        for (int[] g : grid) {
            grid[g[0]][g[1]] = 1;
        }

        for (int[] w : walls) {
            walls[w[0]][w[1]] = 2;
        }

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        for (int[] guard : guards) {
            int x = guard[0], y = guard[1];
            for (int[] dir : directions) {
                int i = x + dir[0], j = y + dir[1];
                while (i >= 0 && i < m && j >= 0 && j < n && grid[i][j] != 1 && grid[i][j] != 2) {
                    if (grid[i][j] == 0) {
                        grid[i][j] = 3;
                    }
                    i += dir[0];
                    j += dir[1];
                }
            }
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}