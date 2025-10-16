package WEEKLYCONTESTQUESTIONS;
import java.util.*;
public class FindMinLogTransportationCost {
    public static long minimumCuttingCost(int m, int n, int k) {
        long cost = 0;

        if(n <= k && m <= k) {
            return 0;
        }
        if(n > k) {
            long part1 = n - k;
            long part2 = k;
            cost += part1 * part2;
        }
        if(m > k) {
            long part1 = m - k;
            long part2 = k;
            cost += part1 * part2;
        }
        return cost;
    }
}
