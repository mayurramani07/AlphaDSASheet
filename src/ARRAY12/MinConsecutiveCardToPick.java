package ARRAY12;
import java.util.*;
public class MinConsecutiveCardToPick {
    public static int MinConsecutiveCard(int[] cards) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int minLength = Integer.MAX_VALUE;

        for(int i=0 ; i<cards.length ; i++) {
            int card = cards[i];

            if(map.containsKey(card)) {
                int prevIndex = map.get(card);
                int length = i - prevIndex + 1;
                minLength = Math.min(minLength, length);
            }
            map.put(card , i);
        }
        return (minLength == Integer.MAX_VALUE) ? -1 : minLength;
    }
}

//Time Complexity : O(n)
//Space Complexity : O(n)