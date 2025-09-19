package TWOPOINTERS1;
import java.util.*;
public class TwoSum {
    public static int[] Twosum(int[] arr, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0 ; i<arr.length ; i++) {
            int complement = target - arr[i];

            if(map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }

            map.put(arr[i], i);
        }
        return new int[] {};
    }
}

//TIME COMPLEXITY : O(n)
//SPAE COMPLEXITY : O(n)