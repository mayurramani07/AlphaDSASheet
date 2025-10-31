package LC2TOP150;
import java.util.*;
public class MinNumOfIncrements {
    public static int MinNum(int[] target) {
        int operations = target[0];

        for(int i=1 ; i<target.length ; i++) {
            if(target[i] > target[i-1]) {
                operations += target[i] - target[i-1];
            }
        }
        return operations;
    }
}
