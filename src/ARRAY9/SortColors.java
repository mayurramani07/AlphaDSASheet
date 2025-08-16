package ARRAY9;
import java.util.*;
public class SortColors {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int index = 0;

        while(start <= end) {
            if(nums[index] == 0) {
                swap(nums, index, start);
                index++;
                start++;
            }
            else if(nums[index] == 1) {
                swap(nums, index, end);
                    end--;
            }
            else {
                index++;
            }
        }
    }
}
