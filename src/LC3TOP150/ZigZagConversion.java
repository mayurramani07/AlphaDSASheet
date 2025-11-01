package LC3TOP150;
import java.util.*;
public class ZigZagConversion {
    public static String Convert(String s, int numRow) {
        if(numRow == 1 || numRow >= s.length()) {
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRow];
        for(int i=0 ; i<numRow ; i++) {
            rows[i] = new StringBuilder();
        }

        int currRow = 0;
        boolean goingDown = false;

        for(char c : s.toCharArray()) {
            rows[currRow].append(c);
            if(currRow == 0 || currRow == numRow - 1) {
                goingDown = !goingDown;
            }
            currRow += goingDown ? 1 : -1;
        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder row : rows) {
            result.append(row);
        }
        return result.toString();
    }
}
