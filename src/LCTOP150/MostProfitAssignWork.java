package LCTOP150;
import java.util.*;
public class MostProfitAssignWork {
    public static int MostProfit(int[] difficulty, int[] profit, int[] workers) {
        int total = 0;
        for (int i = 0; i < workers.length; i++) {
            int best = 0;
            for (int j = 0; j < difficulty.length; j++) {
                if (workers[i] >= difficulty[j]) {
                    best = Math.max(best, profit[j]);
                }
            }
            total += best;
        }
        return total;
    }
}
