package LOGICBUILDING2;
import java.util.*;
public class JumpGame {
    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int maxReach = 0;


        for(int i=0 ; i<n ; i++) {
            if(i > maxReach) {
                return false;
            }

            for(int jump = 1 ; jump<nums[i] ; i++) {
                maxReach = Math.max(maxReach, i+jump);
            }
            if(maxReach >= n-1) {
                return true;
            }
        }
        return false;
    }
}
