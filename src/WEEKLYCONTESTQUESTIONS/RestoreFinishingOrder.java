package WEEKLYCONTESTQUESTIONS;
import java.beans.PropertyEditorSupport;
import java.util.*;
public class RestoreFinishingOrder {
    public static int[] RestoreFinish(int[] order, int[] friends) {
        HashSet<Integer> set = new HashSet<>();
        for(int friend : friends) {
            set.add(friend);
        }

        List<Integer> list = new ArrayList<>();
        for(int id : friends) {
            if(set.contains(id)) {
                list.add(id);
            }
        }
        int[] result = new int[list.size()];
        for(int i=0 ; i<list.size() ; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
