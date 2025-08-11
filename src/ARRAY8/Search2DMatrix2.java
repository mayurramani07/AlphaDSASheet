package ARRAY8;
import java.util.*;
public class Search2DMatrix2 {
    public static boolean SearchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) {
            return false;
        }
        int row = 0;
        int col = matrix[0].length;

        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == target) {
                return true;
            }
            else if (matrix[row][col] > target) {
                col--;
            }
            else {
                row++;
            }
        }
        return false;
    }
}

//Time Complexity : O(m+n)
//Space Complexity : O(1)