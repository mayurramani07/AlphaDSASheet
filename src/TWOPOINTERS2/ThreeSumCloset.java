package TWOPOINTERS2;
import java.util.*;
public class ThreeSumCloset {
    public static int ClosetOfThreeSum(int[] arr, int target) {
        int diff = Integer.MAX_VALUE;
        int closet = 0;
        Arrays.sort(arr);

        for(int i=0 ; i<arr.length - 2 ; i++) {
            int left = i + 1;
            int right = arr.length - 1;

            while(left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if(sum == target) {
                    return target;
                }

                if(Math.abs(sum - target) < diff) {
                    diff = Math.abs(sum - target);
                    closet = sum;
                }
                if(target < sum) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return closet;
    }
}

//TIME COMPLEXITY : O(nlogn)
//SPACE COMPLEXITY : O(n)