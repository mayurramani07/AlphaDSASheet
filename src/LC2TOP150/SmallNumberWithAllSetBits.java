package LC2TOP150;
import java.util.*;
public class SmallNumberWithAllSetBits {
    public static int smallNumber(int n) {
        int x = 1;

        while(x < n) {
            x = (x << 1) | 1;
        }
        return x;
    }
}
