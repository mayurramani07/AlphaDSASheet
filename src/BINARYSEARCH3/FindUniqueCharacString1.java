package BINARYSEARCH3;
import java.util.*;
public class FindUniqueCharacString1 {
    public static int FindUniqueCharacter(String s) {
        int[] count = new int[26];

        for(char ch : s.toCharArray()) {
            count[s.charAt(ch) - 'a']++;
        }

        for(int i=0 ; i<s.length() ; i++) {
            if(count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}

//TIME COMPLEXITY : O(n)
//SPACE COMPLEXITY : O(1)