package ARRAY11;
import java.util.*;
public class IntervalListIntersections {
    public static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> result = new ArrayList<>();
        int i = 0;
        int j = 0;

        while(i < firstList.length && j < secondList.length) {
            int start = Math.max(firstList[i][0], secondList[j][0]);
            int end = Math.min(firstList[i][1], secondList[j][1]);

            if(start <= end) {
                result.add(new int[]{start, end});
            }

            if(firstList[i][1] < secondList[j][1]) {
                i++;
            } else {
                j++;
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}

//Time Complexity : O(m+n)
//Space Complexity : O(m+n)