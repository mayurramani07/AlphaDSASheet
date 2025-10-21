package LCTOP150;
import java.util.*;
public class MoveZeros {
    public static void moveZeros(int[] nums) {
        int i = 0;
        for(int num : nums) {
            if(num != 0) {
                nums[i++] = num;
            }
        }
        for(int j=i ; j<nums.length ; j++) {
            nums[j] = 0;
        }
    }
}
