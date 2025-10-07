package PATTERNDPFIBONACCISEQUENCE;
import java.util.*;
public class MinimumRoundToCompleteTasks {
    public static int MinRound(int[] tasks) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int task : tasks) {
            map.put(task, map.getOrDefault(task,0) + 1);
        }
        int round = 0;
        for(int count : map.values()) {
            if(count == 1) {
                return -1;
            }
            round += (count + 2) / 3;
        }
        return round;
    }
}
