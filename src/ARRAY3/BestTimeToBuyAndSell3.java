package ARRAY3;
import java.util.*;
public class BestTimeToBuyAndSell3 {
    public static int BestTime(int[] prices) {
        int firstSell = 0;
        int firstBuy = Integer.MIN_VALUE;
        int secondSell = 0;
        int secondBuy = Integer.MIN_VALUE;

        for(int price : prices) {
            firstSell = Math.max(firstSell, firstBuy + price);
            firstBuy = Math.max(firstBuy, -price);
            secondSell = Math.max(secondSell, secondBuy + price);
            secondBuy = Math.max(secondBuy, firstSell - price);
        }
        return secondSell;
    }
}
