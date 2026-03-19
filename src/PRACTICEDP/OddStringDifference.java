package PRACTICEDP;
import java.util.*;
public class OddStringDifference {
    public String oddString(String[] words) {
        List<int[]> list = new ArrayList<>();

        for(String word : words) {
            char[] ch = word.toCharArray();

            int[] result = new int[ch.length - 1];

            for(int i=0; i<ch.length; i++) {
                result[i] = ch[i + 1] - ch[i];
            }
            list.add(result);
        }
        for(int i=0; i<list.size(); i++) {
            int count = 0;

            for(int j=0; j<list.size(); j++) {
                if(Arrays.equals(list.get(i), list.get(j))) {
                    count++;
                }
            }
            if(count == 1) {
                return words[i];
            }
        }
        return "";
    }
}

//TIME COMPLEXITY : O(n^2 * m)
//SPACE COMPLEXITY : O(n * m)