package EXTRAQUESTIONS;
import java.util.*;
public class RemoveVowelFromString {
    public static String removeVowels(String s) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        StringBuilder sb = new StringBuilder();

        for(int i=0 ; i<s.length() ; i++) {
            char c = s.charAt(i);

            if(!set.contains(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
//Time Complexity : O(n)
//Space Complexity : O(n)