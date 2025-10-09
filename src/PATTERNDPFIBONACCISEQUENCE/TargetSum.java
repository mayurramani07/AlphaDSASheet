package PATTERNDPFIBONACCISEQUENCE;
import java.util.*;
public class TargetSum {
    public static int TargetSumm(int[] nums, int target) {
        int count = 0;
        dfs(nums , 0 , 0, target);
        return count;
    }
    public static void dfs(int[] nums, int index, int sum, int target) {

    }
}
