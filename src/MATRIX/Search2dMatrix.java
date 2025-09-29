package MATRIX;
import java.util.*;
public class Search2dMatrix {
    public static boolean SearchMatrix(int[][] matrix , int target) {
        for(int i=0 ; i<matrix.length ; i++) {
            for(int j=0 ; j<matrix.length ; j++) {
                if(matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
