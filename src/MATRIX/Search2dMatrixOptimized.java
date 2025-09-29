package MATRIX;
import java.util.*;
public class Search2dMatrixOptimized {
    public static boolean SearchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0;
        int right = m * n - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            // Convert 1D mid into 2D indices
            int row = mid / n;
            int col = mid % n;

            int value = matrix[row][col];

            if(value == target) {
                return true;
            } else if(value < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}

//TIME COMPLEXITY : O(log(mn);
//SPACE COMPLEXITY : O(1)