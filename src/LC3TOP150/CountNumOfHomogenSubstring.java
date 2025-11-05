package LC3TOP150;
import java.util.*;
public class CountNumOfHomogenSubstring {
    public static int countHomogeneous(String s) {
        long count = 0;
        long current = 0;
        long mod = 1000000007;

        for(int i=1 ; i<s.length() ; i++) {
            if(s.charAt(i) == s.charAt(i-1)) {
                current++;
            } else {
                count += (current + (current + 1)) / 2;
                current = 1;
            }
        }
        count += (current * (current + 1)) / 2;
        return (int)(count % mod);
    }
}
