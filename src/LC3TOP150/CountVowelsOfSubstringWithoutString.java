package LC3TOP150;
import java.util.*;
public class CountVowelsOfSubstringWithoutString {
    public static int countVowels(String word) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        int count = 0;

        for(int i=0 ; i<word.length() ; i++) {
            if(!vowels.contains(word.charAt(i))) {
                continue;
            }
            HashSet<Character> seen = new HashSet<>();

            for(int j=i ; j<word.length() ; j++) {
                char ch = word.charAt(i);
                if(!vowels.contains(ch)) {
                    break;
                }
                seen.add(ch);
                if (seen.size() == 5) {
                    count++;
                }
            }
        }

        return count;
    }
}