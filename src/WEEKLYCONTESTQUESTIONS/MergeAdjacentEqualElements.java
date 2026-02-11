package WEEKLYCONTESTQUESTIONS;
import java.util.*;
public class MergeAdjacentEqualElements {
    public static List<Long> MergeAdjacent(int[] nums) {

        Stack<Long> stack = new Stack<>();
        for(long num : nums) {
            while(!stack.isEmpty() && stack.peek() == num) {
                long x = stack.pop();
                num += x;
            }
            stack.push(num);
        }
        List<Long> list = new ArrayList<>();
        while(!stack.isEmpty()) {
            list.add(stack.pop());
        }
        Collections.sort(list);
        return list;
    }
}
