package LOGICBUILDING3;
import java.util.*;
public class LengthOfLastWord {
    public static int LengthOfLast(String s) {
        s = s.trim();
        int length = 0;
        int i = s.length() - 1;

        while(i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }
}
