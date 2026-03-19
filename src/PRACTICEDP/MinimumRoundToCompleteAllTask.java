package PRACTICEDP;
import java.util.*;
public class MinimumRoundToCompleteAllTask {
    public static int MinRound(int[] tasks) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int task : tasks) {
            map.put(task, map.getOrDefault(task, 0) + 1);
        }

        int count = 0;
        for(int value : map.values()) {
            if(value == 1) {
                return -1;
            }
            count += (value + 2) / 3;
        }
        return count;
    }
}

//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(n)