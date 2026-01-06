package PRACTICEBITMANIPULATION;
import java.util.*;
public class SortIntByBinaryReflection {
    public static int[] SortBinaryRefl(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[][] arr = new int[n][2];

        for(int i=0; i<nums.length; i++) {
            String s = Integer.toBinaryString(nums[i]);
            String sb = new StringBuilder(s).reverse().toString();
            int x = Integer.parseInt(sb, 2);
            arr[i][0] = x;
            arr[i][1] = nums[i];
        }
        Arrays.sort(arr, (a,b) -> {
            if(a[0] != b[0]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });
        for(int i=0; i<n ; i++) {
            ans[i] = arr[i][1];
        }
        return ans;
    }
}
