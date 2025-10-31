package LC2TOP150;
import java.util.*;
public class GiveTheLastWord {
    public static String GiveLastWord(String s) {
        s = s.trim();
        int i = s.length() - 1;

        StringBuilder sb = new StringBuilder();

        while(i >= 0 && s.charAt(i) != ' ') {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
