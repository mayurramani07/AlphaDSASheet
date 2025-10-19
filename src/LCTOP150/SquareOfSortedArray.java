package LCTOP150;
import java.util.*;
public class SquareOfSortedArray {
    public static int[] SquareSorted(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int left = 0;
        int right = nums.length - 1;
        int pos = n - 1;


        while(left <= right) {
            if(Math.abs(nums[left]) > nums[right]) {
                arr[pos] = nums[left] * nums[left];
                left++;
            }
            else {
                arr[pos] = nums[right] * nums[right];
                right--;
            }
        }
        return arr;
    }
}
