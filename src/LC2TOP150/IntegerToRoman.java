package LC2TOP150;
import java.util.*;
public class IntegerToRoman {
    public static String IntToRom(int n) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M",  "CM", "D",  "CD", "C",  "XC", "L",
                "XL", "X",  "IX", "V",  "IV", "I"};

        StringBuilder sb = new StringBuilder();

        for(int i=0 ; i<values.length ; i++) {
            if(n == 0) {
                break;
            }
            while(n >= values[i]) {
                n -= values[i];
                sb.append(symbols[i]);
            }
        }
        return sb.toString();
    }
}
