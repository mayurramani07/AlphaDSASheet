package LC4TOP150;
import java.util.*;
public class OneAndTwoBitCharacters {
    public static boolean OneAndTwoBits(int[] bits) {
        int i = 0;

        while(i < bits.length) {
            if(bits[i] == 1) {
                i += 2;
            } else {
                i += 1;
            }
        }
        return i == bits.length - 1;
    }
}
