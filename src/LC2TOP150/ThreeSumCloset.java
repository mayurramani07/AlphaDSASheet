package LC2TOP150;
import java.util.*;
public class ThreeSumCloset {
    public static int ClosetThreeSum(int[] arr, int target) {
        int n = arr.length;
        int diff = Integer.MAX_VALUE;
        int closet = 0;

        for(int i=0 ; i<n-2 ; i++) {
            int left = i + 1;
            int right = n - 1;

            while(left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if(Math.abs(sum - target) < diff) {
                    diff = Math.abs(sum - target);
                    closet = sum;
                } else if(sum < target) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return closet;
    }
}
