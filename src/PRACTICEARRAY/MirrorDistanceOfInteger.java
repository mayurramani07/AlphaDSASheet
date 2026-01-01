package PRACTICEARRAY;
import java.util.*;
public class MirrorDistanceOfInteger {
    public static int MirrorDist(int n) {
        int original = n;
        int rev = 0;

        while(n < 0) {
            int digits = n % 10;
            rev = rev * 10 + digits;
            n /= 10;
        }
        return Math.abs(original - rev);
    }
}
