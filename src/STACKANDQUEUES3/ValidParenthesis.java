package STACKANDQUEUES3;
import java.util.*;
public class ValidParenthesis {
    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(char c : s.toCharArray()) {
            if(c == '(') {
                stack.push(')');
            }
            else if(c == '{'){
                stack.push('}');
            }
            else if(c == '[') {
                stack.push(']');
            }
            else if(stack.isEmpty() || stack.pop() != c) {
                return false;

            }
        }
        return true;
    }
}
