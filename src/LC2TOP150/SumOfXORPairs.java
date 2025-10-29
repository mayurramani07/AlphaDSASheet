package LC2TOP150;
import java.util.*;
public class SumOfXORPairs {
    public static int SumOfPairs(int[] arr) {
        int totalSum = 0;
        for(int i=0 ; i<arr.length ; i++) {
            for(int j=i+1 ; j<arr.length ; j++) {
                totalSum += arr[i] ^ arr[j];
            }
        }
        return totalSum;
    }
}
