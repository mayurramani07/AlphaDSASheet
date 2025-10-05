package STRING6;
import java.util.*;
public class SumOfDigitsOfStringAfterConvert {
    public static int SumOfDigits(String s, int k) {
        StringBuilder numstr = new StringBuilder();

        for(char c : s.toCharArray()) {
            int value = c - 'a';
            numstr.append(value);
        }
        String current = numstr.toString();
        for(int i=0 ; i<k ; i++) {
            int sum = 0;
            for(char digit : current.toCharArray()) {
                sum += digit;
            }
            current = String.valueOf(sum);
        }
        return Integer.parseInt(current);
    }
}
