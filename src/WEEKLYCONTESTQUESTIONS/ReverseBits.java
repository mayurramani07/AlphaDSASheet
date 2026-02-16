package WEEKLYCONTESTQUESTIONS;
import java.util.*;
public class ReverseBits {
    public static int ReverseBit(int n) {
        int result = 0;

        for(int i=0; i<n; i++) {
            result <<= 1;
            result |= (n & 1);
            n >>>= 1;
        }
        return result;
    }
}
