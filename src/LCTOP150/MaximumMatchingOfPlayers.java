package LCTOP150;
import java.util.*;
public class MaximumMatchingOfPlayers {
    public static int MaximumMatching(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int i = 0;
        int j = 0;
        int matches = 0;

        while(i < players.length && j < trainers.length) {
            if(players[i] <= trainers[j]) {
                matches++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return matches;
    }
}
