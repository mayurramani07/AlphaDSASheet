package LCTOP150;
import java.util.*;
public class BestTimeToBuyAndSell2 {
    public static int BunAndSell(int[] prices) {
        int sellOne = 0;
        int holdOne = Integer.MIN_VALUE;

        for(int price : prices) {
            sellOne = Math.max(sellOne, holdOne + price);
            holdOne = Math.max(holdOne, sellOne - price);

        }
        return sellOne;
    }
}
