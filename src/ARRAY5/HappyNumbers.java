package ARRAY5;
import java.util.*;
public class HappyNumbers {
    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n != 1) {
            if(set.contains(n)) {
                return false;
            }
            set.add(n);
            n = getNext(n);
        }
        return true;
    }
    public static int getNext(int num) {
        int sum = 0;
        while(num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}

//Time Complexity : O(n)
//Space Complexity : O(n)