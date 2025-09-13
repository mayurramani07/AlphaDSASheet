package STACKANDQUEUES5;
import java.util.*;
public class ReverseFirstKOfQueue {
    public static void ReverseFirstK(Queue<Integer> queue, int k) {
        if(queue.isEmpty() || k <= 0 || k > queue.size()) {
            return;
        }
        Stack<Integer> stack = new Stack<>();

        for(int i=0 ; i<k ; i++) {
            stack.push(queue.remove());
        }
        while(!stack.empty()) {
            queue.add(stack.pop());
        }
        int size = queue.size();
        for(int i=0 ; i<size-k ; i++) {
            queue.add(queue.poll());
        }
    }
}
