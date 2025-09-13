package STACKANDQUEUES5;
import java.util.*;
public class NumberOfStudentsUnableToEatLunch {
    public static int NumOfStudents(int[] students, int[] sanwiches) {
        int count0 = 0;
        int count1 = 0;

        for(int s : students) {
            if(s == 0) {
                count0++;
            } else {
                count1++;
            }
        }
        for(int sandwich : sanwiches){
            if(sandwich == 0) {
                if(count0 == 0) {
                    return count1;
                }
                count0--;
            } else {
                if(count1 == 0) {
                    return count0;
                }
                count1--;
            }
        }
        return 0;
    }
}
