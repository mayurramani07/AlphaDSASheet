package EXTRAQUESTIONS;
import java.util.*;
public class NegativeTemperature {
    public static int NegativeTemp(int[] arr) {
        int count = 0;
        for(int i=0 ; i<arr.length ; i++) {
            if(arr[i] < 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(NegativeTemp(arr));
    }
}
