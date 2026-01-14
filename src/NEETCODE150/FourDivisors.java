package NEETCODE150;
import java.util.*;
public class FourDivisors {
    public static int FourDivisor(int[] nums) {
        int total = 0;

        for(int num : nums) {
            int count = 0;
            int sum  = 0;

            for(int i=0; i*i<=num; i++) {
                if(num % i == 0) {
                    int other = num / i;
                    count++;
                    sum += i;

                    if(i != other) {
                        count++;
                        sum += other;
                    }
                    if(count > 4) {
                        break;
                    }
                }
            }
            if(count == 4) {
                total += sum;
            }
        }
        return total;
    }
}
