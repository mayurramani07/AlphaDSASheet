package WEEKLYCONTESTQUESTIONS;
import java.util.*;
public class BitwiseORofEvenNumber {
    public static int BitwiseOR(int[] nums) {
        int result = 0;
        for(int num : nums) {
            if(num % 2 == 0) {
                result |= num;
            }
        }
        return result;
    }
}
