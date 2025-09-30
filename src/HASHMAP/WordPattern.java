package HASHMAP;
import java.util.*;
public class WordPattern {
    public static boolean WordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if(pattern.length() != s.length()) {
            return false;
        }
        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordTochar = new HashMap<>();

        for(int i=0 ; i<pattern.length() ; i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if(charToWord.containsKey(c)) {
                if(!charToWord.get(c).equals(word)) {
                    return false;
                }
            } else {
                charToWord.put(c,word);
            }
            if(wordTochar.containsKey(word)) {
                if(wordTochar.get(word) != c) {
                    return false;
                }
            } else {
                wordTochar.put(word, c);
            }
        }
        return true;
    }
}
