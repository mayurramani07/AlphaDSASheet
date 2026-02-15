package WEEKLYCONTESTQUESTIONS;
import java.util.*;
public class LargestEvenNumber {
    public static String LargestEvenNum(String s) {
        int right = s.length() - 1;

        while(right >= 0) {
            int lastDigitNum = s.charAt(right) - '0';
            if(lastDigitNum % 2 == 0) {
                return s.substring(0, right + 1);
            }
            right--;
        }
        return "";
    }
}
