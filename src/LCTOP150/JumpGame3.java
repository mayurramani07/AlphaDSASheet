package LCTOP150;
import java.util.*;
public class JumpGame3 {
    public static boolean JumpGame(int[] arr, int start) {
        int n = arr.length;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        while(!queue.isEmpty()) {
            int curr = queue.poll();

            if(arr[curr] == 0) {
                return true;
            }
            if(arr[curr] < 0) {
                continue;
            }

            if(curr + arr[curr] < n) {
                queue.add(curr + arr[curr]);
            }
            if(curr - arr[curr] >= 0) {
                queue.add(curr - arr[curr]);
            }
            arr[curr] = -arr[curr];
        }
        return false;
    }
}

//TIME COMPLEXITY : O(V+E)