package STRING2;
import java.util.*;
public class RemoveAllOccOfSubstring {
    public static String removeOccurrences(String s, String part) {
        while(s.contains(part)) {
            s.replaceFirst(part, "");
        }
        return s;
    }
}

//TIME COMPLEXITY : O(n^2)
//SPACE COMPLEXITY : O(n)