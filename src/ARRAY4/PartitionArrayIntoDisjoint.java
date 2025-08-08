package ARRAY4;
import java.util.*;
public class PartitionArrayIntoDisjoint {
    public static int PartitionArray(int[] nums) {
        int n = nums.length;

        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = nums[0];
        for(int i=1 ; i<nums.length ; i++) {
            prefix[i] = Math.max(prefix[i-1], nums[i]);
        }

        suffix[n-1] = nums[n-1];
        for(int i=1 ; i<nums.length ; i++) {
            suffix[i] = Math.min(suffix[i+1], nums[i]);
        }

        for(int i=1 ; i<= nums.length ; i++) {
            if(prefix[i] < suffix[i+1]) {
                return i+1;
            }
        }
        return -1;
    }
}


