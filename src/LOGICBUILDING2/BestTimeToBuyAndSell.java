package LOGICBUILDING2;
import java.util.*;
public class BestTimeToBuyAndSell {
    public static int BestTimeToBuyStocks(int[] prices) {
        int sellOne = 0;
        int holdOne = Integer.MAX_VALUE;

        for(int price : prices) {
            sellOne = Math.max(sellOne, holdOne + price);
            holdOne = Math.max(holdOne, -price);
        }
        return sellOne;
    }
}
