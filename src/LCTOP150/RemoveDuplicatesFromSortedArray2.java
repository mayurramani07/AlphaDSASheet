package LCTOP150;
import java.util.*;
public class RemoveDuplicatesFromSortedArray2 {
    public static int RemoveDuplicates(int[] arr) {
        int k = 0;

        for(int i=1; i<arr.length ; i++) {
            if(k < 2  || arr[i] != arr[k-2]) {
                arr[k++] = arr[i];
            }
        }
        return k;
    }
}
