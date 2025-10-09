package PATTERNDPFIBONACCISEQUENCE;
import java.util.*;
public class FrogJump2 {
    public static int FrogJump(int[] stones) {
        int n = stones.length;
        int maxJump = 0;

        for(int i=2 ; i<n ; i++) {
            maxJump = Math.max(maxJump, stones[i] - stones[i-2]);
        }
        maxJump = Math.max(maxJump, stones[1] - stones[0]);
        return maxJump;
    }
}
