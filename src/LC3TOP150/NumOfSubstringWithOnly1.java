package LC3TOP150;
import java.util.*;
public class NumOfSubstringWithOnly1 {
    public static int SubstringContains1(String s) {
        long count = 0;
        long current = 0;
        long mod = 1000000007;

        for(char ch : s.toCharArray()) {
            if(ch == '1') {
                current++;
            } else {
                count += (current * (current + 1)) / 2;
                current = 0;
            }
        }
        count += (current * (current + 1) / 2);
        return (int)(count % mod);
    }
}
