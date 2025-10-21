package LCTOP150;
import java.util.*;
public class RemoveDuplicatesFromSortedArray {
    public static int RemoveDuplicates(int[] arr) {
        int k = 1;
        for(int i=1 ; i<arr.length ; i++) {
            if(arr[i] != arr[k-1]) {
                arr[k++] = arr[i];
            }
        }
        return k;
    }
}
