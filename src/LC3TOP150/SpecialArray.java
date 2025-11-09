package LC3TOP150;
import java.util.*;
public class SpecialArray {
    public static boolean SpecialArray1(int[] nums) {
        for(int i=1 ; i<nums.length ; i++) {
            if((nums[i] % 2) == (nums[i-1] % 2)) {
                return false;
            }
        }
        return true;
    }
}