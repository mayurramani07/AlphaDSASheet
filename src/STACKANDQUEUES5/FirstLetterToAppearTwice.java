package STACKANDQUEUES5;
import java.util.*;
public class FirstLetterToAppearTwice {
    public static int FirstLetterAppearTwice(String s) {
        boolean[] res = new boolean[26];

        for(char ch : s.toCharArray()) {
            int idx = ch - 'a';
            if(res[idx]) {
                return ch;
            }
            res[idx] = true;
        }
        return ' ';
    }
}

//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(1)