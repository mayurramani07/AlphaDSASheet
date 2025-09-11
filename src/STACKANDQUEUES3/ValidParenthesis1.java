package STACKANDQUEUES3;
import java.util.*;
public class ValidParenthesis1 {
    public static boolean isValid(String s) {
        Deque<Character> Stack = new ArrayDeque<>();

        for(char c : s.toCharArray()) {
            if(c == '(') {
                Stack.push(')');
            }
            else if(c == '{') {
                Stack.push('}');
            }
            else if(c == '[') {
                Stack.push(']');
            }
            else if(Stack.isEmpty() || Stack.pop() != c) {
                return false;
            }
        }
        return Stack.isEmpty();
    }
}

//Time Complexity : O(n)
//Space Complexity : O(n)