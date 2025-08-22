package ARRAY11;
import java.util.*;
public class DetermineIfTwoEventsConflict {
    public static boolean haveConflict(String[] e1, String[] e2) {
        String start1 = e1[0], end1 = e1[1];
        String start2 = e2[0], end2 = e2[1];

        if(start1.compareTo(end2) <= 0 && start2.compareTo(end1) <= 0) {
            return true;
        }
        return false;
    }
}
