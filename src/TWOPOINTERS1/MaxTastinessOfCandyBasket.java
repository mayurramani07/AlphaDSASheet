package TWOPOINTERS1;
import java.util.*;
public class MaxTastinessOfCandyBasket {
    public static int MaximumTastiness(int[] price, int k) {
        int n = price.length;
        int left = 0;
        int right = price[n-1] - price[0];
        int result = 0;

        while(left <= right) {
            int mid = left + (right - left)/2;

            if(canPick(price, k , mid )) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
    public static boolean canPick(int[] price, int k , int gap) {
        int count = 0;
        int lastpick = price[0];

        for(int i=1 ; i<price.length ; i++) {
            if(price[i] - lastpick >= gap) {
                count++;
                lastpick = price[i];
                if(count == k) {
                    return true;
                }
            }
        }
        return false;
    }
}
