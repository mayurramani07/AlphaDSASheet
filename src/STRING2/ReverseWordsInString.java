package STRING2;
import java.util.*;
public class ReverseWordsInString {
    public static String reverseWords(String s) {

        String[] words = s.trim().split("\\s+");
        Collections.reverse(Arrays.asList(words));

        return  String.join(" ", words);
    }
}
//Time Complexity : O(n)
//Space Complexity : O(n)