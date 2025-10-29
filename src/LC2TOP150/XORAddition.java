package LC2TOP150;
import java.util.*;
public class XORAddition {
    public static int AddXOR(int[] arr) {
        int result = 0;

        for(int i=0 ; i<arr.length ; i+=2) {
            int xorAdd = arr[i] ^ arr[i+1];
            result ^= xorAdd;
        }
        return result;
    }
}
