package ARRAY8;
import java.util.*;
public class MaxTastinessOfCandyBasket {
    public static int MaxTastiness(int[] price, int k) {
        Arrays.sort(price);
        int n = price.length;
        int left = 0;
        int right = n-1;
        int result = 0;

        while(left <= right) {
            int mid = left + (right - left)/2;

            if(canPick(price, k , mid)) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
    public static boolean canPick(int[] price, int k , int gap) {
        int count = 1;
        int lastPick = price[0];

        for(int i=1 ; i<price.length ; i++) {
            if(price[i] - lastPick >= gap) {
                count++;
                lastPick = price[i];
                if (count == k) {
                    return true;
                }
            }
        }
        return false;
    }
}
