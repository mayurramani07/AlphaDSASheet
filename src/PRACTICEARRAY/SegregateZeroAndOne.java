package PRACTICEARRAY;
import java.util.*;
public class SegregateZeroAndOne {
    public static int[] SegZeroAndOne(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int k = 0;

        for(int i=0 ; i<arr.length; i++) {
            if(arr[i] == 0) {
                ans[k] = 0;
                k++;
            }
        }
        for(int j=k; j<n; j++) {
            arr[j] = 1;
        }
        return ans;
    }
}
