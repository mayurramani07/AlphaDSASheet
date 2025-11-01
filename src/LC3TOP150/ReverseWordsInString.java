package LC3TOP150;
import java.util.*;
public class ReverseWordsInString {
    public static String ReverseWord(String s) {
        String[] parts = s.trim().split("\\s+");
        int i = 0;
        int j = parts.length - 1;

        while(i < j) {
            String temp = parts[i];
            parts[i] = parts[j];
            parts[j] = temp;
            i++;
            j--;
        }
        return String.join(" ", parts);
    }
}
