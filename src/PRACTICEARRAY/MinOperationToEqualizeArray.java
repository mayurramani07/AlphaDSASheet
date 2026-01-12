package PRACTICEARRAY;
import java.util.*;
public class MinOperationToEqualizeArray {
    public static int MinOperation(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }
        if(set.size() == 1) {
            return 0;
        } else {
            return 1;
        }
    }
}
