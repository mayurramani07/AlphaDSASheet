package LC4TOP150;
import java.util.*;
public class ThirdMaximumNumber {
    public static int MaxThirdNum(int[] nums) {
        Long first = null;
        Long second = null;
        Long third = null;

        for(int num : nums) {
            Long n = (long) num;

            if(n.equals(first) || n.equals(second) || n.equals(third)) {
                continue;
            }
            if(first == null || first < n) {
                third = second;
                second = first;
                first = n;
            }
            else if(second == null || second < n) {
                third = second;
                second = first;
            } else if(third == null || third < n) {
                third = n;
            }
        }
        return third == null ? first.intValue() : third.intValue();
    }
}
