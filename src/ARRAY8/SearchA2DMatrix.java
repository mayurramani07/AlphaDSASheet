package ARRAY8;
import java.util.*;
public class SearchA2DMatrix {
    public static boolean Search2dMatrix(int[][] matrix , int target) {
        for(int i=0 ; i<matrix.length ; i++) {
            for(int j=0 ; j<matrix[0].length ; j++ ) {
                if(matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}

//Time Complexity : O(log(m*n))
//Space Complexity : O(1)