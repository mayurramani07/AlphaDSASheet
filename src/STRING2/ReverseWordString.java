package STRING2;
import java.util.*;
public class ReverseWordString {
    public static String ReverseString(String str) {
        String[] words = str.trim().split("\\s+");
        int i = 0;
        int j = str.length() - 1;

        while(i < j) {
            String temp = words[i];
            words[i++] = words[j];
            words[j--] = temp;
        }
        return String.join(" ", words);
    }
}

//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(n)