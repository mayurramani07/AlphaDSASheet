package MATRIX;
import java.util.*;
public class Search2dMatrix2 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;

        int row  = 0;
        int col = n-1;

        while(row < m && col >= 0) {
            int current = matrix[row][col];
            if(current == target) {
                return true;
            } else if(current > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}

//STAIRCASE SEARCH O(m+n)
//Time Complexity : BINARY SEARCH O(m + n)
//Space Complexity : O(1)