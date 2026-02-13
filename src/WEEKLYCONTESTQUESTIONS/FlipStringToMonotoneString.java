package WEEKLYCONTESTQUESTIONS;
import java.util.*;
public class FlipStringToMonotoneString {
    public static int minFlipRequired(String s) {
        int n = s.length();
        int flips = 0;
        int countOnes = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '1') {
                countOnes++;
            } else {
                flips = Math.min(flips + 1, countOnes);
            }
        }
        return flips;
    }
}
