package WEEKLYCONTESTQUESTIONS;
import java.util.*;
public class ReverseLetterSpecialCharacter {
    public static String reverseByType(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();

        List<Character> lower = new ArrayList<>();
        List<Character> specialCh = new ArrayList<>();

        for(char ch : s.toCharArray()) {
            if(ch >= 'a' && ch <= 'z') {
                lower.add(ch);
            } else {
                specialCh.add(ch);
            }
        }
        int i = lower.size() - 1;
        int j = specialCh.size() - 1;

        for(char ch : s.toCharArray()) {
            if(ch >= 'a' && ch <= 'z') {
                sb.append(lower.get(i--));
            } else {
                sb.append(specialCh.get(j--));
            }
        }
        return sb.toString();
    }
}
