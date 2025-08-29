package STRING4;
import java.util.*;
public class ReplaceWords1 {
    public static String ReplaceWords(List<String> dictionary , String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i=0 ; i<words.length ; i++) {
            String word = words[i];


            for(String root : dictionary) {
                if(word.startsWith(root)) {
                    word = root;
                }
            }
            sb.append(word);
        }
        return sb.toString();
    }
}
