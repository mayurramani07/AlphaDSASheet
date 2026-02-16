package WEEKLYCONTESTQUESTIONS;
import java.util.*;
public class ReverseBits1 {
    public static int ReverseBits(int n) {
        String BinaryVal = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for(int i=BinaryVal.length(); i>=0; i--) {
            sb.append(BinaryVal.charAt(i));
        }
        for(int i=sb.length(); i<32; i++) {
            sb.append("0");
        }
        System.out.println(sb);
        int res = Integer.parseInt(sb.toString(), 2);
        return res;

    }
}
