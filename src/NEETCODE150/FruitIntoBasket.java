package NEETCODE150;
import java.util.*;
public class FruitIntoBasket {
    public static int FruitBasket(int[] fruits) {
        int left = 0;
        int maxFruit = 0;
        HashMap<Integer,Integer> basket = new HashMap<>();

        for(int right=0; right<fruits.length; right++) {
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);

            if(basket.size() > 2) {
                basket.put(fruits[right], basket.get(fruits[left]) - 1);

                if(basket.get(fruits[left]) == 0) {
                    basket.remove(fruits[left]);
                }
                left++;
            }
            maxFruit = Math.max(maxFruit, right - left + 1);
        }
        return maxFruit;
    }
}
