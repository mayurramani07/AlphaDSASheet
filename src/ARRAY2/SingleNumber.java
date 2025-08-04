package ARRAY2;
import java.util.*;
public class SingleNumber {
    public static int SingleNum(int[] nums) {
        int result = 0;
        for(int num : nums) {
            result ^= num;
        }
        return result;
    }
}

//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(1)