package LOGICBUILDING150;
import java.util.*;
public class KthElementInArray {
    public static int KthElement(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> a - b);

        for(int i=0 ; i<arr.length ; i++) {
            pq.add(arr[i]);
            if(pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }
}

//Time Complexity : O(nklogk)
//Space Complexity : O(k)