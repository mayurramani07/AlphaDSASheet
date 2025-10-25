package LCTOP150;
import java.util.*;
public class JumpGame2 {
    public static int minJump(int[] nums) {
        int n = nums.length;
        int totalJump = 0;
        int finalDestination = n - 1;

        for(int idx = n - 2 ; idx>=0 ; idx--) {
            if(idx + nums[idx] >= finalDestination) {
                finalDestination = idx;
            }
        }
        return finalDestination == 0;
    }
}
