package OneDimensionalDP;
import java.util.*;
public class FindMaxLength {
    public static int FindMax(int[] nums) {
        int even = 0;
        int odd = 0;
        int altEven = 0;
        int altOdd = 0;

        for(int num : nums) {
            if(num % 2 == 0) {
                even++;
                altEven += altOdd + 1;
            } else {
                odd++;
                altOdd += altEven + 1;
            }
        }
        return Math.max(Math.max(even, odd), Math.max(altOdd, altEven));
    }
}