package STRING4;
import java.util.*;
public class ReverseString2 {
    public static String ReverseString(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        for(int i=0 ; i<n ; i+=2 * k) {
            int start = i;
            int end = Math.min(i + k - 1, n-1);

            while(start < end) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        return new String(arr);
    }
}
