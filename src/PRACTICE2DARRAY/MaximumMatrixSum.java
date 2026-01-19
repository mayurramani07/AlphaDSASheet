package PRACTICE2DARRAY;
import java.util.*;
public class MaximumMatrixSum {
    public static long maxMatrixSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        long count = 0;
        long smallest = Integer.MAX_VALUE;
        long sum = 0;


        for(int i=0; i<m ; i++) {
            for(int j=0; j<n; j++) {
                if(matrix[i][j] < 0) {
                    count++;
                }
                long val = Math.abs(matrix[i][j]);
                smallest = Math.min(smallest, val);
                sum += val;
            }
        }
        if(count % 2 == 0) {
            return sum;
        }
        return sum - 2 * smallest;
    }
}
