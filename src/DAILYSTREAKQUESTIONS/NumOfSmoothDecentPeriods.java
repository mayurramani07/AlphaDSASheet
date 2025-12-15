package DAILYSTREAKQUESTIONS;
import java.util.*;
public class NumOfSmoothDecentPeriods {
    public static long getDescent(int[] prices) {
        long count = 1;
        long len = 1;

        for(int i=0 ; i<prices.length ; i++) {
            if(prices[i] == prices[i-1] - 1) {
                len++;
            } else {
                len = 1;
            }
            count += len;
        }
        return count;
    }
}
