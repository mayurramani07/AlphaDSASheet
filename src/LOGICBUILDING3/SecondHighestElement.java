package LOGICBUILDING3;
import java.util.*;
public class SecondHighestElement {
    public static int HighestElement(int[] arr) {
        int maxElement = 0;
        int secondMax = 0;
        for(int i=0 ; i<arr.length ; i++) {
            if(arr[i] > maxElement) {
                secondMax = maxElement
                maxElement = arr[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        int[] arr = {5,1,9,10,3,4};
        System.out.println(HighestElement(arr));
    }
}
