package STRING3;
import java.util.*;
public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> map = new HashSet<>();
        for(char j : jewels.toCharArray()) {
            map.add(j);
        }
        int count = 0;
        for(char s : stones.toCharArray()) {
            if(map.contains(s)) {
                count++;
            }
        }
        return count;
    }
}
