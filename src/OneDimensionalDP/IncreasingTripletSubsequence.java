package OneDimensionalDP;
import java.util.*;
public class IncreasingTripletSubsequence {
    public static boolean IncreasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int num : nums) {
            if(first >= num) {
                first = num;
            } else if(second >= num) {
                second = num;
            } else {
                return true;
            }
        }
        return false;
    }
}
