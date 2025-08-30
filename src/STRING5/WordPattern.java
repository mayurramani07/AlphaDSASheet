package STRING5;
import java.util.*;
public class WordPattern {
    public static boolean isPattern(String s, String pattern) {
        String[] words = s.split(" ");

        if(pattern.length() != words.length) {
            return false;
        }
        HashMap<Character, String> charToWords = new HashMap<>();
        HashMap<String, Character> wordsToChar = new HashMap<>();

        for(int i=0 ; i<pattern.length() ; i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if(!charToWords.containsKey(c)) {
                if(!charToWords.get(c).equals(word)) {
                    return false;
                }
            } else {
                charToWords.put(c, word);
            }

            if(wordsToChar.containsKey(word)) {
                if(wordsToChar.get(word) != c) {
                    return false;
                }
            } else {
                wordsToChar.put(word, c);
            }
        }
        return true;
    }
}
