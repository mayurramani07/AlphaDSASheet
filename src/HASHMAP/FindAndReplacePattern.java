package HASHMAP;
import java.util.*;
public class FindAndReplacePattern {
    public static List<String> findAndReplacePatterns(String[] words, String pattern) {
        List<String> result = new ArrayList<>();

        for(String word : words) {
            if(matches(word,pattern)) {
                result.add(word);
            }
        }
        return result;
    }
    public static boolean matches(String word, String pattern) {
        if(pattern.length() != word.length()) {
            return false;
        }
        HashMap<Character, Character> pTow = new HashMap<>();
        HashMap<Character, Character> wToP = new HashMap<>();

        for(int i=0 ; i<word.length() ; i++) {
            char pChar = pattern.charAt(i);
            char wChar = word.charAt(i);

            if (pTow.containsKey(pChar)) {
                if (!pTow.get(pChar).equals(wChar)) {
                    return false;
                }
            } else {
                pTow.put(pChar, wChar);
            }
            if (wToP.containsKey(wChar)) {
                if (!wToP.get(wChar).equals(pChar)) {
                    return false;
                }
            } else {
                wToP.put(wChar, pChar);
            }
        }
        return true;
    }
}