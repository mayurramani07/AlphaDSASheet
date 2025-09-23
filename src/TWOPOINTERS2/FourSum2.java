package TWOPOINTERS2;
import java.util.*;
public class FourSum2 {
    public static int FourSum(int[]nums1 , int[]nums2, int[]nums3, int[]nums4) {
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();

        for(int a : nums1) {
            for(int b : nums2) {
                int sum = a + b;


                map.put(sum, map.getOrDefault(sum, 0)+ 1);
            }
        }

        for(int c : nums3) {
            for(int d : nums4) {
                int sum = c + d;
                int target = -sum;

                if(map.containsKey(target)) {
                    count += map.get(target);
                }

            }
        }
        return count;
    }
}
