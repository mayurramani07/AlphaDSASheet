package ARRAY4;
import java.util.*;
public class OptimalPartitionOfString2 {
    public static void OptimalPartition(String s) {
        HashSet<Character> set = new HashSet<>();
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();

        for(char ch : s.toCharArray()) {
            if(set.contains(ch)) {
                result.add(current.toString());

                set.clear();
                current.setLength(0);
            }
            set.add(ch);
            current.append(ch);
        } if (current.length() > 0) {
            result.add(current.toString());
        }

    }
}
