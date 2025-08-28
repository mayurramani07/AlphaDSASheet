package STRING3;
import java.util.*;
public class RestoreIPAddress {
    public static List<String> restoreIPAddresses(String s) {
        List<String> result = new ArrayList<>();
        dfs(s, 0 , 0, new ArrayList<>(), result);
        return result;
    }
    public static void dfs(String s, int index , int part, List<String> current, List<String> result) {
        if(part == 4) {
            if(index == s.length()) {
                result.add(String.join(".", current));
            }
            return;
        }
        for(int len = 1 ; len <= 3 && index + len <= s.length() ; len++) {
            String segment = s.substring(index, index+len);

            if(segment.length() > 1 && segment.startsWith("0")) {
                break;
            }
            int value = Integer.parseInt(segment);

            if(value > 255) {
                break;
            }
            current.add(segment);
            dfs(s, index + len, part + 1, current, result);

            current.remove(current.size() - 1);
        }

    }
}
