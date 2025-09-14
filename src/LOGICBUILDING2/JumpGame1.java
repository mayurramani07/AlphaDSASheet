package LOGICBUILDING2;
import java.util.*;
public class JumpGame1 {
    public static boolean canJump(int[] nums) {
        int finalPosition = nums.length - 1;

        for(int i= nums.length - 2; i>=0 ; i--) {
            if(i + nums[i] >= finalPosition) {
                finalPosition = i;
            }
        }
        return false;
    }
}

//Time Complexity : O(n)
//Space Complexity : O(1)
