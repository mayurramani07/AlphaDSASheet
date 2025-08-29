package STRING4;
import java.util.*;
public class ReplaceWords {
    public static String replaceWords(List<String> dictionary , String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for(int i=0 ; i< words.length ; i++) {
            String word = words[i];
            String replacement = word;

            for(String root : dictionary) {
                if(word.startsWith(root)) {
                    replacement = root;
                }
            }
            result.append(replacement);
            if(i != words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
