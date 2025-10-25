package LCTOP150;
import java.util.*;
public class HIndex {
    public static int Hindex(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1;
        int h = 0;

        for(int i=0 ; i<nums.length ; i++) {
            int papers = n - i;
            if(nums[i] >= papers) {
                h = papers;
            } else {
                break;;
            }
        }
        return h;
    }
}
