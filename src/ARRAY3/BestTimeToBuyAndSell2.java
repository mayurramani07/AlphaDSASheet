package ARRAY3;
import java.util.*;
public class BestTimeToBuyAndSell2 {
    public static int BuyAndSell(int[] prices) {
        int sellOne = 0;
        int holdOne = Integer.MIN_VALUE;

        for(int price : prices) {
            sellOne = Math.max(sellOne, holdOne + price);
            holdOne = Math.max(holdOne, sellOne - price);
        }
        return sellOne;
    }
}

//Time Complexity : o(n)
//Space Complexity : O(1)