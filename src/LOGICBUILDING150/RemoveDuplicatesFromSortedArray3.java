package LOGICBUILDING150;
import java.util.*;
public class RemoveDuplicatesFromSortedArray3 {
    public static int RemoveDuplicates(int[] arr) {
        int k = 0;

        for(int i=0 ; i<arr.length ; i++) {
            if(k < 2 || arr[i] != arr[k-2]) {
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }
}
