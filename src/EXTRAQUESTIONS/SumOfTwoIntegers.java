package EXTRAQUESTIONS;
import java.util.*;
public class SumOfTwoIntegers {
    public static int SumOfTWO(int a , int b) {
        int carry = a & b;
        a = a ^ b;
        b = carry << 1;

        return a;
    }
}
