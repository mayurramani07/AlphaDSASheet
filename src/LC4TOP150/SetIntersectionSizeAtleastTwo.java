package LC4TOP150;
import java.util.*;
public class SetIntersectionSizeAtleastTwo {
    public static int interSectionSizeTwo(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> {
            if(a[1] == b[1]){
                return b[0] - a[0];
            } return a[1] - b[1];
        });

        int ans = 2;
        int a = intervals[0][1] - 1;
        int b = intervals[0][1];

        for(int i=1 ; i<intervals.length ; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if(start > b) {
                ans += 2;
                a = end - 1;
                b = end;
            } else if(start > a) {
                ans += 2;
                a = b;
                a = end;
            }
            else {

            }
        }
        return ans;
    }
}
