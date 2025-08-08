package ARRAY4;
import java.util.*;
public class BestTimeToBuyAndSellCooldown {
    public static int BestTime(int[] prices) {
        if(prices == null || prices.length == 0) {
            return 0;
        }
        int n = prices.length;
        int hold = -prices[0];
        int sold = 0;
        int rest = 0;

        for(int i=1 ; i<prices.length ; i++) {
            int prevHold = hold;
            int prevSold = sold;
            int prevRest = rest;

            hold = Math.max(prevHold, prevRest - prices[i]);
            sold = prevHold + prices[i];
            rest = Math.max(prevRest, prevHold);
        }
        return Math.max(sold,rest);
    }
}

//Time Complexity : O(n)
//Space Complexity : O(1)