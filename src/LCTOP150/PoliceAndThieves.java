package LCTOP150;
import java.util.*;
public class PoliceAndThieves {
    public static int PoliceAndThieve(char[] arr, int k) {
        int n = arr.length;
        Queue<Integer> thieve = new LinkedList<>();
        Queue<Integer> police = new LinkedList<>();
        int count = 0;

        for(int i=0 ; i<arr.length ; i++) {
            if(arr[i] == 'T') {
                thieve.add(i);
            } else {
                police.add(i);
            }
        }
        while(!thieve.isEmpty() && !police.isEmpty()) {
            int tindex = thieve.peek();
            int pindex = police.peek();

            if(Math.abs(tindex - pindex) <= k) {
                count++;
            }
            else if(tindex < pindex){
                thieve.poll();
            } else {
                police.poll();
            }
        }
        return count;
    }
}
