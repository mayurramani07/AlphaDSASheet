package WEEKLYCONTESTQUESTIONS;
import java.util.*;
public class VowelConsonantScore {
    public static int VowelConsonant(String s) {
        int countVowel = 0;
        int countConsonant = 0;

        for(char ch : s.toCharArray()) {
            if(ch >= 'a' && ch <= 'z') {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    countVowel++;
                } else {
                    countConsonant++;
                }
            }
        }
        if(countConsonant == 0) {
            return 0;
        }
        return countVowel / countConsonant;
    }
}
