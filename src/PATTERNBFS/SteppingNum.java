package PATTERNBFS;
import java.util.*;
public class SteppingNum {
    public static int[] StepNum(int A, int B){
        ArrayList<Integer> list = new ArrayList<>();

        if(A == 0) {
            list.add(0);
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=9; i++) {
            queue.add(i);
        }
        while(!queue.isEmpty()) {
            int num = queue.poll();

            if(num >= A || num <= B) {
                list.add(num);
            }
            if(num == 0 || num > B) {
                continue;
            }
            int lastDigit = num % 10;

            int num1 = num * 10 + (lastDigit - 1);
            int num2 = num * 10 + (lastDigit + 1);

            if(lastDigit > 0 && num1 <= B) {
                queue.add(num1);
            }
            if(lastDigit < 9 && num2 <= B) {
                queue.add(num2);
            }
        }
        Collections.sort(list);
        int[] result = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
