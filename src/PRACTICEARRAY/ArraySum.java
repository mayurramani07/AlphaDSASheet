package PRACTICEARRAY;
import java.util.*;
public class ArraySum {
    public static int[] SumArray(int[] A, int[] B) {
        int i = A.length - 1;
        int j = B.length - 1;
        int carry = 0;

        ArrayList<Integer> list = new ArrayList<>();
        if(i >= 0 || j>=0 || carry > 0) {

            int sum = carry;
            if(i >= 0) {
                sum += A[i];
                i--;
            }

            if(j >= 0) {
                sum += B[i];
                j--;
            }
            list.add(sum % 10);
            carry = sum / 10;

        }
        Collections.reverse(list);

        int[] ans = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            ans[k] = list.get(k);
        }

        return ans;
    }
}

