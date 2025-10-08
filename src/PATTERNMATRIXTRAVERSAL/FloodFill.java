package PATTERNMATRIXTRAVERSAL;
import java.util.*;
public class FloodFill {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];

        if(originalColor == color) {
            return image;
        }
        dfs(image, sr, sc , originalColor, color);
        return image;
    }
    public static void dfs(int[][] image, int r, int c, int originalColor, int newColor) {
        int m = image.length;
        int n = image[0].length;

        if(r < 0 || r >= m || c < 0 || c >= n) {
            return;
        }
        if(image[r][c] != originalColor) {
            return;
        }
        image[r][c] = newColor;

        dfs(image, r+1, c, originalColor, newColor);
        dfs(image, r-1 , c, originalColor, newColor);
        dfs(image, r, c+1, originalColor, newColor);
        dfs(image, r, c - 1, originalColor, newColor);
    }
}
