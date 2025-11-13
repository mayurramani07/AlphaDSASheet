package LC4TOP150;
import java.util.*;
public class FruitsIntoBasket2 {
    public static int FruitsIntoBasket(int[] fruits, int[] baskets) {
        boolean[] used = new boolean[baskets.length];
        int unplaced = 0;

        for(int fruit : fruits) {
            boolean placed = false;
            for(int i=0; i< baskets.length ; i++) {
                if(!used[i] && baskets[i] >= fruit) {
                    used[i] = true;
                    placed = true;
                    break;
                }
            }
            if(!placed) {
                unplaced++;
            }
        }
        return unplaced;
    }
}
