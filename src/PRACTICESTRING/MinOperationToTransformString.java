package PRACTICESTRING;
import java.util.*;
public class MinOperationToTransformString {
    public static int MinOperation(String s) {
        int maxSteps = 0;

        for(char ch : s.toCharArray()) {
            int steps = ch - 'z' + 1;
            maxSteps = Math.max(steps, maxSteps);
        }
        return maxSteps;
    }
}
