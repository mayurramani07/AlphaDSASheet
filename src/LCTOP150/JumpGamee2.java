package LCTOP150;
import java.util.*;
public class JumpGamee2 {
    public static int minJum(int[] nums) {
        int n = nums.length;
        int totalJump = 0;
        int destination = n - 1;
        int coverage = 0;
        int lastJumpIndex = 0;

        if(nums.length == 0) {
            return 1;
        }
        for(int i=0 ; i<n ; i++) {
            coverage = Math.max(coverage, i + nums[i]);

            if(i == lastJumpIndex) {
                lastJumpIndex = coverage;
                totalJump++;

                if(coverage >= destination) {
                    return totalJump;
                }
            }
        }
        return totalJump;
    }
}
