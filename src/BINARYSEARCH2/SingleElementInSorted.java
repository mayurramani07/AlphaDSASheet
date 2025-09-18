package BINARYSEARCH2;
import java.util.*;
public class SingleElementInSorted {
    public static int SingleElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(SingleElement(nums));
    }
}

//Time Complexity : O(n)
//Space Complexity : O(1)