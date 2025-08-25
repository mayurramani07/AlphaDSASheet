package STRING1;
import java.util.*;
public class FindResultantArrayAfterRemovingAnagram {
    public static List<String> removeAnagram(String[] words) {
        List<String> result = new ArrayList<>();
        String prevWord = "";

        for(String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String Current = new String(chars);

            if(!Current.equals(prevWord)) {
                result.add(word);
                prevWord = Current;
            }
        }
        return result;
    }
}
