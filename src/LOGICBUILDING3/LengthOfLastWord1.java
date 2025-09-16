package LOGICBUILDING3;
import java.util.*;
public class LengthOfLastWord1 {
    public static int Length(String s) {
        s = s.trim();
        String[] words = s.split("//s+");

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0 ; i<words.length ; i++) {
            map.put(i, words[i].length());
        }
        return map.get(words.length - 1);
    }
}
