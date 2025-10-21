package LCTOP150;
import java.util.*;
public class RemoveElement {
    public static int RemoveElements(int[] nums, int val) {
        int i = 0;

        for(int num : nums) {
            if(num != val) {
                nums[i++] = num;
            }
        }
        return i;
    }
}
