package LC2TOP150;
import java.util.*;
public class TwoSneakyNumbers {
    public static int[] TwoSneaky(int[] arr) {
        int n = arr.length;
        int[] ans = new int[2];
        int index = 0;

        for(int i=0 ; i<n ; i++) {
            for(int j=i+1 ; j<n ; i++) {
                if(arr[i] == arr[j]) {
                    ans[index] = arr[i];
                    index++;
                }
            }
        }
        return ans;
    }
}

//TIME COMPLEXITY - O(n^2)
//Space Complexity : O(n)