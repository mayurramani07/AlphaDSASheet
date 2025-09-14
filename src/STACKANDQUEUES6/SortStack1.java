package STACKANDQUEUES6;
import java.util.*;
public class SortStack1 {
    public Stack<Integer> sort(Stack<Integer> s) {
        Stack<Integer> temp = new Stack<>();

        while(!s.isEmpty()) {
            int curr = s.pop();


            while(!temp.isEmpty() && temp.peek() < curr) {
                s.push(temp.pop());
            }
            temp.push(curr);
        }
        return temp;
    }
}
