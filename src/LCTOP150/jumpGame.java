package LCTOP150;
import java.util.*;
public class jumpGame {
    public static boolean canGame(int[] nums) {
        int n = nums.length;
        int finalPosition = n - 1;

        for(int idx = n - 2 ; idx>=0 ; idx--) {
            if(idx + nums[idx] >= finalPosition) {
                finalPosition = idx;
            }
        }
        return finalPosition == 0;
    }
}
