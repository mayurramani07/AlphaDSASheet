package STACKANDQUEUES4;
import java.util.*;
public class FirstLetterToAppearTwice {
    public static char repeatedCharacter(String s) {
        HashSet<Character> set = new HashSet<>();

        for(char ch : s.toCharArray()){
            if(set.contains(ch)) {
                return ch;
            }
            set.add(ch);
        }
        return ' ';
    }
}

//Time Complexity : O(n)
//Space Complexity : O(n)