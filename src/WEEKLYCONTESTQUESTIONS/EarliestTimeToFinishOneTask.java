package WEEKLYCONTESTQUESTIONS;
import java.util.*;
public class EarliestTimeToFinishOneTask {
    public static int EarliestTime(int[][] tasks) {
        int earliest = Integer.MAX_VALUE;
        for(int[] task : tasks) {
            int finish = task[0] + task[1];
            earliest = Math.min(earliest, finish);
        }
        return earliest;
    }
}
