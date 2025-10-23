package LCTOP150;
import java.util.*;
public class FirstUniqueCharacterInString {
    public static int FirstUnique(String str) {
        int[] freq = new int[26];

        for(char ch : str.toCharArray()) {
            freq[ch - 'a']++;
        }
        for(int i=0 ; i<str.length() ; i++) {
            if(freq[str.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
