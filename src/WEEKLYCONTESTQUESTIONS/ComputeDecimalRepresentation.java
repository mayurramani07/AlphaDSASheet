package WEEKLYCONTESTQUESTIONS;
import java.util.*;
public class ComputeDecimalRepresentation {
    public static int[] ComputeDecimal(int n) {
        List<Integer> result = new ArrayList<>();
        int place = 1;

        while(n > 0) {
            int digit = n % 10;
            if(digit != 0) {
                result.add(digit * place);
            }
            n /= 10;
            place *= 10;
        }
        Collections.sort(result, Collections.reverseOrder());

        int[] results = new int[result.size()];
        for(int i=0 ; i<result.size() ; i++) {
            results[i] = result.get(i);
        }
        return results;
    }
}
