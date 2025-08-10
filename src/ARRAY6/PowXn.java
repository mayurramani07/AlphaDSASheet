package ARRAY6;
import java.util.*;
public class PowXn {
    public static double myPow(double x, long n) {
        if(n == 0) {
            return 1;
        }
        if(n < 0) {
            return 1 / myPow(x, -n);
        }
        if(n % 2 == 1) {
            return x * myPow(x*x , n/2);
        }
        return myPow(x*x, n/2);
    }
}
