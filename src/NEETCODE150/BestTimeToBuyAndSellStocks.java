package NEETCODE150;
import java.util.*;
public class BestTimeToBuyAndSellStocks {
    public static int BuyAndSellStock(int[] prices) {
        int sellOne = 0;
        int holdOne = Integer.MIN_VALUE;

        for(int price : prices) {
            sellOne = Math.max(sellOne , holdOne + price);
            holdOne = Math.max(holdOne , -price);
        }
        return sellOne;
    }
}