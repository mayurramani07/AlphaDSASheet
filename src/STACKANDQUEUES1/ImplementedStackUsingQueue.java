package STACKANDQUEUES1;
import java.util.*;
public class ImplementedStackUsingQueue {
    static class MyStack{
        Queue<Integer> q = new LinkedList<>();

        public MyStack() {

        }
        public void push(int x) {
            q.add(x);
            int size = q.size();
            for(int i=1 ; i<q.size() ; i++) {
                q.add(q.remove());
            }
        }
        public int pop() {
            return q.remove();
        }
        public int peek() {
            return q.peek();
        }
        public boolean isEmpty() {
            return q.isEmpty();

        }
    }
}