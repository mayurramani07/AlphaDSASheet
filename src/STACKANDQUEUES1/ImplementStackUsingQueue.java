package STACKANDQUEUES1;
import java.util.*;
public class ImplementStackUsingQueue {
    static class MyStack {
        Queue<Integer> q = new LinkedList<>();

        public MyStack() {

        }

        public void push(int x) {
            q.add(x);
            int size = q.size();
            for (int i = 0; i < size - 1; i++) {
                q.add(q.remove());
            }
        }

        public int pop() {
            return q.poll();
        }

        public int top() {
            return q.peek();
        }

        public boolean empty() {
            return q.isEmpty();
        }
    }
}

//TIME COMPLEXITY : O(1)
//SPACE COMPLEXITY : O(n)