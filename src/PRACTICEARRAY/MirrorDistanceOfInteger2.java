package PRACTICEARRAY;
import java.util.*;
public class MirrorDistanceOfInteger2 {
    public static int MirrorDist(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(n));
        String str = sb.reverse().toString();
        int x = Integer.parseInt(str);
        return Math.abs(x - n);
    }
}
