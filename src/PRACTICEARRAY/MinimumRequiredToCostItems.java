package PRACTICEARRAY;
import java.util.*;
public class MinimumRequiredToCostItems {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long p1 = Math.min(cost1 + cost2, costBoth);
        long p2 = Math.min(cost1, costBoth);
        long p3 = Math.min(cost2, costBoth);
        int cnt = Math.min(need1, need2);

        int extra1 = need1 - cnt;
        int extra2 = need2 - cnt;
        long totalCost = (cnt * p1) + (extra1 * p2) + (extra2 * p3);
        return totalCost;

    }
}
