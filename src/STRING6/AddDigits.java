package STRING6;
import java.util.*;
public class AddDigits {
    public static int AddDigit(int num) {
        while (num >= 10) {
            int sum = 0;
            while(num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
