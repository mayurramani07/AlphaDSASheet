package BACKTRACKING;
import java.util.*;
public class LetterCombinationOfPhoneNum {
    public List<String> letterCombination(String digit) {
        List<String> result = new ArrayList<>();
        if(digit == null || digit.length() == 0) {
            return result;
        }
        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        backtrack(result, new StringBuilder(), digit, 0, map);
        return result;
    }
    public static void backtrack(List<String> result, StringBuilder current, String digits, int index , String[] map) {
        if(index == digits.length()) {
            result.add(current.toString());
            return;
        }
        String letters = map[digits.charAt(index) - '0'];
        for(char c : letters.toCharArray()) {
            current.append(c);
            backtrack(result, current, digits, index + 1, map);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
