package LCTOP150;
import java.util.*;
public class DefuseTheBomb {
    public static int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[k];

        if(k == 0) {
            Arrays.fill(code, 0);
            return result;
        }
        k %= n;

        for(int i=0 ; i<n ; i++) {
            int sum = 0;
            if(k > 0) {
                for(int j=1 ; j<=k ; j++) {
                    sum += code[(i+j) % n];
                }
            } else {
                for(int j=1 ; j <= -k ; j++) {
                    sum += code[(i - j + n) % n];
                }
            }
            result[i] = sum;
        }
        return result;
    }
}
