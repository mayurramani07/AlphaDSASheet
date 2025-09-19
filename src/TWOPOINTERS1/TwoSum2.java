package TWOPOINTERS1;
import java.util.*;
public class TwoSum2 {
    public static int[] twosum(int[] numbers , int target) {
        for(int i=0 ; i<numbers.length ; i++) {
            int left = i + 1;
            int right = numbers.length - 1;
            int need = target - numbers[i];


            while(left < right) {
                int mid = (left + right) / 2;

                if(numbers[mid] == need) {
                    return new int [] {i+1 , mid+1};
                } else if(numbers[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return new int[] {-1, -1};
    }
}

//TIME COMPLEXITY : O(nlogn)
//SPACE COMPLEXITY : O(1)