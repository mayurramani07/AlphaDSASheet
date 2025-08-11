package ARRAY8;
import java.util.*;
public class DegreeOfArray {
    public static int DegreeOfAnArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int degree = 0;
        for(int val : map.values()) {
            degree = Math.max(degree, val);
        }
        int minLength = nums.length;

        for(int num : map.keySet()) {
            if(map.get(num) == degree) {
                int first = 0, last = nums.length - 1;
                for(int i=0 ; i<nums.length ; i++) {
                    if(nums[i] == num) {
                        first = i;
                        break;
                    }
                }
                for(int i=nums.length - 1 ; i>=0 ; i--) {
                    if(nums[i] == num) {
                        last = i;
                        break;
                    }
                }
                int length = last - first + 1;
                if(length < minLength) {
                    minLength = length;
                }
            }
        }
        return minLength;
    }
}

//Time Complexity : O(n)
//Space Complexity : O(1)

