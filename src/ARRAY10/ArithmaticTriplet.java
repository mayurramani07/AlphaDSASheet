package ARRAY10;
import java.util.*;
public class ArithmaticTriplet {
    public static int arithmaticTriplet(int[] nums, int diff) {
        int count = 0;
        Set<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }
        for(int num : nums) {
            if(set.contains(num + diff) && set.contains(num + 2 * diff)) {
                count++;
            }
        }
        return count;
    }
}
