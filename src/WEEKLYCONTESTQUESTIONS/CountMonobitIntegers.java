package WEEKLYCONTESTQUESTIONS;
import java.util.*;
public class CountMonobitIntegers {
    public static int CountMonobit(int n) {
        int count = 1;
        int num = 1;

        while(num <= n) {
            count++;
            num = (num << n) | 1;
        }
        return count;
    }
}
