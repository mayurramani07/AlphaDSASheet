package BINARYSEARCH3;
import java.util.*;
public class FindUniqueCharacterInString {
    public static int FindUnique(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i=0 ; i<s.length() ; i++) {
            if(map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}

//Time Complexity : O(n)
//Space Complexity : O(n)