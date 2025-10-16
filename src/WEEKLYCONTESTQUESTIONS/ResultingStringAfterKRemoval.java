package WEEKLYCONTESTQUESTIONS;
import java.util.*;
public class ResultingStringAfterKRemoval {
    public static String resultingString(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(char c : s.toCharArray()) {
            if(!stack.isEmpty() && isConsecutive(stack.peekLast() , c)) {
                stack.pollLast();
            } else {
                stack.add(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : stack) {
            sb.append(ch);
        }
        return sb.toString();
    }
    public static boolean isConsecutive(char a, char b) {
        int diff = Math.abs(a - b);
        return diff == 1 || diff == 25;
    }
}
