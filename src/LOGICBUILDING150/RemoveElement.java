package LOGICBUILDING150;
import java.util.*;
public class RemoveElement {
    public static int RemovingElement(int[] nums, int val) {
        int i = 0;

        for(int num : nums) {
            if(num != val) {
                nums[i++] = num;
            }
        }
        return i;
    }
}

//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(1)