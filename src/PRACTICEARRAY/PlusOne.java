package PRACTICEARRAY;
import java.util.*;
public class PlusOne {
    public static int[] Plusone(int[] digits) {
        int n = digits.length;
        for(int i=0; i<n; i++) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[n+1];
        res[0] = 1;
        return res;
    }
}
