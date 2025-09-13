package LOGICBUILDING150;
import java.util.*;
public class MoveZeros {
    public static void MoveZero(int[] arr) {
        int interPos = 0;

        for(int i=0 ; i<arr.length ; i++) {
            if(arr[i] != 0) {
                arr[interPos] = arr[i];
                interPos++;
            }
        }
        for(int i=interPos ; i<arr.length ; i++) {
            arr[i] = 0;
        }
    }
}

//Time Complexity : O(n)
//Space Complexity : O(1)