package NEETCODE150;
import java.util.*;
public class ValidParenthesis {
    public static boolean validParenthesis(String str) {

        Deque<Character> stack = new ArrayDeque<>();

        for(char ch : str.toCharArray()) {
            if(ch == '(') {
                stack.push(')');
            } else if(ch == '{') {
                stack.push('}');
            } else if(ch == '[') {
                stack.push(']');
            } else if(stack.isEmpty() && stack.pop() != ch) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
